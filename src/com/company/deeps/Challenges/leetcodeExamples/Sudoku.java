package com.company.deeps.Challenges.leetcodeExamples;

import java.util.HashSet;

public class Sudoku {
    public static void main(String[] args) {


        for (int k = 0; k < 9; k++) {
          //  floorEval(k,k);
        }


        String[][] board = new String[][]{{".", "9", ".", ".", ".", ".", ".", ".", "."}
                                        , {"6", ".", ".", "1", ".", "5", ".", ".", "."}
                                        , {".", "2", "8", ".", ".", ".", ".", "6", "."}
                                        , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                                        , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                                        , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                                        , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                                        , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                                        , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

        System.out.println(isValidSuduko(board));

        String[][] board1 = new String[][]{{"1", "2", "3", ".", ".", ".", ".", ".", "."}
                                        , {"4", "5", "6", "1", ".", "8", ".", ".", "."}
                                        , {"7", "8", "9", ".", ".", ".", ".", "6", "."}
                                        , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                                        , {".", ".", ".", "8", ".", "3", ".", ".", "1"}
                                        , {".", ".", ".", ".", "2", ".", ".", ".", "6"}
                                        , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                                        , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                                        , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

       // System.out.println(isValidSuduko(board1));
        readGrid(board1);

    }
    static void floorEval(int i,int j) {
        int ii = Math.floorDiv(i, 3);
        System.out.println("floor Div of "+i+" by 3 = "+ii+" ");
        int jj = Math.floorMod(j, 3);
        System.out.println("floor Mod of "+j+ " by 3 = " +jj +" ");
    }

    static boolean isValidSuduko(String[][] board) {
        HashSet<String> setRows;
        HashSet<String> setCols;
        HashSet<String> setGrid = null;
        int count = 2;
        for (int i = 0; i < board.length; i++) {
            setRows = new HashSet<>();
            setCols = new HashSet<>();
            setGrid = new HashSet<>();

            for (int j = 0; j < board.length; j++) {
                //Rows
                if (board[i][j] != ".") {
                    if (!setRows.add(board[i][j].trim())) {
                        System.out.println("Row " + i + " and col " + j);
                        return false;
                    }

                }
                //Cols
                if (board[j][i] != ".") {
                    if (!setCols.add(board[j][i].trim())) {
                        System.out.println("Col " + j + " and row " + i);
                        return false;
                    }
                }

                //3*3 grid
//                int rowIndex = i % 3; // 0, 1, 2;  3,4,5
//                int colIndex = // 0,1,2;
                //int box_i = 3*Math.floorDiv(i, 3)+Math.floor(j/3);
//                String _box = board[(int) (3*Math.floor(i/3)+Math.floor(j/3))][3*(i%3)+(j%3)];
//                        Math.floor(i/3)
//                if (board[i/3][j/3].trim() != ".") {
//                    //System.out.println(board[i][j]);a
//                    if (!setGrid.add(board[i][j].trim())) {
//                        System.out.println("Col " + j + " and row " + i);
//                        return false;
//                    }
//                }

            }
            }
        System.out.println(setGrid);
        return true;
    }

    static void readGrid(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[3 * Math.floorDiv(i,3) + Math.floorDiv(j,3) ][3 * (i%3) + (j%3) ]+"  ");
            }
            System.out.println();
        }
    }
}