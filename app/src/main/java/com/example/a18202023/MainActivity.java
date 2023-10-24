package com.example.a18202023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int x,y,z;
    Button button;
    EditText editTextText,editTextText2, editTextText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editTextText=findViewById(R.id.editTextText);
        editTextText2=findViewById(R.id.editTextText2);
//        editTextText3=findViewById(R.id.editTextText3);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create an object for the student class
                Student student=new Student();
                student.name="Mary";
                student.gender="female";

                student.email=String.valueOf(editTextText.getText());
                student.password=(editTextText2.getText().toString());
//                editTextText2.setText(student.idno.toString());
//                editTextText3.setText(student.Display().toString());

//                Toast.makeText(MainActivity.this, "The Campus is  "+student.Display(),
//                        Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "Welcome "+student.email,
                        Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("email", student.email);
                intent.putExtra("pass", student.password);
                startActivity(intent);
            }
        });


    }

    //add your method
}