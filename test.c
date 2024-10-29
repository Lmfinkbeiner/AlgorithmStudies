#include <stdio.h>
#include "Src/pancakeFlip.c"

int main() {
    int arr[10] = {0};
   //test stack generation
   printf("test stack gen \n");
   generate(arr, 10);
   for(int i = 0; i < 10; i++){ printf("%d ", arr[i]);}
   printf("\n");


   //test flip method
   printf("test flip method \n");
    int inorder[6] = {0,1,2,3,4,5};
   flip(inorder, 2);
   for(int i = 0; i < 6; i++){ printf("%d ", inorder[i]);}
    printf("\n");
   flip(inorder,5);
   for(int i = 0; i < 6; i++){ printf("%d ", inorder[i]);}
    printf("\n");


   //test sort method
   printf("test pancake sort\n");
   for(int i = 0; i < 10; i++){ printf("%d ", arr[i]);}
    printf("\n");
   pancakeSort(arr, 10);
   for(int i = 0; i < 10; i++){ printf("%d ", arr[i]);}
    printf("\n");

   return 0;
}