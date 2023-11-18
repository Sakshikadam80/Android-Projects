package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity3 extends AppCompatActivity {
    EditText e1,e2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);
        b=findViewById(R.id.button);

        Intent i = getIntent();
        e1.setText(i.getStringExtra("Name"));
        e2.setText(i.getStringExtra("Gmail"));

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity3.this,"Thank-You for Connecting!!! " , Toast.LENGTH_LONG).show();
            }
        });
    }
}