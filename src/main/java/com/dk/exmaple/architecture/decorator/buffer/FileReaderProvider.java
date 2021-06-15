package com.dk.exmaple.architecture.decorator.buffer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderProvider implements ProvideStringFromFile {
    @Override
    public Reader getReader() throws IOException {
        FileReader fileReader = new FileReader(Constants.FILENAME);
        return fileReader;
    }
}
