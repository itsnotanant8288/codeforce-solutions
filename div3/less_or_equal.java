import java.util.Scanner;

public class ex {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int ele = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count;
        boolean found = false;

        // Loop up to 10^9
        for (int i = 1; i <= 1000000000; i++) {
            count = 0;

            // Count elements less than or equal to i
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= i) {
                    count++;
                }
            }
            // Check if count matches ele
            if (count == ele) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        // If no valid x found, print -1
        if (!found) {
            System.out.println(-1);
        }
    }
}
