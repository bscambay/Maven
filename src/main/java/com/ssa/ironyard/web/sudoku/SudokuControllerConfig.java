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
import org.springframework.context.annotation.Bean;

import com.ssa.ironyard.web.WebFileFactory;

public class SudokuControllerConfig {
    static final Logger LOGGER = LogManager.getLogger(SudokuControllerConfig.class);

    @Bean(name = "default-props")
    public Map<String, List<Board>> defaults() throws URISyntaxException, IOException
    {
        Map<String, List<Board>> allProperties = new HashMap<>();

        File propertyFile = new WebFileFactory("easy-1.txt").getInstance();
        
        LOGGER.debug("Got property file {}", propertyFile.toURI());

        BufferedReader reader = null;

        try
        {
            reader = Files.newBufferedReader(propertyFile.toPath(), Charset.defaultCharset());

            String line;

            while (null != (line = reader.readLine()))
            {
                //;
                
                            }
        }
        catch (IOException iex)
        {
            System.err.println(iex);
            throw iex;
        }
        finally
        {
            if (null != reader)
                reader.close();
        }
        
        return allProperties;
}
}
