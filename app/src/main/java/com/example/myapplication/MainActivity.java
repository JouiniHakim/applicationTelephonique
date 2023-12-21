package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    EditText ett1,ett2;
    Button bt1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.connectButton);
        ett1 = findViewById(R.id.usernameEditText);
        ett2 = findViewById(R.id.passwordEditText);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ett1.getText().toString().equals("hakim") && ett2.getText().toString().equals("hakim")){
                    Intent i = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i);}
                else{
                    Toast.makeText(MainActivity.this,"NOM OU MOT DE PASSE INCORRECTE",Toast.LENGTH_SHORT).show();

                }

            }
        });


    }


}