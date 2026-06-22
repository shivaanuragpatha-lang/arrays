/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed.
 Then return the number of elements in nums which are not equal to val.
 Input:
 nums=[3,2,2,3]
 val=3
 output:2, nums=[2,2,]*/
import java.util.Scanner;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array in format [3,2,2,3]: ");
        String s = sc.nextLine();

        s = s.replaceAll("\\[|\\]", "");
        String[] parts = s.split(",");

        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i].trim());
        }

        System.out.print("Enter val to remove: ");
        int val = sc.nextInt();

        int k = removeElement(nums, val);

        System.out.println("Output: " + k);
        System.out.print("nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        sc.close();
    }
}