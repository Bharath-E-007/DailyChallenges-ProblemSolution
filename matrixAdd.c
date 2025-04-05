#include <stdio.h>
#include <stdlib.h>

void printMatrix(int R, int C, int matrix[R][C]) {
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            printf("%d ", matrix[row][col]);
        }
        printf("\n");
    }
}

int** addTwoMatrices(int R, int C, int matrix1[R][C], int matrix2[R][C]) {
    int **resultMatrix = (int **)malloc(R * sizeof(int *));
    for (int i = 0; i < R; i++) {
        resultMatrix[i] = (int *)malloc(C * sizeof(int));
        for (int j = 0; j < C; j++) {
            resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    return resultMatrix;
}

int main() {
    int R, C;
    printf("Enter rows and columns: ");
    scanf("%d %d", &R, &C);

    int matrix1[R][C], matrix2[R][C];

    printf("Enter elements of Matrix 1:\n");
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            scanf("%d", &matrix1[row][col]);
        }
    }

    printf("Enter elements of Matrix 2:\n");
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            scanf("%d", &matrix2[row][col]);
        }
    }

    int **resultMatrix = addTwoMatrices(R, C, matrix1, matrix2);

    printf("Matrix 1:\n");
    printMatrix(R, C, matrix1);

    printf("Matrix 2:\n");
    printMatrix(R, C, matrix2);

    printf("Matrix Sum:\n");
    for (int row = 0; row < R; row++) {
        for (int col = 0; col < C; col++) {
            printf("%d ", resultMatrix[row][col]);
        }
        printf("\n");
    }

    // Free memory
    for (int i = 0; i < R; i++) {
        free(resultMatrix[i]);
    }
    free(resultMatrix);

    return 0;
}