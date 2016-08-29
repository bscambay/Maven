package com.ssa.ironyard.web.trie;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ssa.ironyard.web.FileFactory;

@Component
public class TrieLoadingService {
    static final Logger LOGGER = LogManager.getLogger(TrieLoadingService.class);
   
    @Autowired
    public TrieLoadingService(FileFactory ff, T9Trie t) throws URISyntaxException {
        
        File file = ff.getInstance();
        
        LOGGER.debug("file {}, exists?{}", file, file.exists());
        BufferedReader reader = null;
        try {
            reader = Files.newBufferedReader(file.toPath());
            Charset.defaultCharset();

            String line;
            int i = 0;
            while (null != (line = reader.readLine()) && i++ < 58109) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        t.addWord(word);

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
    public List<String> suggest(String digits)
    {
        return this.suggest(digits);
    }
}

