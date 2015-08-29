package de.derandroidpro.hintergrundprozesstutorial;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlarmManager alarmManager = (AlarmManager) MainActivity.this.getSystemService(MainActivity.this.ALARM_SERVICE);

        Intent startServiceIntent = new Intent(MainActivity.this, Hintergrundservice.class);
        PendingIntent startServicePendingIntent = PendingIntent.getService(MainActivity.this,0,startServiceIntent,0);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis() + 1000*60*10);

        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(), 1000*60*10, startServicePendingIntent);


    }

}
