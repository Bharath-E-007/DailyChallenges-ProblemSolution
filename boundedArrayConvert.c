#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct BoundedArray {
    int* arr;
    int SIZE;
};

struct BoundedArray* intToDigitArray(int N) {
    // Allocate the struct
    struct BoundedArray* result = (struct BoundedArray*)malloc(sizeof(struct BoundedArray));
    result->SIZE = 0;

    // Take the absolute value to avoid negative sign issues
    N = abs(N);

    // Convert int to string
    char str[100];
    sprintf(str, "%d", N);

    // Allocate memory for digits
    result->arr = (int*)malloc(sizeof(int) * 100); // allocate max 100 digits just in case

    int i = 0;
    while (str[i] != '\0') {
        result->arr[result->SIZE++] = str[i] - '0';
        i++;
    }

    return result;
}

int main() {
    int input = -704990;

    struct BoundedArray* result = intToDigitArray(input);

    printf("Array: ");
    for (int i = 0; i < result->SIZE; i++) {
        printf("%d", result->arr[i]);
    }
    printf("\n");

    // Cleanup
    free(result->arr);
    free(result);

    return 0;
}