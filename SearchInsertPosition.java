/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.*/
import java.util.Scanner;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array in format [1,3,5,6]: ");
        String s = sc.nextLine();

        s = s.replaceAll("\\[|\\]", "");
        String[] parts = s.split(",");

        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = searchInsert(nums, target);

        System.out.println("Output: " + index);

        sc.close();
    }
}
