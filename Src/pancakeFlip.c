#include <stdio.h>
#include <stdlib.h> //for the rand function
void pancakeSort(int *, int);
//Generate random list to sort
void generate(int arr[], int size){
   for (int i = 0; i<size; i++){
         arr[i] = rand()%size;
   }
}
//flip at int i method (inclusive) 
// flip 0123 at 2 would make it 2103
void flip(int stack[], int index){
   int temp[index]; //length of top of stack
   int j = index;
   for(int i = 0; i<=index; i++){ //copy into array backwards
      temp[i] = stack[j];
      j--;
   }
   for(int i = 0; i<= index; i++){//put back into stack
      stack[i] = temp[i];
   }
}
//sort method
void pancakeSort(int *arr, int length){
//base case: one element left
   if(length != 1){ //if the length is one method simply stops
   //find biggest in stack
   int biggest = 0;
   for(int i = 0; i<length; i++){ //iterate thru whole stack
      if(arr[biggest]<arr[i]){ biggest = i;}
   }
   //if biggest is not in place: 
   if(biggest < length-1){
      flip(arr,biggest);
      flip(arr,length-1);
   }
   //sort top
   pancakeSort(arr, length-1);
   }
}
//base

