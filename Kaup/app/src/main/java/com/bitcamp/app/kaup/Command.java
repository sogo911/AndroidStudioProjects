package com.bitcamp.app.kaup;

import android.widget.EditText;

/**
 * Created by 1027 on 2018-02-05.
 */

public class Command {
    public static String bmi(EditText name, EditText weight, EditText height){
        String userName = String.valueOf(name.getText());
        String res = "";
        double wei = Double.parseDouble(String.valueOf(weight.getText()));
        double hei = Double.parseDouble(String.valueOf(height.getText()));
        double bmi = wei/(hei*hei/10000);
        if (bmi<18.5){
            res = userName+"님은 저체중입니다.";
        }else if(bmi>=18.5 && bmi<=22.9){
            res = userName+"님은 정상입니다.";
        }else if(bmi>=23 && bmi<=24.9){
            res = userName+"님은 과체중입니다.";
        }else if(bmi>=25 && bmi<=29.9){
            res = userName+"님은 경도 비만(1단계 비만)입니다.";
        }else if(bmi>=30 && bmi <=34.9){
            res = userName+"님은 중등도 비만(2단계 비만)입니다.";
        }else if(bmi>30){
            res = userName+"님은 고도 비만 입니다.";
        }
        return res;
    }
}
