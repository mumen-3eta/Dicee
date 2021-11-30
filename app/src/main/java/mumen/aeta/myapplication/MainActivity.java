package mumen.aeta.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Visibility;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final RelativeLayout layout = findViewById(R.id.win_layout);
        layout.setVisibility(View.INVISIBLE);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int[] vis = {0,1};
                layout.setVisibility(View.INVISIBLE);
                int num1;
                int num2;
                int number = randomNumberGenerator.nextInt(6);
                num1 = number;
                leftDice.setImageResource(diceArray[number]);
                number = randomNumberGenerator.nextInt(6);
                num2 = number;
                rightDice.setImageResource(diceArray[number]);
                if (num1 == num2){
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}