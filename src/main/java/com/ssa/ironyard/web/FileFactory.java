package com.ssa.ironyard.web;

import java.io.File;

import org.springframework.stereotype.Component;
@Component
public interface FileFactory {
    
    File getInstance();
}
