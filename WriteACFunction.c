#include <stdio.h>
#include <string.h>
#include <ctype.h>

int customCompare(char str1[], char str2[]) {
	int ind1 = 0, ind2 = 0, c1 = 0, c2 = 0;

	while (ind1 < strlen(str1) && ind2 < strlen(str2)) {
		while (ind1 < strlen(str1) && (!isalpha(str1[ind1]) || islower(str1[ind1]))) {
			ind1++;
		}
		while (ind2 < strlen(str2) && (!isalpha(str2[ind2]) || islower(str2[ind2]))) {
			ind2++;
		}

		if (ind1 < strlen(str1) && isupper(str1[ind1])) c1++;
		if (ind2 < strlen(str2) && isupper(str2[ind2])) c2++;

		if (ind1 < strlen(str1) && ind2 < strlen(str2) && str1[ind1] == str2[ind2]) {
			ind1++;
			ind2++;
		} else {
			return 0;
		}
	}

	return c1 == c2;
}
/*
// The function customCompare takes two strings str1 and str2 as input and compares them based on specific criteria. It counts the number of uppercase letters in both strings while ignoring non-alphabetic characters and lowercase letters. The function returns 1 if the strings are equal according to these criteria, and 0 otherwise.
// It uses the isalpha() function to check if a character is an alphabetic letter and the islower() function to check if it is lowercase. The function iterates through both strings, skipping non-alphabetic characters and counting uppercase letters. If the characters at the current indices are equal, it moves to the next character in both strings. Finally, it checks if the counts of uppercase letters in both strings are equal and returns the result.
// The function is case-sensitive and only considers uppercase letters for the comparison. It also handles cases where one string may contain non-alphabetic characters or lowercase letters, which are ignored during the comparison.
// The function returns 1 if the strings are equal according to the specified criteria, and 0 otherwise. It is important to note that the function does not modify the original strings and only performs a comparison based on the defined rules.
// The function is useful for comparing strings in a case-sensitive manner while ignoring certain characters, making it suitable for scenarios where specific formatting or casing is important.
*/