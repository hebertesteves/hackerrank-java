package easy;

import java.util.*;
import java.math.*;

public class Ex22_JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger product =  a.multiply(b);
        BigInteger sum = a.add(b);

        System.out.println(sum);
        System.out.println(product);

        sc.close();
    }
}
