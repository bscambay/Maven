package com.ssa.ironyard.web.sudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.ironyard.web.FileFactory;
import com.ssa.ironyard.web.WebFileFactory;

@RestController
public class SudokuRestController {
    @Autowired
    @Qualifier("default-props")
    Map<String, List<Board>> allProperties;

}
