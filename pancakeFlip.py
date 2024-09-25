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
    pass

