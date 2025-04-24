#include <math.h>

// Assuming this struct is already defined
typedef struct {
    int X;
    int Y;
} Point;

// Function to calculate distance between two points
double calculateDistance(Point point1, Point point2) {
    double dx = point2.X - point1.X;
    double dy = point2.Y - point1.Y;
    return sqrt(dx * dx + dy * dy);
}

/*
   ChatGPT
You said:
The fonchan/method calculate Distance accepts two arguments point1 and point2 representing two points

The function/method calculate Distance must return a floating point value representing the distance between the given two points.

Your task is to implement the function calculateDistance so that it passes all the test cases.

The following structure is used to represent Point and is already defined in the default code (Do not write these definition again in your code).

typedef struct

point

int X

int Y

> Point;

4

IMPORTANT: Do not write the main() function as it is already defined.

Example Input/Output 1:

Input:

45 76

Output:

3.16

Explanation:

The first point is (4, 5).

The second point is (7, 6).

The distance between the given two points is 3.16 (The distance is printed with the precision up to 2 decimal places).

Example Input/Output 2:

Input:

9 -2

0 0

Output

9.22
*/