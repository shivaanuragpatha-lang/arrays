/* Program that takes array and target as an input. Further returns the indices of the
* of the operands, upon whose addition will reults in target value. */
import java.util.Scanner;

public class TwoSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array in this format [2,7,11,15]: ");
        String input = sc.nextLine();

        input = input.replaceAll("\\[|\\]", "");//Removes the brackets from the input.
        String[] parts = input.split(",");/*Splits the string by comma to get
        individual number strings.*/

        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Indices are: [" + result[0] + ", " + result[1] + "]");

        sc.close();
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
