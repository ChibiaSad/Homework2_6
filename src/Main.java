import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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
        nums.sort(Integer::compareTo);
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
        words = new ArrayList<>(words);
        words.sort(String::compareTo);
        String prev = null;
        for (int i = 0; i < words.size() - 1; i++) {
            if (!words.get(i).equals(words.get(i + 1)) && !words.get(i).equals(prev))
                System.out.print(words.get(i) + " ");
            prev = words.get(i);
        }
        System.out.println();
    }

    public static void printDuplicateCount(List<String> words) {
        words = new ArrayList<>(words);
        words.sort(String::compareTo);
        String prev = null;
        int matches = 1;
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).equals(prev)) {
                matches += 1;
                if(i == words.size() - 1){
                    System.out.println(matches);
                }
            }
            else {
                if(matches != 1){
                    System.out.println(matches);
                    matches = 1;
                }
            }
            prev = words.get(i);
        }
    }
}