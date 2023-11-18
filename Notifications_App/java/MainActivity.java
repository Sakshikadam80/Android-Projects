package com.example.notifications_exp9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button b;
    NotificationManager manager;
    String CHANNEL_ID = "my_channel_01";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        manager = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
                {
                    CharSequence name = "my_channel";
                    String Description = "This is my channel";
                    int importance = NotificationManager.IMPORTANCE_HIGH;

                    NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);

                    mChannel.setDescription(Description);
                    mChannel.enableLights(true);
                    mChannel.setLightColor(Color.RED);
                    mChannel.enableVibration(true);
                    mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
                    mChannel.setShowBadge(false);

                    manager.createNotificationChannel(mChannel);
                }

                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID);
                builder.setSmallIcon(R.drawable.sample);
                builder.setContentTitle("System's Notification");
                builder.setContentText("Hello Sakshi! Their's an Update");

                Intent notificationIntent = new Intent(MainActivity.this, Notification.class);
                PendingIntent contentIntent = PendingIntent.getActivity(MainActivity.this, 0,
                        notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

                builder.setContentIntent(contentIntent);

                manager.notify(0, builder.build());

            }
        });
    }
}