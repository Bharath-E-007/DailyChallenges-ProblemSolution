#include <stdio.h>
#include <stdlib.h>

char* getUniqueUnitDigits(int SIZE, int arr[]) {
    int arr1[10] = {0};

    for(int i = 0; i < SIZE; i++) {
        arr1[arr[i] % 10]++;
    }

    char* unit = (char*)malloc(11 * sizeof(char)); // 10 digits + 1 null terminator
    int ind = 0;

    for(int i = 9; i >= 0; i--) {
        if(arr1[i] > 0) {
            unit[ind++] = i + '0'; // Convert int to char
        }
    }

    unit[ind] = '\0'; // Null terminate
    return unit;
}
/*
// The function getUniqueUnitDigits takes an integer SIZE and an array arr of integers. It counts the occurrences of each unit digit (0-9) in the array and returns a string containing the unique unit digits in descending order. The string is dynamically allocated, so it should be freed by the caller after use.
// The function uses a fixed-size array of size 10 to count the occurrences of each unit digit. It then constructs the result string by iterating through the count array in reverse order, appending the digits to the result string. Finally, it null-terminates the string and returns it.
// The function assumes that the input array contains non-negative integers. If the input array contains negative integers, the behavior of the function is undefined. The function also assumes that the input SIZE is a positive integer and that the input array is not NULL. If any of these assumptions are violated, the behavior of the function is undefined.
*/