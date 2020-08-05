/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            for (int k = 0; k < t; k++) {
                boolean isLapalindrome = false;
                String str = sc.nextLine();
                int arr[] = new int[26];
                int l = str.length();
                for (int i = 0; i < l / 2; i++) {
                    arr[str.charAt(i) - 'a']++;
                }
                System.out.println();
                for (int i = (l % 2 == 0) ? l / 2 : (l / 2 + 1); i < l; i++) {
                    arr[str.charAt(i) - 'a']--;
                }
                isLapalindrome = true;
                for (int i = 0; i < 26; i++) {
                    if (arr[i] != 0) {
                        isLapalindrome = false;
                        break;
                    }
                }
                if (isLapalindrome) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }catch (Exception exception) {
            return;
        }


    }
}
