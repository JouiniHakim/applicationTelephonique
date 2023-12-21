package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation.SuppressLint;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;

import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    Button btn1,btn2;
    TextView tv1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        tv1 = findViewById(R.id.tv1);



        et1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String phone = charSequence.toString();
                int backgroundRed = Color.RED;
                int backgroundBlue = Color.BLUE;
                int backgroundCyan = Color.CYAN;

                if(phone.startsWith("9")){
                    tv1.setText("votre ligne est Telecom");
                    et3.setBackgroundColor(backgroundBlue);


                } else if (phone.startsWith("5")) {
                    tv1.setText("votre ligne est orange");


                    et3.setBackgroundColor(backgroundRed);

                }else{
                    tv1.setText("votre ligne est ooredoo");
                    et3.setBackgroundColor(backgroundCyan);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        et2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(14)});





    }
}