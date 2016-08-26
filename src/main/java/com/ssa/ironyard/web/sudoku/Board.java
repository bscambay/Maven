package com.ssa.ironyard.web.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Board {
    Map<Integer, Box> boxes = new HashMap<>();
    String intialState;
    String solvedState;

    public Board(String initialState) {

        this.intialState = initialState;
        this.solvedState = solveBoard();

    }

    public String solveBoard() {
        String temp = this.getIntialState();

        String[][] board = new String[9][9];
        for (int i = 1; i < 10; i++)
            for (int j = 1; j < 10; j++) {
                board[i][j] = temp.substring(0, 1);
                temp = temp.substring(1);
            }
        
         String[][] tempBoard = board;
         for (int i = 1; i < 10; i++)
             for (int j = 1; j < 10; j++) { 
                 //no numbers exists in same rows & same columns same as (i) & 3x3 square (i) is currently in
                 if (){
                     //fill in the number
                 }
                     //numbers exists in same rows & same columns same as (i) & 3x3 square (i) is currently in
            if (){
              //discard (i) and repick other values (i++)
            }
            }
          }
          else {
            while (nx < 9) {
              Proceed to next row grid(nx++, ny)
              if (nx equals 9) {
                reset nx = 1
                proceed to next column grid(nx,ny++)
                if (ny equals 9) {
                  print solution
                }
              }
            }
          }

        return this.setSolvedState("");

    }

    public List<Integer> checkBoard(String check) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i < 82; i++)
            if (!(check.charAt(i) == 0))
                if (!(check.charAt(i) == this.solvedState.charAt(i)))
                    temp.add(i);

        return temp;
           
    }

    public String getIntialState() {
        return intialState;
    }

    public String getSolvedState() {
        return solvedState;
    }

    public String setSolvedState(String solvedState) {
        return this.solvedState = solvedState;
    }

}
