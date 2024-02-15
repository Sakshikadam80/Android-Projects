package com.example.splashscreenformajorproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity2 extends AppCompatActivity {

    private CardView c1, c2, c3, c4;
    private LinearLayout l1, l2, l3, l4;

    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Find your CardViews and LinearLayouts
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);

        l1 = findViewById(R.id.l1);
        l2 = findViewById(R.id.l2);
        l3 = findViewById(R.id.l3);
        l4 = findViewById(R.id.l4);

        i1=findViewById( R.id.i1 );

        // Apply animations with delay
        applyCardAnimation(c1, l1, 0);
        applyCardAnimation(c2, l2, 1000); // Introduce a delay of 1000 milliseconds (1 second)
        applyCardAnimation(c3, l3, 2000); // Introduce a delay of 2000 milliseconds (2 seconds)
        applyCardAnimation(c4, l4, 3000); // Introduce a delay of 3000 milliseconds (3 seconds)
    }

    private void applyCardAnimation(CardView cardView, final View view, int delay) {
        // Slide-in Animation from left to right
        Animation slideIn = new TranslateAnimation(-200, 0, 0, 0);
        slideIn.setDuration(2000); // Adjust the duration as needed
        slideIn.setStartOffset(delay);
        cardView.startAnimation(slideIn);

        // Fade-in Animation
        Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setDuration(2000); // Adjust the duration as needed
        fadeIn.setStartOffset(delay);
        cardView.startAnimation(fadeIn);

        // Pop-up Text Animation
        Animation popUp = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        popUp.setDuration(1000); // Adjust the duration as needed
        popUp.setStartOffset(delay);
        view.startAnimation(popUp);

        c1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity( i );
            }
        } );

        c2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity( i );
            }
        } );
        c3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainActivity5.class);
                startActivity( i );
            }
        } );
        c4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainActivity6.class);
                startActivity( i );
            }
        } );

        i1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this, MainActivity7.class);
                startActivity( i );

            }
        } );
    }
}
