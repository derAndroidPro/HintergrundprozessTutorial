package de.derandroidpro.hintergrundprozesstutorial;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class Hintergrundservice extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(getApplicationContext(), "Hintergrundprozess wurde ausgeführt!", Toast.LENGTH_LONG).show();
        Log.d("Hintergrundprozess", "Hintergrundprozess wurde ausgeführt!");
        stopSelf();

        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
