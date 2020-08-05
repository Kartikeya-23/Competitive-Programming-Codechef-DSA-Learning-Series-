/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i =0; i < t; i++) {
                int N = sc.nextInt();
                int[] arr = new int[N];
                for (int k = 0; k < N; k++) {
                    arr[k] = sc.nextInt();
                }
                int count = 1;
                for (int j = 1; j < N; j++) {
                    if (arr[j - 1] < arr[j]) {
                        arr[j] = arr[j - 1];
                        continue;
                    }
                    if (arr[j - 1] >= arr[j]) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
            return;
        }
    }
}
