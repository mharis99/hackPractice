package hackpractice.practice.haris.hackpractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by muhammadharis on 11/11/18.
 */

public class Pebbles {


    static int calculate( int input1,int input2[], int input3)
    {

        int mod[] = new int[input3];
        Arrays.fill(mod, 0);

        int cumSum = 0;
        for (int i = 0; i < input1; i++) {
            cumSum += input2[i];

            mod[((cumSum % input3) + input3) % input3]++;
        }

        int result = 0;


        for (int i = 0; i < input3; i++)

            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;

        result += mod[0];

        return result;

    }



    static int calculateMissingBowl( int input1,int input2[])
    {

        int sum=input2[0] +  input2[input1-1];


        for (int i = 0; i < input2.length; i++) {
            if ( input2[i] + input2[input1-1-i] == sum ){
                continue;
            }

            return sum - input2[i];

        }

        return -1;


    }








}
