package easy;

import java.util.Scanner;

public class Ex16_JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] substrings = new String[s.length() - (k - 1)];
        int cont = 0;
        for (int i = 0; i < s.length() - (k - 1); i++) {
            substrings[cont] = s.substring(i, i + k);
            cont++;
        }

        smallest = substrings[0];
        for (String sub : substrings) {
            if (sub.compareTo(smallest) < 0) smallest = sub;
        }

        largest = substrings[0];
        for (String sub : substrings) {
            if (sub.compareTo(largest) > 0) largest = sub;
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
