# Week 5

# Øvelsestimer

## Hovedopgave  1

|  | 1 Second | 1 Hour |
|---|---|---|
| n | 10^9 = 1000000000 | 60 * 60 * 10^9 = 3600000000000 |
| nlogn | n * log_2(x) / 10^9 = 1 = 39620077 | n * log_2(x) / 10^9 = 1 = 98574774544 |
| n^2 | n^2 / 10^9 = 1 = 31622 | n^2 / 10^9 = 60 *60 = 1897366 |
| n^3 | n^3 / 10^9 = 1 = 1000 | n^3 / 10^9 = 60 *60 = 15326 |
| 2^n | 2^n / 10^9 = 1 = 29 | 2^n /  10^9 = 60 * 60 = 41 |

## Hovedopgave  2

**Dansk**

Siden der ikke er nogen der allerede er på deres plads 'k', og at der på hver ombytning kan være 2 korrekt placerede brikker og der samtidigt er en 'n' mængde af brikker. Så kræves min. `n/2`

**English**

Since there is no one already in their place 'k', and there on each exchange only can be 2 correctly placed pieces and at the same time there is an 'n' amount of pieces. Then min. would be `n/2`

## Hovedopgave  3

Formula: (n-k)

n = 4

k = sorted bricks

= (4 - k)

## Hovedopgave  4

```python
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
```

## Hovedopgave  5

```java
public static int countCycles(List<Integer> list) {
        int count = 0;

        List<Integer> checked = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (checked.contains(i)) {
                continue;
            }

            for (int j = list.get(i); j != i; j = list.get(j)) {
                checked.add(j);
            }
            count++;

        }

        return count;
    }
```

# Hjemmeopgaver

## Hovedopgave 1

## Hovedopgave 2