package com.example.splashscreenformajorproject;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find your views
        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        // ImageView Animation
        imageView.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(3000) // Adjust duration as needed
                .start();

        // TextView Animation
        android.view.animation.Animation fadeIn = new AlphaAnimation(0, 1);
        fadeIn.setInterpolator(new DecelerateInterpolator()); // Use an interpolator
        fadeIn.setDuration(3000); // Adjust duration as needed
        textView.startAnimation(fadeIn);

        // TextView Translation Animation (Drop from above)
        ObjectAnimator translationY = ObjectAnimator.ofFloat(textView, "translationY", -1000f, 0f);
        translationY.setDuration(3000); // Adjust duration as needed
        translationY.setInterpolator(new AccelerateDecelerateInterpolator());
        translationY.start();

        // Delay for 6 seconds before starting the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
                finish(); // close this activity to prevent going back to the splash screen
            }
        }, 6000);
    }
}
