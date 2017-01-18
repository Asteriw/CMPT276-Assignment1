package com.cmpt276.kenney.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "ShipApp";
    private Game ShipQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the game to work
        ShipQuiz = new Game();

        final TextView answer = (TextView) findViewById(R.id.quizanswer);
        answer.setText(ShipQuiz.getChosenSideName());

        //Getting the buttons to log
        Button btnleft = (Button) findViewById(R.id.buttonleft);
        btnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Port (left) is red");
                Toast.makeText(getApplicationContext(), "Port (left) is red", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button btnright = (Button) findViewById(R.id.buttonright);
        btnright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Starboard (right) is green.");
                Toast.makeText(getApplicationContext(), "Starboard (right) is green.", Toast.LENGTH_SHORT)
                        .show();
            }
        });

        Button btnbleft = (Button) findViewById(R.id.bottombuttonleft);
        btnbleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ShipQuiz.checkIfCorrect(Game.Side.PORT))
                {
                    Log.i(TAG, "User guess of Port was Correct!");
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT)
                            .show();
                }
                else
                {
                    Log.i(TAG, "User guess of Port was Incorrect");
                    Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_SHORT)
                            .show();
                }
                ShipQuiz = new Game();
                answer.setText(ShipQuiz.getChosenSideName());
            }
        });

        Button btnbright = (Button) findViewById(R.id.bottombuttonright);
        btnbright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ShipQuiz.checkIfCorrect(Game.Side.STARBOARD))
                {
                    Log.i(TAG, "User guess of Starboard was Correct!");
                    Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT)
                            .show();
                }
                else
                {
                    Log.i(TAG, "User guess of Starboard was Incorrect");
                    Toast.makeText(getApplicationContext(), "Incorrect!", Toast.LENGTH_SHORT)
                            .show();
                }
                ShipQuiz = new Game();
                answer.setText(ShipQuiz.getChosenSideName());
            }
        });
    }
}
