package hackpractice.practice.haris.hackpractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by muhammadharis on 1/12/19.
 */

public class Anagram {


    public static List<Integer> getMinimumDifference(List<String> a, List<String> b){



        List<Integer> results=new ArrayList<>();


        for (int i = 1; i <a.size()  ; i++) {


            // if the no of characters are not same not an anagram - CASE 1
            if (a.get(i).length() != b.get(i).length() ){

                results.add(-1);

                continue;
            }

            // if the no of characters are not same not an anagram


            //anagram calculation

            // if the no of chareacters are same and alphabets re same means an anagram CASE 2

//            char tempArrayA[] = a.get(i).toCharArray();
//            char tempArrayB[] = b.get(i).toCharArray();
//            Arrays.sort(tempArrayA);
//            Arrays.sort(tempArrayB);
//
//            if (Arrays.equals(tempArrayA,tempArrayB)){ // anagram and no change
//
//
//                results.add(0);
//
//                continue;
//
//            }

            // if the no of chareacters are same and alphabets re same means an anagram



            //if the length is same but the characters are different CASE 3





//            // character
//            int countA[] = new int[26];
//            int countB[] = new int[26];
//
//
//            for (int j = 0; j < a.get(i).length() ; j++){
//                countA[a.get(i).charAt(j) -'a']++;
//
//            }
//
//
//            // in second string
//            for (int k = 0; k < b.get(i).length() ; k++){
//                countB[b.get(i).charAt(k) -'a']++;
//
//            }



//            int result = 0;
//            for (int l = 0; l < 26; l++){
//                result += Math.abs(countA[l] -
//                        countB[l]);
//            }







            int count=0;

            int char_count[] = new int[26];

            // iterate though the first String and update
            // count
            for (int m = 0; m < a.get(i).length(); m++){
                char_count[a.get(i).charAt(m) - 'a']++;

            }


            // iterate through the second string
            // update char_count.
            // if character is not found in char_count
            // then increase count
            for (int n = 0; n < b.get(i).length(); n++){

                if (char_count[b.get(i).charAt(n) - 'a']-- <= 0){
                    count++;
                }


            }


            results.add(count);



            //if the length is same but the characters are different

        }


        return results;


    }
}
