import random
#python arbitrary stack of size n with pancakes in sizes 0:n-1
#takes in number n, generates stack of n pancakes using numbers 0:n-1
def generateStack(n):
    stack = [0] * n #initialize stack of 0s
    for i in range(0,n-1):
        stack[i]=random.randint(0,n-1)
    return stack

#takes in N stack of n pancakes and index [i], flips stack N from 0-i (spatula below i, i now on top)
#N[i] is at top of stack after flip
def flip(Stack, n):
    #add throw catc
    temp = Stack[0:n+1]
    return temp[::-1]+(Stack[n+1:len(Stack)])
#takes in N stack of n pancakes, recursively sorts stack biggest to smallest and returns sorted stack
def sortPancakes(Stack):
    #Base case
    n = len(Stack)
        #stack is 1 element, return it
    if n == 1:
        return Stack
    #find biggest in stack (first instance)
    biggest = 0
    for i in range(1,n-1):
        if Stack[biggest] < Stack[i]:
            biggest = i
    #if biggest not in place
    if biggest < n-1:
        #flip biggest to top
        t = flip(Stack,biggest)
        #flip full stack
        t = flip(t,n-1)
    #sort top
    return sortPancakes(t[0:n-1]) + [t[n-1]]

