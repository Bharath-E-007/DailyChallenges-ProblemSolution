#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct BoundedArray {
    int *arr;
    int SIZE;
};

struct BoundedArray* getThreeOrFourDigits(int SIZE, int arr[]) {
    // Allocate memory for the result structure
    struct BoundedArray *result = (struct BoundedArray *)malloc(sizeof(struct BoundedArray));
    result->arr = (int *)malloc(SIZE * sizeof(int));
    result->SIZE = 0;

    for (int i = 0; i < SIZE; i++) {
        int len = (int)log10(arr[i]) + 1; // Calculate the number of digits
        if (len == 3 || len == 4) {
            result->arr[result->SIZE++] = arr[i];
        }
    }

    if (result->SIZE == 0) {
        result->arr[result->SIZE++] = -1; // Add -1 if no valid numbers are found
    }

    return result;
}
/*
typedef struct BoundedArray.

{

int SIZE;

int arr;

} boundedArray;

4

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input: 6 34 124 4 3400 2020 505

Output:

Old Array: 34 124 4 3400 2020 505

New Array: 124 3400 2020 505

Explanation:

Here N = 6.

The three-digit or four-digit integers in the given array are 124, 3400, 2020 and 505. So the returned array contains the following 4 integers 124 3400 2020 505

Example Input/Output 2: Input: 5 12 57 1 58 19087

Output:

Old Array: 12 57 1 58 19087

New Array: -1
*/