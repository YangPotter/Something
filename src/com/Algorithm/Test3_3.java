/*
 *动态规划，最长公共自序列（LCS）问题
 */
package com.Algorithm;

public class Test3_3 {
    public static void main(String[] args) {
        LCS l = new LCS();
        char[] x = {' ', 'A', 'B', 'C', 'B', 'D', 'A', 'B'};
        char[] y = {' ', 'B', 'D', 'C', 'A', 'B', 'A'};

        l.LCSLength(7, 6, x, y);
        l.LCS(7, 6, x);
    }
}
class LCS {
    private int[][] c = new int[20][20];
    private int[][] b = new int[20][20];

    public void LCSLength(int m, int n, char[] x, char[] y) {
        for (int i = 1; i <= m; i++) {
            c[i][0] = 0;
        }
        for (int i = 1; i <= n; i++) {
            c[0][i] = 0;
        }
        for (int i= 1; i <=m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x[i] == y[j]) {
                    c[i][j] = c[i-1][j-1] + 1;
                    b[i][j] = 1;
                } else if (c[i - 1][j] >= c[i][j - 1]) {
                    c[i][j] = c[i - 1][j];
                    b[i][j] = 2;
                } else {
                    c[i][j] = c[i][j-1];
                    b[i][j] = 3;
                }
            }
        }
    }

    void LCS(int i, int j, char[] x) {
        if (i == 0 || j == 0) {
            return;
        }
        if (b[i][j] == 1) {
            LCS(i-1, j-1, x);
            System.out.println(x[i]);
        } else if (b[i][j] == 2) {
            LCS(i - 1, j, x);
        } else {
            LCS(i, j-1, x);
        }

    }
}