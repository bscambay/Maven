package com.ssa.ironyard.web.sudoku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Board {
   
    String intialState;
    String solvedState;
    
    public Board() {
        // TODO Auto-generated constructor stub
    }

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
        
        return new SudokuSolver(board).solveBoard();
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
