package com.ssa.ironyard.web;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class WebFileFactory implements FileFactory {

    final String fileName;

    public WebFileFactory(@Value("easy-1.txt") String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public File getInstance() {
        URL resource = getClass().getClassLoader().getResource(fileName);
        try {
            return new File(resource.toURI());
        } catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
