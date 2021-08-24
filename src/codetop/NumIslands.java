package codetop;

public class NumIslands {
    public int numIsLand(char[][] grid){
        int nr= grid.length;
        int nc = grid[0].length;
        int result = 0 ;
        for(int i= 0;i<nr;i++){
            for(int j=0;j<nc;j++){
                //这句也忘了
                ++result;

                dfs(grid,i,j);
            }
        }
        return  result;
    }
    void dfs(char[][] grid,int r,int c){
        int nc = grid.length;
        int nr = grid[0].length;
        if(r>nc||c>nr || grid[r][c]=='0'){
            return;
        }
        //忘记了这一步
        grid[r][c]='0';

        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
//    public int numIslands(char[][] grid) {
//        if (grid == null || grid.length == 0) {
//            return 0;
//        }
//
//        int nr = grid.length;
//        int nc = grid[0].length;
//        int num_islands = 0;
//        for (int r = 0; r < nr; ++r) {
//            for (int c = 0; c < nc; ++c) {
//                if (grid[r][c] == '1') {
//                    ++num_islands;
//                    dfs(grid, r, c);
//                }
//            }
//        }
//
//        return num_islands;
//    }
//
//    void dfs(char[][] grid, int r, int c) {
//        int nr = grid.length;
//        int nc = grid[0].length;
//        //这一步是核心r>=nr.c>=nc grid[r][c]=0
//        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
//            return;
//        }
//
//        grid[r][c] = '0';
//        dfs(grid, r - 1, c);
//        dfs(grid, r + 1, c);
//        dfs(grid, r, c - 1);
//        dfs(grid, r, c + 1);
//    }



}
