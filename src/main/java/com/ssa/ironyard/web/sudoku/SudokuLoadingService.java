package com.ssa.ironyard.web.sudoku;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssa.ironyard.web.FileFactory;

@Component
public class SudokuLoadingService {
    static final Logger LOGGER = LogManager.getLogger(SudokuLoadingService.class);
    Map<Board,String> games = new HashMap<>();
    @Autowired
    public SudokuLoadingService(FileFactory ff, Board b) throws URISyntaxException {
        
        File file = ff.getInstance();
        
        LOGGER.debug("file {}, exists?{}", file, file.exists());
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(file.toPath());
            Charset.defaultCharset();

            String line;
            int i = 0;
            while (null != (line = reader.readLine()) && i++ < 10) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        
                    }
                }    
            }
            
        } catch (IOException iex) {
            System.err.println(iex);
            throw new RuntimeException(iex);
        } finally {
            if (null != reader)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    
        try{
           
        }
        catch(Exception e)
        {
            LOGGER.warn(e);
        }
        finally{
        
        }
    }
}
