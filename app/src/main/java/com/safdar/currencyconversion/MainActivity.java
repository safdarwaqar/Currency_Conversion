package com.safdar.currencyconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert_Button(View view) {
        String user_Input;
        EditText dollar = findViewById(R.id.et_Dollar);
        //user_Input = dollar.getText().toString();
        int input_Value = Integer.parseInt(dollar.getText().toString());
        int dollars = input_Value;
        int dollarsToYen = 119;
        int yen = dollarsToYen * dollars;
        display(yen);
    }

    private void display(int number) {
        TextView input = findViewById(R.id.tv_result);
        input.setText("" + number);

    }
}