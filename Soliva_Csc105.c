#include <stdio.h>
#define MAX_SIZE 100
char* bigEndian(char* number, int length)
{
    //accepts a string reference and length of the string
    char temporary;
    int i = 0;
    //last index should be length - 1 since index starts at 0
    length -= 1;

    //while the i and length is not equal, we swap each of their values on each iteration. Notice the length decrements each time and also the i increments
    while(i < length)
    {
        temporary = number[length];
        number[length] = number[i];
        number[i] = temporary;
        --length;
        ++i;
    }
    //returns the address of the first element in the array
    return number;
}

//same process bigEndian

char* littleEndian(char* number, int length)
{
    char temporary;
    int i = 0;
    length -= 1;
    while(i < length)
    {
        temporary = number[length];
        number[length] = number[i];
        number[i] = temporary;
        --length;
        ++i;
    }
    return number;
}
int main(void){
    char name[MAX_SIZE], *bigEndianResult, *littleEndianResult;
    int length = 0;
    printf("Enter any numeric value:");
    scanf("%99s", name);
    //gets the length of the user input string
    while(name[length] != '\0' && name[length] != '\n')
    {
        length++;
    }
    //makes sure the ending of the array is not a newline but a string closing
    name[length] = '\0';
    //reference the bigEndianResult to the address that the bigEndian returns
    bigEndianResult = bigEndian(name, length);
    printf("\n\nBig Endian:\n");
    for (int i = 0; i < length; i++)
    {
        printf("--------");
    }
    printf("\n");
    for(int i = 0; i < length; i++)
    {

        printf("|%c\t", bigEndianResult[i]);
    }
    printf("|\n");
    for (int i = 0; i < length; i++)
    {
        printf("--------");
    }
    littleEndianResult = littleEndian(bigEndianResult, length);
    printf("\n\n\nLittle Endian:\n\n");
    for (int i = 0; i < length; i++)
    {
        printf("--------");
    }
    printf("\n");

     for(int i = 0; i < length; i++)
    {

        printf("|%c\t", littleEndianResult[i]);
    }
    printf("|\n");
    for (int i = 0; i < length; i++)
    {
        printf("--------");
    }
    printf("\n");
    

}
