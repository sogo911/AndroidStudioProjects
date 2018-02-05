package com.bitcamp.app.lotto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView lottoNum = findViewById(R.id.lottonum);
        findViewById(R.id.lotto_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int arr[] = new int[6];
                String num = "";
                    for (int i=0;i<arr.length;i++){
                        arr[i] = (int)((Math.random()*45)+1);
                        for(int j=0;j<i;j++){
                            if (arr[i]==arr[j]){
                                i=i;
                            }
                        }
                    }
                Arrays.sort(arr);
                for(int a =0; a<6; a++){
                    num +=arr[a]+" ";
                }
                lottoNum.setText(num);
            }
        });
    }
}
