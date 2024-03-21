import java.util.Scanner;

public class ex {
    
    public static int polycarp(int ele, int[] inforced) {
        if (ele % 3 == 0 && inforced[0] != 1) {
            inforced[0] = 1;
            return ele / 3;
        } else {
            inforced[0] = 0;
            return ele * 2;
        }
    }
    
    public static boolean find(int ele, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            int[] temp = new int[n];
            int k = 1;
            temp[0] = ele;
            int[] threeInforced = new int[1]; // Array to store the value of threeInforced
            threeInforced[0] = 0;
            
            for (int j = 0; j < n - 1; j++) {
                ele = polycarp(ele, threeInforced); // Update ele for the next iteration
                if (find(ele, arr)) {
                    temp[k++] = ele;
                } else {
                    break;
                }
            }
            
//            for (int x : temp) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
//            System.out.println("k: " + k);
            
            if (k == n) {
                // Output the sequence
                for (int x : temp) {
                    System.out.print(x + " ");
                }
                break;
            }
        }
    }
}
