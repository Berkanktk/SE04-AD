import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// @ esbendamkjaer

public class Main {

    public static void main(String[] args) {
        List<Integer> permutation = randomPermutation(4);
        System.out.println(permutation);
        System.out.println(countCycles(permutation));


        List<Integer> stats = Arrays.stream(cycleStatistics(10000000, 16)).boxed().collect(Collectors.toList());
        System.out.println(stats);
    }

    public static List<Integer> randomPermutation(int n) {
        List<Integer> permutation = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            permutation.add(i);
        }
        Collections.shuffle(permutation);

        return permutation;
    }

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

    public static int[] cycleStatistics(int n, int permLength) {
        int[] stats = new int[permLength];

        for (int i = 0; i < n; i++) {
            List<Integer> perm = randomPermutation(permLength);
            int cycleCount = countCycles(perm);
            stats[cycleCount - 1]++;
        }

        return stats;
    }

}
