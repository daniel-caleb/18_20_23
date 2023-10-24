package com.example.a18202023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText editTextText3,editTextText4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextText3 = findViewById(R.id.editTextText3);
        editTextText4 = findViewById(R.id.editTextText4);

        Intent intent=getIntent();
        String str=intent.getStringExtra("email");
        String pass=intent.getStringExtra("pass");
        editTextText3.setText(str);
        editTextText4.setText(pass);
    }
}