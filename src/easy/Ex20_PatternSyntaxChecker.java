package easy;

import java.text.ParseException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.*;

public class Ex20_PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
            try {
                Pattern pattern1 = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException | NoSuchElementException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
