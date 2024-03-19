//Two Gram

import java.util.Scanner;

public class ex {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        char[] charArray = s.toCharArray();
        int flag=0;
        for (int i = 0; i < n - 1; i++) {
            char s1 = charArray[i];
            char s2 = charArray[i + 1];

            for (int j = i + 1; j < n - 1; j++) {
                if (s1 == charArray[j] && s2 == charArray[j + 1]) {
                    String ans = new String(new char[]{s1, s2});
                    System.out.println(ans);
                    flag=1;
                }
                if(flag==1) {break;}
            }
        }
    }
}
