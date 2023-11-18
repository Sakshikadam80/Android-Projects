package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class MainActivity2 extends AppCompatActivity {

    ToggleButton toggleButton;
    EditText e1,e2;

    ImageButton insta;
    ImageButton github;
    ImageButton gmail;
    ImageButton linkedin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        github=findViewById(R.id.img1);
        linkedin=findViewById(R.id.img2);
        gmail=findViewById(R.id.img3);
        insta=findViewById(R.id.img4);
        e1=findViewById(R.id.editText);
        e2=findViewById(R.id.editText2);

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://github.com/Sakshikadam80");
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.linkedin.com/in/sakshi-kadam-475331212/");
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://sakshikadam5050@gmail.com");
            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://instagram.com/sakshi.__kadam?igshid=OGQ5ZDc2ODk2ZA==");
            }
        });

        


        toggleButton = findViewById(R.id.toggleButton);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                Intent i=new Intent(MainActivity2.this, MainActivity3.class);
                i.putExtra("Name", s1);
                i.putExtra("Gmail", s2);
                startActivity(i);
            }


        });


    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}