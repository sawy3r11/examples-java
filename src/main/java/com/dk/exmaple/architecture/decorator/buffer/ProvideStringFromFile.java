package com.dk.exmaple.architecture.decorator.buffer;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public interface ProvideStringFromFile {
    Reader getReader() throws IOException;
}
