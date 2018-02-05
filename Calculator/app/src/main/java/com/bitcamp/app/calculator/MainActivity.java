package com.bitcamp.app.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = MainActivity.this;
        final EditText inputNum1 = findViewById(R.id.input_num1);
        final EditText inputNum2 = findViewById(R.id.input_num2);
        final TextView res = findViewById(R.id.res);
        Button minusBtn = findViewById(R.id.minus_btn);
        Button multipliBtn = findViewById(R.id.multipli_btn);
        Button dibisionBtn = findViewById(R.id.dibision_btn);
        findViewById(R.id.plus_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(Command.calc(inputNum1,inputNum2,""));
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        multipliBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        dibisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
