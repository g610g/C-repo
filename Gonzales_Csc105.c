#include <stdio.h>
#define MAX_SIZE 100
char* bigEndian(char* number, int start, int length)
{
    char temporary;
    //base case : will only stop when the start is greater than the length of the string
    if (start > length)
    {
        //returns the memory address for each recursion
        return number;
    }
    
    //swapping

    temporary = number[start];
    number[start] = number[length];
    number[length] = temporary;
    
    //foreach recursion the returned number reference of the recursion is 
    //always the same so to make sure always assign the number to its address
    number = bigEndian(number, start + 1, length - 1);
    return number;
}



    //the same thing for the bigEndian just reversed it again
char * littleEndian(char* number, int start, int length)
{
    char temporary;
    if (start > length)
    {
        return number;
    }
    temporary = number[start];
    number[start] = number[length];
    number[length] = temporary;
    number = littleEndian(number, start + 1, length - 1);
    return number;
}


int main(void)
{
    //pointers for the string 
    char number[MAX_SIZE], *resultBig, *resultLittle;
    int length = 0;
    printf("Enter any numeric value:");
    scanf("%s", number);

    //gets the length of the input string

    while (number[length] != '\0' && number[length] != '\n')
    {
        length++;
    }

    //resultBig reference to bigEndian returned memory address for the reversed string
    //passes zero as the first index and length - 1 for the last character

    resultBig = bigEndian(number, 0, length - 1);
    printf("%s\n", resultBig);

    //resultLittle reference to littleEndian returned memory address for the reversed string
    //passes zero as the first index and length - 1 for the last character
    resultLittle = littleEndian(resultBig, 0, length - 1);
    printf("%s\n", resultLittle);
}