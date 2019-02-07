package hackpractice.practice.haris.hackpractice;

import java.util.Scanner;

/**
 * Created by muhammadharis on 6/18/18.
 */

public class Pyramid {



    static void staircase(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (j < n-(i+1)){


                    System.out.print(" ");
                }else {

                    System.out.print("#");
                }

            }

            System.out.print("\n");

        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
