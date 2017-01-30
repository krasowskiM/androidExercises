package com.example.maciek.exercisesmk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maciek on 2017-01-28.
 */

public class CalculatorActivity extends AppCompatActivity {

    private static int ZERO = 0;
    private static int ONE = 1;
    private static int TWO = 2;
    private static int THREE = 3;
    private static int FOUR = 4;
    private static int FIVE = 5;
    private static int SIX = 6;
    private static int SEVEN = 7;
    private static int EIGHT = 8;
    private static int NINE = 9;
    private static int DOT = 10;
    private static int EQUALS = 11;
    private List<Button> buttons;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_activity);
        initButtons();
    }+                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ++----*********

    private void initButtons(){
        Button buttonZero = (Button) findViewById(R.id.button_zero);
        Button buttonOne = (Button) findViewById(R.id.button_one);
        Button buttonTwo = (Button) findViewById(R.id.button_two);
        Button buttonThree = (Button) findViewById(R.id.button_three);
        Button buttonFour = (Button) findViewById(R.id.button_four);
        Button buttonFive = (Button) findViewById(R.id.button_five);
        Button buttonSix = (Button) findViewById(R.id.button_six);
        Button buttonSeven = (Button) findViewById(R.id.button_seven);
        Button buttonEight = (Button) findViewById(R.id.button_eight);
        Button buttonNine = (Button) findViewById(R.id.button_nine);
        Button buttonEquals = (Button) findViewById(R.id.button_equals);
        Button buttonDot = (Button) findViewById(R.id.button_dot);
        buttons = new ArrayList<>();
        buttons.add(buttonZero);
        buttons.add(buttonOne);
        buttons.add(buttonTwo);
        buttons.add(buttonThree);
        buttons.add(buttonFour);
        buttons.add(buttonFive);
        buttons.add(buttonSix);
        buttons.add(buttonSeven);
        buttons.add(buttonEight);
        buttons.add(buttonNine);
        buttons.add(buttonDot);
        buttons.add(buttonEquals);

        for(int i = 0; i < buttons.size(); i++){
            buttons.get(i).setOnClickListener(new OnButtonClickListener(i));
        }
    }

    private void onButtonClick(int position){
        Log.e("aaaa", "Clicked button on position" + position);
    }

    private class OnButtonClickListener implements View.OnClickListener {
        private int buttonPosition;

        public OnButtonClickListener(int buttonPosition) {
            this.buttonPosition = buttonPosition;
        }

        @Override
        public void onClick(View v) {
            onButtonClick(buttonPosition);
        }
    }
}
