package com.example.intentsproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    EditText et_n1;
    EditText et_n2;
    TextView tv_answer;

    String number1;
    String number2;

    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        et_n1 = findViewById(R.id.et_n1);
        et_n2 = findViewById(R.id.et_n2);
        tv_answer = findViewById(R.id.tv_answer);

        //get main activity's value and assigned to the strings
        Intent intent = getIntent();
        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        //set text
        et_n1.setText(number1);
        et_n2.setText(number2);

        //convert String to Int
        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);

    }

    //buttons methods
    public void add(View view){
        tv_answer.setText(number1+"+"+number2 +"=" + (n1+n2));
    }
    public void sub(View view){
        tv_answer.setText(number1+"-"+number2 +"=" + (n1-n2));
    }
    public void mul(View view){
        tv_answer.setText(number1+"*"+number2 +"=" + (n1*n2));
    }
    public void devide(View view){
        tv_answer.setText(number1+"/"+number2 +"=" + (n1/n2));
    }


}