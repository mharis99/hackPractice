package hackpractice.practice.haris.hackpractice;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView showResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showResult= (TextView) findViewById(R.id.showResult);


        int arr[] = { 1,2,-1,4,5};
        int k = 9;

        //showResult.setText(String.valueOf(Pebbles.calculate(5,arr,k)));

        //System.out.println( "this is the final result"+ String.valueOf(Pebbles.calculate(5,arr,k)));


        List<String> a=new ArrayList<>();

        List<String> b=new ArrayList<>();


        a.add("5");
        a.add("a");
        a.add("jk");
        a.add("abb");
        a.add("mn");
        a.add("abc");





        b.add("5");
        b.add("bb");
        b.add("kj");
        b.add("bbc");
        b.add("op");
        b.add("def");



        List<Integer> returnedRes=Anagram.getMinimumDifference(a,b);


        for (int i = 0; i < returnedRes.size(); i++) {
            System.out.println( "this is the final result"+ String.valueOf(returnedRes.get(i)));
        }


        //System.out.println( "this is the final result"+ String.valueOf(Pebbles.calculate(5,arr,k)));









    }
}
