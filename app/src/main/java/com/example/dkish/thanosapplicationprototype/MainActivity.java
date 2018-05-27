package com.example.dkish.thanosapplicationprototype;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;


/**
 * This app displays an order button to obtain a random infinity stone.
 */
public class MainActivity extends AppCompatActivity {

    String[] stones = {"Reality Stone" , "Mind Stone" , "Soul Stone" , "Time Stone" , "Space Stone" , "Power Stone"};
    ArrayList<Integer> order = new ArrayList<Integer>(6);
    int i=0;


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        order.add(1);
        order.add(2);
        order.add(3);
        order.add(4);
        order.add(5);
        order.add(6);
        Collections.shuffle(order);

    }
    Integer [] neworder = order.toArray(new Integer[order.size()]);




    public void generateStone(View view) {
        display(neworder[i++]);
    }


    private void display(int number) {
        TextView stoneName = (TextView) findViewById(R.id.stone_name);
        stoneName.setText(stones[number]);
        switch(neworder[number]) {
            case 1:
                stoneName.setBackgroundColor(Color.rgb(255,0,0));
                break;
            case 2:
                stoneName.setBackgroundColor(Color.rgb(255,255,0));
                break;
            case 3:
                stoneName.setBackgroundColor(Color.rgb(255, 165, 0));
                break;
            case 4:
                stoneName.setBackgroundColor(Color.rgb(0,255,0));
                break;
            case 5:
                stoneName.setBackgroundColor(Color.rgb(0,0,255));
                break;
            case 6:
                stoneName.setBackgroundColor(Color.rgb(75, 0, 130));
                break;
                default: break;
        }


        TextView gauntlet = (TextView) findViewById(R.id.first);
        gauntlet.setText("The Gauntlet currently holds");
        TextView holds = (TextView) findViewById(R.id.holds);
        holds.setText(stones[number]);
    }
}
