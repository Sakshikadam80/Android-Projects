package com.example.optionsmenuapp_exp8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar t= findViewById(R.id.toolbar);
        t.setTitle("Home");
        setSupportActionBar(t);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.sample_menu,menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.m1){
            Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.m2) {
            Toast.makeText(this,"Item 2",Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId()==R.id.m3) {
            Toast.makeText(this,"Item 3", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}