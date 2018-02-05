package com.bitcamp.app.kaup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText name = findViewById(R.id.input_name);
        final EditText weight = findViewById(R.id.input_weight);
        final EditText height = findViewById(R.id.input_height);
        final TextView res = findViewById(R.id.res);
        findViewById(R.id.kaup_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(Command.bmi(name,weight,height));
            }
        });

    }
}
