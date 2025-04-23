void invertSubmatrix(int R, int C, int matrix[R][C], int slow, int scol, int k) {
    for (int i = slow; i < slow + k; i++) {
        for (int j = scol; j < scol + k; j++) {
            matrix[i][j] ^= 1;
        }
    }
}

/*
    * The function `invertSubmatrix` takes the dimensions of a matrix (R and C), a 2D array `matrix`, starting row and column indices (`slow` and `scol`), and the size of the submatrix (`k`). It inverts the values in the specified submatrix by using the XOR operator. The function iterates through the specified submatrix and flips each value from 0 to 1 or from 1 to 0.
*/