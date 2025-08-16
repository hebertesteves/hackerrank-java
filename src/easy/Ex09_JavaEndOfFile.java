package easy;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ex09_JavaEndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1;
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(cont + " " + s);
            cont++;
        }

        sc.close();
    }
}
