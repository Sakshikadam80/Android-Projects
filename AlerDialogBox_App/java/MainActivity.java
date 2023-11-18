package com.example.exp7_alertdialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText user, pass;
    Button login, reset;
    AlertDialog.Builder b;
    int count=3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user=findViewById(R.id.user);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.button);
        reset=findViewById(R.id.button2);
        b = new AlertDialog.Builder(MainActivity.this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Unsucessful login", Toast.LENGTH_SHORT).show();
                    count = count - 1;
                }
                if (count == 0) {
                    b.setMessage("Wrong Credentials..Login Disabled")
                            .setCancelable(false)
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            })

                            .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    //  Action for 'NO' Button
                                    dialog.cancel();
                                }
                            });

                    AlertDialog alert = b.create();

                    alert.setTitle("Login Failed");
                    alert.show();
                    login.setEnabled(false);

                }

            }
        }
    );



    reset.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {user.setText(null);
            pass.setText(null);
            login.setEnabled(true);
            count=3;

        }
    });

}
}








