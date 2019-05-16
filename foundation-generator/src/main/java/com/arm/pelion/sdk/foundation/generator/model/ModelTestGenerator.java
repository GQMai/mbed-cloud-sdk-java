package com.arm.pelion.sdk.foundation.generator.model;

import java.io.File;
import java.util.Date;

import org.junit.Assert;

import com.arm.pelion.sdk.foundation.generator.util.CleanException;
import com.arm.pelion.sdk.foundation.generator.util.TranslationException;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.TypeSpec;

public class ModelTestGenerator extends AbstractGenerator {

    private static final String AUTOGENERATION_COMMENT = "This file was generated by the Pelion SDK foundation code generator.";
    private final ModelTest test;
    private boolean forceGeneration;

    /**
     * Constructor.
     * 
     * @param destinationDirectory
     *            The output location. If this is null then output will go to stdout instead.
     * @param test
     *            The model describing the test class to generate
     * @param forceGeneration
     *            if true the output file will be generated irrespective of whether custom code exists. If false,
     *            generation will be skipped if custom code exists.
     */
    public ModelTestGenerator(File destinationDirectory, ModelTest test, boolean forceGeneration) {
        super(null, destinationDirectory);
        this.test = test;
        this.forceGeneration = forceGeneration;
    }

    @Override
    public void generate() throws TranslationException {
        if (test == null) {
            return;
        }

        test.translate();
        logger.logInfo("Generating model unit test [" + test.getFullName() + "]");
        TypeSpec modelClass = test.getSpecificationBuilder().build();
        JavaFile file = JavaFile.builder(test.getPackageName(), modelClass).addFileComment(generateFileComment(test))
                                .addStaticImport(Assert.class, "*").build();
        try {
            File destinationFile = new File(testDestinationDirectory, file.toJavaFileObject().getName());
            if (testDestinationDirectory == null) {
                logger.logWarn("The destination directory for the generated code was not specified. It will hence only be output to Standard out.");
                file.writeTo(System.out);
            } else {
                logger.logInfo("Generating unit test file [" + destinationFile.getName() + "]");
                if ((test.containsCustomCode() || !forceGeneration) && destinationFile.exists()) {
                    logger.logInfo("The unit test file " + destinationFile.getName()
                                   + " is already present. Therefore, it won't be regenerated.");
                    return;
                }
                file.writeTo(testDestinationDirectory);
                logger.logInfo("Unit test [" + test.getFullName() + "] was generated as " + destinationFile.toString());
            }
        } catch (Exception exception) {
            throw new TranslationException(exception);
        }

    }

    private static String generateFileComment(ModelTest test) {
        StringBuilder builder = new StringBuilder();
        builder.append(AUTOGENERATION_COMMENT);
        if (test != null) {
            builder.append(System.lineSeparator());
            if (test.containsCustomCode()) {
                builder.append("This unit test suite was autogenerated on " + new Date()
                               + ". Feel free to change its contents as you wish.");
            } else {
                builder.append("This is an autogenerated unit test class. Do not modify its content as modifications will be lost at next code generation.");
            }
        }
        return builder.toString();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.arm.pelion.sdk.foundation.generator.AbstractGenerator#clean()
     */
    @Override
    public void clean() throws CleanException {
        // Nothing to do
    }

}
