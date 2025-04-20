#include <stdio.h>
#include <string.h>

void printAlarmTimings(char startTime[], char endTime[], int X) {
    if (X <= 0) {
        printf("Error: Interval X must be a positive integer.\n");
        return;
    }

    int startHour, startMin, endHour, endMin;
    sscanf(startTime, "%d:%d", &startHour, &startMin);
    sscanf(endTime, "%d:%d", &endHour, &endMin);

    int startTotal = startHour * 60 + startMin;
    int endTotal = endHour * 60 + endMin;

    if (startTotal >= endTotal) {
        printf("Error: Start time must be earlier than end time.\n");
        return;
    }

    int current = startTotal + X;

    while (current <= endTotal) {
        int hour = current / 60;
        int min = current % 60;
        printf("%02d:%02d\n", hour, min);
        current += X;
    }
}

/*
     The function/method printAlarm Timings accepts three arguments - startTime, endTime and X. The startTime and endTime are two string values that represent the start time and end time of a factory. For every X minutes from the start time to the end time, the factory alarm sounds indicating the time slot for the workers.

The function/method printAlarm Timings must print the alarm timings at the factory.

Note: The start time, the end time and the alarm timings are always in 24-hr format HH:MM.

Your task is to implement the function printAlarm Timings so that it passes all the test cases.

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input

09:15

17:30

60

Output:

10:15

11:15

12:15

13:15

14:15

15:15

16:15

17:15

Example Input/Output 2:

Input

04:00

12:15

45

Output

04:45

05:30

06:15

07:00

07:45

08:30

09:15

10:00

10:45

11:30

12:15
*/