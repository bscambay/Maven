package com.ssa.ironyard.web.sudoku;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Board {
    Map<Integer, Box> boxes = new HashMap<>();
    final String gameId;
    final String intialState;
    String solvedState;
    public Board(String gameId, String initialState) {
        
        
        this.gameId = gameId;
        this.intialState=initialState;
        this.solvedState =null;

    }
//    public String solveBoard(){
//        String temp = this.getIntialState();
//       
//        String[][] board = new String[9][9];
//        for(int i=1; i<10;i++)
//            for(int j=1;j<10;j++){               
//                board[i][j]= temp.substring(0, 1);
//                temp= temp.substring(1);
//            }     
//        
//        return this.setSolvedState("");
//        
//        
//    }
    public String getGameId() {
        return gameId;
    }
    public String getIntialState() {
        return intialState;
    }
    public String getSolvedState() {
        return solvedState;
    }
    public void setSolvedState(String solvedState) {
        this.solvedState = solvedState;
    }
    
}
