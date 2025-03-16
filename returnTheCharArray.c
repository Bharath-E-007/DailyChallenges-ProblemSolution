#include <stdio.h>
#include <stdlib.h>

char* getInterlacedString(int x, int y, char ch1, char ch2) {
    int len = x + y;
    char* result = (char*)malloc(len + 1);
    if (result == NULL) {
        return NULL; // Handle memory allocation failure
    }

    int ind = 0;
    for (int i = 0, j = 0; i < x || j < y;) {
        if (i < x) {
            result[ind++] = ch1;
            i++;
        }
        if (j < y) {
            result[ind++] = ch2;
            j++;
        }
    }

    result[ind] = '\0';
    return result;
}