package com.dk.exmaple.architecture.decorator.buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderProvider implements ProvideStringFromFile {
    @Override
    public Reader getReader() throws IOException {
        FileReader fileReader = new FileReader(Constants.FILENAME);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        return bufferedReader;
    }
}
