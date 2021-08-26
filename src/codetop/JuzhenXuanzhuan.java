package codetop;

public class JuzhenXuanzhuan {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //初始化一个新的作为中间变量
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                //i->j,j->n-i-1
                matrix_new[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                //中间变量再返回
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }
}
