import java.util.*;

public class LocateArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of arrays: ");
        int n = Integer.parseInt(sc.nextLine());

        String[] arrayNames = new String[n];
        String[][] arrays = new String[n][];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print("Enter the name of first array: ");
            } else if (i == 1) {
                System.out.print("Enter the name of second array: ");
            } else if (i == 2) {
                System.out.print("Enter name of third Array: ");
            } else {
                System.out.print("Enter the name of array " + (i + 1) + ": ");
            }

            arrayNames[i] = sc.nextLine().trim();

            if (i == 0) {
                System.out.print("Enter elements in first array: ");
            } else if (i == 1) {
                System.out.print("Enter elements in second array: ");
            } else if (i == 2) {
                System.out.print("Enter the elements in third array: ");
            } else {
                System.out.print("Enter elements in array " + (i + 1) + ": ");
            }

            String input = sc.nextLine();
            String[] elements = input.split(",");

            for (int j = 0; j < elements.length; j++) {
                elements[j] = elements[j].trim();
            }

            arrays[i] = elements;
        }

        String targetArrayName = arrayNames[n - 1];
        LinkedHashSet<String> targetSet = new LinkedHashSet<>(Arrays.asList(arrays[n - 1]));

        for (int i = 0; i < n - 1; i++) {
            List<String> commonItems = new ArrayList<>();

            for (String item : arrays[i]) {
                if (targetSet.contains(item) && !commonItems.contains(item)) {
                    commonItems.add(item);
                }
            }

            if (!commonItems.isEmpty()) {
                System.out.println(commonItems.size() + " " + arrayNames[i] + " in " + targetArrayName + ":");
                for (String item : commonItems) {
                    System.out.println("   -" + item);
                }
            }
        }

        sc.close();
    }
}