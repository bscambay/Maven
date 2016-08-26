package com.ssa.ironyard.web.trie;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrieController {

    @Autowired
    Text9Trie trie;

    public void setTrie(Text9Trie trie) {
        this.trie = trie;
    }

    @RequestMapping("/trie")
    @ResponseBody
    public List<String> suggestions(HttpServletRequest request) throws IllegalArgumentException {
        if (!Strings.isEmpty(request.getParameter("suggest"))){
            return trie.suggest(request.getParameter("suggest"));
        }else {      
            return Arrays.asList("not implemented yet");
        
    }
    }
}