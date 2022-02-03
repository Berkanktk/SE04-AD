from itertools import permutations
import random

if __name__ == "__main__":
    # Generating a list from user input
    maxValue = input("Enter max value: \n> ")

    userInput = list(range(1, int(maxValue) + 1))  # Creates a list of a chosen value
    print('Generated list:', userInput)  # Prints created list
    print('************')

    # Creates permutation
    permutation = permutations(userInput)
    permutation = list(permutation)

    # Takes user input to print one, or all possible permutations.
    generate = input("Do you wanna generate one, or all possible permutations?\n1. One\n2. Two\n> ")

    if generate == '1':
        index = random.randrange(0, (len(permutation) - 1))
        print(permutation[index])
    elif generate == '2':
        # Prints all permutations
        for i in list(permutation):
            print(i)
