package inlämningsuppgift;

import java.util.Scanner;

public class test {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Lines lines = new Lines();

        System.out.println("skriv ord och skriv stop för att stoppa");
        while (!lines.isStopped()) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("stop")) {
                lines.setStopped(true);
            } else {
                lines.calculate(input);
            }

                lines.print();
            }
        }
    }