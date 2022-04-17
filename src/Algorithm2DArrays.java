public class Algorithm2DArrays
{
    public static String[][] gridOfXandO(int n)
    {
        String[][] grid = new String[n][n];
        String str = "X";

        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                grid[r][c] = str;
            }
        }
        grid[11][5] = "O";
        grid[0][0] = "*";
        grid[8][6] = "?";
        grid[6][2] = "?";
        grid[2][10] = "?";
        grid[0][2] = "?";

        //empty parts;
        grid[11][6] = " ";
        grid[11][7] = " ";
        grid[11][8] = " ";
        grid[11][9] = " ";
        grid[10][9] = " ";
        grid[9][9] = " ";
        grid[8][9] = " ";
        grid[8][8] = " ";
        grid[8][7] = " ";
        grid[8][5] = " ";
        grid[8][4] = " ";
        grid[8][3] = " ";
        grid[9][3] = " ";
        grid[10][3] = " ";
        grid[10][2] = " ";
        grid[10][1] = " ";
        grid[9][1] = " ";
        grid[8][1] = " ";
        grid[7][1] = " ";
        grid[6][1] = " ";
        grid[6][3] = " ";
        grid[6][4] = " ";
        grid[6][5] = " ";
        grid[6][6] = " ";
        grid[6][7] = " ";
        grid[6][8] = " ";
        grid[6][9] = " ";
        grid[6][10] = " ";
        grid[5][10] = " ";
        grid[4][10] = " ";
        grid[3][10] = " ";
        grid[1][10] = " ";
        grid[0][10] = " ";
        grid[0][9] = " ";
        grid[0][8] = " ";
        grid[0][7] = " ";
        grid[0][1] = " ";
        grid[1][7] = " ";
        grid[2][7] = " ";
        grid[3][7] = " ";
        grid[4][7] = " ";
        grid[4][6] = " ";
        grid[4][5] = " ";
        grid[4][4] = " ";
        grid[4][3] = " ";
        grid[4][2] = " ";
        grid[3][2] = " ";
        grid[2][2] = " ";
        grid[1][2] = " ";
        return grid;
    }

    public static void printGrid(String[][] grids) {
        for (String[] row : grids)
        {
            for (String val : row)
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
