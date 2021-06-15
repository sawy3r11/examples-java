package com.dk.exmaple.architecture.decorator.buffer;

import java.io.IOException;
import java.util.Iterator;

public class Main {


    public static void main(String[] args) throws IOException {
        ProvideStringFromFile fileProvider = new ProviderDecorator(Constants.FILE_READER_LABEL, new FileReaderProvider());
        ProvideStringFromFile bufferedProvider = new ProviderDecorator(Constants.BUFFERED_READER_LABEL, new BufferedReaderProvider());

        for(int i=0; i<100; i++){
            fileProvider.getReader();
            bufferedProvider.getReader();
            System.out.println("==================================================");
        }
    }

}
