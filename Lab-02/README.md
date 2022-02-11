# Week 6

# Hovedopgave 1

Cormen et al. øvelse 2.2-3 (side 29). Svar også for best-case køretid.

Consider linear search again (see Exercise 2.1-3). How many elements of the input
sequence need to be checked on the average, assuming that the element being
searched for is equally likely to be any element in the array? How about in the
worst case? What are the average-case and worst-case running times of linear
search in Θ‚-notation? Justify your answers.

1. Given that each element is equally likely to be the one searched for and the element searched for is present in the array, a linear search will on the average have to search through half the elements.
This is because half the time the wanted element will be in the first half and half the time it will be in the second half. Both the worst-case and average-case of LINEAR-SEARCH is Θ(n).

# Hovedopgave 2

Cormen et al. øvelse 2.1-1 (side 22). Du skal blot udføre Insertionsort i handen, og behøver ikke lave tegningerne 100% som i bogen.

1. Done

# Hovedopgave 3

Implementer InsertionSort i Java eller Python ud fra pseudo-koden side 18 i lærebogen. Test at din kode fungerer ved at generere arrays/lister med forskelligt indhold og sortere dem. NB: Bogens pseudokode indekserer arrays startende med index 1, mens Java og Python starter med index 0. Man må derfor ændre passende (dvs. nogle gange bruge et index som er ´en mindre) i de linier i pseudokoden, som involverer indekser.

```python
def insertion_sort(array):
    for i in range(1, len(array)):
        while array[i] < array[i - 1] and i > 0:
            array[i - 1], array[i] = array[i], array[i - 1]
            i -= 1
```

# Hovedopgave 4

(∗) Cormen et al. opgave 2-4 (side 41), spørgsmål a, b og c.

1. List the five inversions of the array {2, 3, 8, 6, 1}
    1. (1, 5), (2, 5), (3, 4), (3, 5), and (4, 5)
2. What array with elements from the set f{1,2,..,n} has the most inversions?
How many does it have?
    1. ?
3. What is the relationship between the running time of insertion sort and the
number of inversions in the input array? Justify your answer.
    1. The higher the number of inversions in an array, the longer insertion sort will take to sort the array.*

# Hovedopgave 5

1. Cormen et al. øvelse 2.3-1 (side 37).
    1. Done

# Hovedopgave 6

1. Cormen et al. øvelse 2.3-2 (side 37).
    1. Rewrite the MERGE procedure so that it does not use sentinels, instead stopping
    once either array L or R has had all its elements copied back to A and then copying
    the remainder of the other array back into A.
        
        ```java
        n_1=q−p+1
        n_2=r−q
        let L[1..n 1]and R[1..n 2] be new arrays 
        for i=1 to n_1
        	L[i]=A[p+i−1]
        
        for j=1 to n_2
        	R[j]=A[q+j]
        
        i=1
        j=1
        for k=p to r
        	if i>n1
        		A[k]=R[j]
        		j=j+1
        	else  if j>n2
        		A[k]=L[i]
        		i=i+1
        	else if L[i]≤R[j]
        		A[k]=L[i]
        		i=i+1
        	else 
        		A[k]=R[j]
        		j=j+1
        	
        ```
        

# Hovedopgave 7

Vis for $f(n) = 0.1 · n^2 + 5 · n + 25$ at $f(n) = Θ(n^2)$ og $f(n) = o(n^3)$.

1. ?

# Hovedopgave 8

Vis at følgende funktioner er skrevet op efter stigende asymptotisk
voksehastighed:

- 1, log n, √n, n, n log n, n√n, n^2, n^3, n^10, 2^n
    - ?
- Mere præcist, vis at det for alle par f(n), g(n) af naboer i listen gælder
at f(n) = o(g(n)). Hint: brug sætninger fra side 17 (og 18 og 19) i slides
om analyse af algoritmers køretider.
    - ?

# Hovedopgave 9

1. (∗) Cormen et al. øvelse 3.1-1 (side 52). (Her skal man bruge selve
definitionen af Θ() fra bog/slides, ikke sætninger side 17 fra slides.)
    1. ?
