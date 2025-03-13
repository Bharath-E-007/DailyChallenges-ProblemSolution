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
/*typedef struct BoundedArray {

int SIZE;

int arr;

} boundedArray;

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

8 135 651 12 156 917 1 111 284 1

Output:

Old Array: 135 651 12 156 917 1 111 284

New Array: 135 12 156 1 111

Explanation:

Here N8 and D = 1.

The integers starting with the digit 1 are 135, 12, 156, 1 and 111. So the returned array contains the following 5 integers. 135 12 156 1 111

Example Input/Output 2:

Input:

4 156 9851 156 327

6

Output

Old Array: 156 9851 156 327

new Array:-1
*/