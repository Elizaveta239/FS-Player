package com.turtleplayer.playlist.playorder;


import android.util.Log;
import com.turtleplayer.preferences.Preferences;

import static java.lang.Thread.sleep;

public class SpeedSensor implements Runnable {

    public SpeedSensor() {
    }

    public void run() {
        while (true) {
            Log.i(Preferences.TAG, "Sensor works");
            try {
                sleep(2000);
            } catch (Exception e) {

            }
        }
    }
}
