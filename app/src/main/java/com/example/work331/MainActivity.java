package com.example.work331;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView output = findViewById(R.id.output);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button btn = (Button) v;
                if (output.getText().toString().contains(".") && btn.getText().equals(".")) {
                    Toast.makeText(MainActivity.this, getText(R.string.point_tosk), Toast.LENGTH_LONG).show();
                } else {
                    String num = output.getText().toString() + btn.getText();
                    output.setText(num);
                }


            }
        };

        Button one = findViewById(R.id.one);
        one.setOnClickListener(listener);

        Button two = findViewById(R.id.two);
        two.setOnClickListener(listener);

        Button three = findViewById(R.id.three);
        three.setOnClickListener(listener);

        Button four = findViewById(R.id.four);
        four.setOnClickListener(listener);

        Button five = findViewById(R.id.five);
        five.setOnClickListener(listener);

        Button six = findViewById(R.id.six);
        six.setOnClickListener(listener);

        Button seven = findViewById(R.id.seven);
        seven.setOnClickListener(listener);

        Button eight = findViewById(R.id.eight);
        eight.setOnClickListener(listener);

        Button nine = findViewById(R.id.nine);
        nine.setOnClickListener(listener);

        Button zero = findViewById(R.id.zero);
        zero.setOnClickListener(listener);

        Button point = findViewById(R.id.point);
        point.setOnClickListener(listener);

    }
}
