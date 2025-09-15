package easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ex34_JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            String operation = sc.next();
            int index = sc.nextInt();
            if (operation.toLowerCase().equals("insert")) {
                int number = sc.nextInt();

                list.add(index, number);
            } else if (operation.toLowerCase().equals("delete")) {
                list.remove(index);
            }
        }

        for (Integer element : list) {
            System.out.print(element + " ");
        }

        sc.close();
    }
}
