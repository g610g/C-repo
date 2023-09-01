#include <stdio.h>
void swap(int * num1, int* num2)
{
    int temp = *num1;
    *num1 = *num2;
    *num2 = temp;
}
void heapify(int* arr, int size, int index)
{
    int largest = index;
    int left = (index * 2) + 1;
    int right = (index * 2) + 2;



    if (size > left && arr[left] > arr[largest])
    {
        largest = left;
    }
    if (size > right && arr[right] > arr[largest])
    {
        largest = right;
    }
    // if the left or right child value of the parent is greater than the parent then we build the max heap
    if (largest != index)
    {
        swap(&arr[largest], &arr[index]);
        heapify(arr, size, largest);
    }

}

void heapSort(int* arr, int length)
{
    int i;
    //find the last non leaf-node
    for (i = (length / 2) - 1; i >= 0; i--)
    {
        heapify(arr, length, i);
    }
    for (i = length - 1; i >= 0; i--)
    {
        //after swapping the root and the i then we build max heap again
        swap(&arr[0], &arr[i]);
        heapify(arr, i, 0);
    }

}
int main(void)
{
  int meals[6] = {15, 20, 10, 15, 20, 20};
  int length = sizeof(meals) / sizeof(int);
  heapSort(meals,length);    
}