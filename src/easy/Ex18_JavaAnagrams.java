package easy;

import java.util.Scanner;

public class Ex18_JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        String[] lettersA = a.toLowerCase().split("");
        String[] lettersB = b.toLowerCase().split("");

        for (int i = 0; i < lettersA.length; i++) {
            int contA = 0;
            for (int j = 0; j < lettersA.length; j++) {
                if (lettersA[i].equals(lettersA[j])) contA++;
            }

            int contB = 0;
            for (int j = 0; j < lettersB.length; j++) {
                if (lettersA[i].equals(lettersB[j])) contB++;
            }

            if (contA != contB) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
