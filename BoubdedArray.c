#include <stdlib.h>

// Define the BoundedArray structure
struct BoundedArray {
    int SIZE;
    int *arr;
};

struct BoundedArray* getArrayFromMatrix(int R, int C, int matrix[R][C]) {
    // Allocate memory for the BoundedArray structure
    struct BoundedArray *result = (struct BoundedArray*)malloc(sizeof(struct BoundedArray));
    if (!result) return NULL; // Handle memory allocation failure

    result->SIZE = R * C;

    // Allocate memory for the array
    result->arr = (int*)malloc(result->SIZE * sizeof(int));
    if (!result->arr) {
        free(result); // Free previously allocated memory
        return NULL; // Handle memory allocation failure
    }

    int i1 = result->SIZE - 1;

    // Fill the array in reverse order
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            result->arr[i1--] = matrix[i][j];
        }
    }

    return result;
}