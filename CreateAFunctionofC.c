#include <stdio.h>

#include <stdlib.h>
#include <string.h>
void customToUpper(char str[], char fromChar, char toChar)

void customToUpper(char str[], char fromChar, char tochar)

{

int n = strlen(str);

for(int i=0;i<n;i++){ 
    if(str[i]>=fromChar&&str[i]<=toChar){ 
         str[i]=toupper(str[i]);

}

}

}

int main()

{

char str[101], fromChar, toChar; scanf("%s\n%c%c", str, &fromChar, &toChar); customToUpper(str, fromChar, toChar);

if(str[0] == '\0')

{



printf("String is empty\n");
}

printf("%s", str);

return 0;

}