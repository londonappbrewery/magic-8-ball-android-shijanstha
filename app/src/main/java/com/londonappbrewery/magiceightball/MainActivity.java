package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay;
        ballDisplay = (ImageView) findViewById(R.id.image_eightBall);

        final int[] ballArray = new int[]{R.drawable.ball_1,
                R.drawable.ball_2,
                R.drawable.ball_3,
                R.drawable.ball_4,
                R.drawable.ball_5};

        Button myButton;
        myButton = findViewById(R.id.askButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);
            }
        });


    }
}
