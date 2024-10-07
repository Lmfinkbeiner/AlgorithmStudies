package Src;

import java.util.Arrays;

//import java.util.*;
//java prog that flips stack of N pancakes at point i
public class pancakeFlip{
//generate stack
    public int[] generate(int n){
        int[] temp = new int[n];
        for (int i = 0; i<n; i++){
            temp[i] = (int) (Math.random() * (n-1));
        }
        return temp;
    }
//flip method
//flip stack of n pancakes at index n;; stack[n] is now the top of the stack
public int[] flip(int[] stack, int n){
    int[] temp = new int[stack.length]; 
    int j = 0;
    for(int i = n; i >=0; i--){
        temp[j]=stack[i];
        j++;
    }
    for(int i = j; i<stack.length; i++){
        temp[i] = stack[i];
    }
    return temp;
}
//pancake sort method
public int[] pancakeSort(int[] stack){
    //base case: one element left
    if (stack.length == 1){
        return stack;
    }
    //find biggest in stack
    int biggest = 0;
    for(int i = 0; i<stack.length; i++){
        if (stack[biggest]<stack[i]){
            biggest = i;
        }
    }
    //if biggest is not in place: 
    if (biggest < stack.length-1){
        //flip biggest to the top
        stack = flip(stack,biggest);
        //flip whole stack
        stack = flip(stack,stack.length-1);
    }
    //BRUTE FORCE --> COULD SHORTEN
    //sort top (ie- separate from top and sort and add top to 'sorted' bottom)
    int[] temp = new int[stack.length -1];
    for (int i = 0; i < temp.length; i ++){
        temp[i] = stack[i];
    }
    temp = pancakeSort(temp);
    for(int i = 0; i<temp.length;i++){
        stack[i] = temp[i];
    }
    //Arrays.copyOfRange(stack, 0, biggest) ==> top 
    return stack;
}  

    public static void main(String[] args) {
        pancakeFlip P = new pancakeFlip();
        int[] test = P.generate(5);
        for(int i = 0; i < test.length; i++){
            System.err.print(test[i] + " ");
        }
    }
}
//PANCAKE SORT ALG
    //base case: one element left
    
    //find biggest in stack
    //if biggest is not in place: 
    //flip biggest to the top
    //flip whole stack
    
    //sort top