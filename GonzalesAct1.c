#include <stdio.h>
#define MAX_REGISTER 32
#define REPRESENTATION 5
int parseInput(char* input)
{
    int registerNumber;
    sscanf(input, "%*[^0-9]%d", &registerNumber);
    return registerNumber;
}
void registerToBinary()
{
    
}
int main(void)
{ 
  char input[3];
  int registerNumber;
  printf("Enter value: ");
  scanf("%s", input);
  printf("%s\n",input);
  printf("%d\n", parseInput(input));
}