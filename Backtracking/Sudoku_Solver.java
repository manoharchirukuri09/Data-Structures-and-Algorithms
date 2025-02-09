public class Sudoku_Solver {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check the number in the row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }
        // Check the number in the column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // Check the number in the 3x3 grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSudoku(int sudoku[][], int row, int col) {
        // Base case: if we reach the 9th row, sudoku is solved
        if (row == 9) {
            return true;
        }
        
        // Move to the next row when the column reaches 9
        int nextrow = row, nextcol = col + 1;
        if (col == 8) {
            nextrow = row + 1;
            nextcol = 0;
        }

        // If the cell is already filled, move to the next one
        if (sudoku[row][col] != 0) {
            return isSudoku(sudoku, nextrow, nextcol);
        }

        // Try placing digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;  // Place the digit
                if (isSudoku(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;  // Backtrack if needed
            }
        }
        return false;
    }

    public static void PrintSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (isSudoku(sudoku, 0, 0)) {
            System.out.println("Sudoku solved:");
            PrintSudoku(sudoku);
        } else {
            System.out.println("Sudoku cannot be solved.");
        }
    }
}
