from Src import pancakeFlip

#test flip stack
print("test flip stack")
test1 = [0,1,2,3,4,5,6,7,8,9]
print(test1)
print(pancakeFlip.flip(test1,4))


#test sort random
print("test sort and generate")
test = pancakeFlip.generateStack(15)
print(test)
print(pancakeFlip.sortPancakes(test))