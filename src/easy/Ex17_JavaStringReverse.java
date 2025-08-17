package easy;

import java.io.*;
import java.util.*;

public class Ex17_JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        String reverse = sb.reverse().toString();

        System.out.println(A.equals(reverse) ? "Yes" : "No");

    }
}
