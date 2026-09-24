package com.example.dsa.java8;

import java.util.*;
class sudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }
        public static boolean isValidSudoku(char[][] board) {
//        Set<Character> row = new HashSet<>();
//        Set<Character> col = new HashSet<>();
        Map<Integer,Set<Character>> row = new HashMap<>();
        Map<Integer,Set<Character>> col = new HashMap<>();
        Map<Integer,Set<Character>> box = new HashMap<>();

        for(int r=0;r<board[0].length;r++){
            for(int c=0;c<board[0].length;c++){
                Character current = board[r][c];
                int boxN = (r/3)*3 + (c/3);
                if(current != '.'){
                    if((!row.computeIfAbsent(r, k -> new HashSet<>()).add(current))
                    || (!col.computeIfAbsent(c, k -> new HashSet<>()).add(current))
                    || (!box.computeIfAbsent(boxN, k -> new HashSet<>()).add(current))
                    ){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}