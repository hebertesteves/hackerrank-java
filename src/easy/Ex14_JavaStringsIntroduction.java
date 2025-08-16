package easy;

import java.io.*;
import java.util.*;

public class Ex14_JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = A.length() + B.length();
        System.out.println(length);

        System.out.println(A.compareTo(B) <= 0 ? "No" : "Yes");

        String strA = A.toUpperCase().charAt(0) + A.substring(1);
        String strB = B.toUpperCase().charAt(0) + B.substring(1);
        System.out.println(strA + " " + strB);

    }
}
