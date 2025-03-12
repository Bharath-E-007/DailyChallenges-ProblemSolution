#include<stdio.h>
#include<stdlib.h>

typedef struct {
    int SIZE;
    int *arr;
} BoundedArray;

BoundedArray* getIntegersStartingWithD(int SIZE, int arr[], int D) {
    BoundedArray* result = (BoundedArray*) malloc(sizeof(BoundedArray));
    result->arr = (int*) malloc(SIZE * sizeof(int));
    result->SIZE = 0;

    for (int i = 0; i < SIZE; i++) {
        int num = arr[i];
        while (num >= 10) {
            num /= 10;
        }
        if (num == D) {
            result->arr[result->SIZE++] = arr[i];
        }
    }

    if (result->SIZE == 0) {
        result->arr[0] = -1;
        result->SIZE = 1;
    } else {
        result->arr = (int*) realloc(result->arr, result->SIZE * sizeof(int));
    }

    return result;
}