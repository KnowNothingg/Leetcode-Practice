class Solutions{
    
    public static int n;
    public static int m;

    public static int numIslands(char[][] grid) {
        n = grid.length;
        if(n == 0)  return 0;
        m = grid[0].length;

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    Helper(grid, i, j);
                    count++;
                }
            }
        }
        
        return count;
    }


    // Depth first search
    public static void Helper(char[][] grid, int i, int j){
        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == '0')     return;
        grid[i][j] = '0';           // drown the island that we found
        Helper(grid, i-1, j);
        Helper(grid, i+1, j);
        Helper(grid, i, j-1);
        Helper(grid, i, j+1);
    }
}