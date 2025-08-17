package easy;

import java.io.*;
import java.util.*;

public class Ex19_JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] tokens = s.split("[^A-Za-z]+");
        int cont = 0;
        for (String t : tokens) if (!t.isEmpty()) cont++;

        System.out.println(cont);
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
        scan.close();
    }
}
