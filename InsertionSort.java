import java.util.Arrays;

public class InsertionSort {

    public static int[] sort(int[] numbers) {
        // going through each number in int[] numbers
        for (int i = 1; i < numbers.length; i++) {
            int j = i - 1;
            int t = numbers[i];
            while (j >= 0 && numbers[j] > t) {
                numbers[j + 1] = numbers[j--];
            }
            numbers[j + 1] = t;

        }
        return numbers; // returning the final sorted array
    }


    public static void main(String args[]) {
        int[] randomNumbers = {10, 5, 2, 3, 4, 98, 67};
        int[] sortedNumbers;



        sortedNumbers = sort(randomNumbers); // insertion sort

        // print out the sorted numbers
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
