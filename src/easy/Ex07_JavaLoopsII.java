package easy;

import java.util.*;
import java.io.*;

public class Ex07_JavaLoopsII {
    // O nome da classe no HackerRank é Solution

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] s = new int[n];
            int index = 1;
            s[0] = a + b * index;
            for (int j = 1; j < s.length; j++) {
                index *= 2;
                s[j] = s[j - 1] + index * b;
            }

            for (int num : s) {
                System.out.print(num + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
