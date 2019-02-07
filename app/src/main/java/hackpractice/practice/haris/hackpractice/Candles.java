package hackpractice.practice.haris.hackpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by muhammadharis on 6/18/18.
 */

public class Candles {


    static int birthdayCakeCandles(int[] ar) {


        int noOfCandles=0;

        int temp=ar[0];

        for (int i = 0; i < ar.length; i++) {


            if (ar[i]>temp){
                temp=ar[i];
                noOfCandles=0;
            }

            if (temp == ar[i]){
                noOfCandles++;
            }

        }

        return noOfCandles;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
