package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ex21_JavaPrimalityTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String n = bufferedReader.readLine();
            BigInteger num = new BigInteger(n);

            if (num.isProbablePrime(100)) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
