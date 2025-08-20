package easy;

import java.io.*;

public class Ex28_Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[6][6];

        for (int i = 0; i < a.length; i++) {
            String[] tokens = br.readLine().trim().split("\\s+");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Integer.parseInt(tokens[j]);
            }
        }

        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = 0; j < a[i].length - 2; j++) {
                    int sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];

                    if (sum > maior) {
                        maior = sum;
                    }
            }
        }

        System.out.println(maior);
    }
}
