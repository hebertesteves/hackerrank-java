package easy;

import java.util.*;
import java.text.*;

public class Ex13_JavaCurrencyFormatter {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String numberFormatted = String.format("%.2f", payment);
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(Double.parseDouble(numberFormatted)));

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        indiaFormat.setCurrency(Currency.getInstance("INR"));
        System.out.println("India: " + indiaFormat.format(Double.parseDouble(numberFormatted)));

        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(Double.parseDouble(numberFormatted)));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(Double.parseDouble(numberFormatted)));
    }
}
