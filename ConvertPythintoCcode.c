#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
    int N;
    scanf("%d", &N);
    getchar(); // Consume the newline after the number

    for (int i = 0; i < N; i++) {
        char str[1000];
        fgets(str, sizeof(str), stdin); // Read entire line

        int sum = 0, len = 0;
        char *token = strtok(str, " \n");

        while (token != NULL) {
            sum += atoi(token);
            len++;
            token = strtok(NULL, " \n");
        }

        printf("%d %d\n", len, sum);
    }

    return 0;
}
/*
    Conveted from Python to C code.
    N = int(input())

    for _ in range(N):
        currRow = list(map(int, input().strip().split()))
        print(len(currRow), sum(currRow))
*/