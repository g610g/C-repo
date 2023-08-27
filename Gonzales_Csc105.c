#include <stdio.h>
#define MAX_SIZE 100
char* bigEndian(char* number, int start, int length)
{
    char temporary;
    if (start < length)
    {
        return number;
    }

    temporary = number[start];
    number[start] = number[length];
    number[length] = temporary;
    number = (number, start + 1, length - 1);
    return number;
}
int main(void)
{
    char number[MAX_SIZE], *resultBig;
    int length = 0;
    printf("Enter any numeric value:");
    scanf("%s", number);

    while (number[length] != '\0' && number[length] != '\n')
    {
        length++;
    }
    
    resultBig = bigEndian(number, 0, length - 1);
        
}