package easy;

import java.io.*;
import java.util.*;

public class Ex32_JavaArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }

            arrayList.add(list);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x >= 1 && x <= n) {
                List<Integer> linha = arrayList.get(x - 1);
                if (y >= 1 && y <= linha.size()) {
                    System.out.println(linha.get(y - 1));
                    continue;
                }
            }

            System.out.println("ERROR!");
        }

        sc.close();
    }
}
