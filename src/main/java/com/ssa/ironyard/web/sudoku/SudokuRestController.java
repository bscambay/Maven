package com.ssa.ironyard.web.sudoku;

import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssa.ironyard.web.trie.Text9Trie;

@RestController
public class SudokuRestController {
    @Autowired
    @Qualifier("default-games")
    Map<Integer, Board> games;

  
    @RequestMapping(produces = "application/json", value ="/sudoku/{difficulty}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> start(@PathVariable String difficulty) throws IllegalArgumentException {

        ResponseEntity.status(HttpStatus.CREATED);
        
        if (difficulty.equals("easy")) {
            return ResponseEntity.ok().body((games.get(1).getIntialState()));
        }

        if (difficulty.equals("medium")) {
            return ResponseEntity.ok().body(games.get(2).getIntialState());
        }

        return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.NOT_FOUND);

    }

    @RequestMapping("/sudoku/{gameID}")
    @ResponseBody
    public String gameState(HttpServletRequest request, @PathVariable String gameID) {
        String response = "Incorrect values at ";
        String current = request.getParameter("solution");
        response = response.concat("" + games.get(gameID).checkBoard(current));
        if (games.get(gameID).checkBoard(current).isEmpty())
            return "So far so good";
        return response;
    }

}
