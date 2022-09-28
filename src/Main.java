import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(51, 68, 51, 94, 98, 32, 32, 47, 39));
        List<String> words = new ArrayList<>(List.of("yes", "yes", "no", "maybe", "no", "yes", "zero"));

        printOdd(nums);
        printEven(nums);
        printUnique(words);
        printDuplicateCount(words);
    }

    public static void printOdd(List<Integer> nums) {
        nums = new ArrayList<>(nums);
        nums.removeIf(num -> num % 2 == 0);
        System.out.println(nums);
    }

    public static void printEven(List<Integer> nums) {
        nums = new ArrayList<>(new HashSet<>(nums));
        nums.sort(Integer::compareTo);
        nums.removeIf(num -> num % 2 == 1);
        System.out.println(nums);
    }

    public static void printUnique(List<String> words) {
        for (String word : words) {
            if(Collections.frequency(words, word) == 1){
                System.out.println(word);
            }
        }
    }

    public static void printDuplicateCount(List<String> words) {
        Set<String> strings = new HashSet<>(words);
        for (String word : strings) {
            System.out.println(word + " " + Collections.frequency(words, word));
        }
    }
}