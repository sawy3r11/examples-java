package com.dk.exmaple.architecture.decorator.buffer;

import java.io.IOException;
import java.io.Reader;

public class ProviderDecorator implements ProvideStringFromFile{
    public static final String DISPLAY_FORMAT = "| %s | TIME: %s";
    private String label;
    private ProvideStringFromFile provideStringFromFile;

    public ProviderDecorator(String label, ProvideStringFromFile provideStringFromFile) {
        this.label = label;
        this.provideStringFromFile = provideStringFromFile;
    }

    @Override
    public Reader getReader() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        long start = System.nanoTime();
        Reader reader = provideStringFromFile.getReader();
        int charIntValue = 0;
        while ((charIntValue=reader.read()) != -1){
            stringBuilder.append((char) charIntValue);
        }
        long stop = System.nanoTime();
        long result = stop-start;
        System.out.println(String.format(DISPLAY_FORMAT, label, result));

        return reader;
    }
}
