package com.cmpt276.kenney.portandstarboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ShipApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }
}
