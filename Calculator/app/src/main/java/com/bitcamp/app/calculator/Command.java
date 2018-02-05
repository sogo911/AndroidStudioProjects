package com.bitcamp.app.calculator;

import android.widget.EditText;

/**
 * Created by 1027 on 2018-02-05.
 */

public class Command {
    public static int calc(EditText inputNum1, EditText inputNum2, String s) {
        return Integer.parseInt(String.valueOf(inputNum1.getText()));
    }
}
