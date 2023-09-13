#include <stdio.h>
#define MAX_REGISTER 31
#define REPRESENTATION 5
int parseInput(char* input)
{
    int registerNumber;
    sscanf(input, "%*[^0-9]%d", &registerNumber);
    return registerNumber;
}
void registerToBinary()
{
  char input[3], binaryRepresentation[] = {0, 0, 0, 0, 0};
  int registerNumber, i = REPRESENTATION - 1, printValue;
  printf("Enter value: ");
  scanf("%s", input);
  if (!(input[0] == 'r' || input[0] == 'R'))
  {
    printf("invalid register\n");
    return;
  }
  registerNumber = parseInput(input);
  printValue = registerNumber;
  if (registerNumber > MAX_REGISTER || registerNumber < 0)
  {
    printf("Invalid register\n");
    
    return;
  }
  while(registerNumber > 0)
  {
    binaryRepresentation[i] = registerNumber % 2;
    registerNumber /= 2;
    i--;
  }
    printf("You have entered register number %d with machine code equivalent of ", printValue);
  for (i = 0; i < REPRESENTATION; i++)
  {
    printf("%d", binaryRepresentation[i]);
  }
    printf(", a five bits representation.\n");
}
int main(void)
{ 
  registerToBinary();
}