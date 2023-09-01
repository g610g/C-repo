#include <stdio.h>
void swap(int* num1, int* num2)
{
    int temp;
    temp = *num1;
    *num1 = *num2;
    *num2 = temp;
    return;

}
void heapify(int* arr, int size, int index)
{
    int largest = index;
    int left = (index * 2) + 1;
    int right = (index * 2)  + 2;
    if (size > left && arr[left] > arr[largest])
    {
        largest = left;
    }
    if (size > right && arr[right] > arr[largest])
    {
        largest = right;
    }
    if (index != largest)
    {
        swap(&arr[largest], &arr[index]);
        heapify(arr, size, largest);
    }
}
void heapsort(int* arr, int length)
{
    for (int lengthArr = (length / 2) - 1; lengthArr  >= 0 ; lengthArr--)
    {
        heapify(arr, length, lengthArr);
    }
    for (int i = length - 1; i >= 0; i--)
    {
        swap(&arr[i], &arr[0]);
        heapify(arr, i, 0);
    }
}

int main(void)
{
    int test[6] = {2,10,0,1,20,15};
    int length = sizeof(test) / sizeof(int);
    heapsort(test, length);
}