package com.turtleplayer.playlist.playorder;


import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;
import com.turtleplayer.preferences.Preferences;

public class SpeedSensor implements SensorEventListener {
    private double xy_angle = 0;
    private double xz_angle = 0;
    private double zy_angle = 0;

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        xy_angle = sensorEvent.values[0];
        xz_angle = sensorEvent.values[1];
        zy_angle = sensorEvent.values[2];
        double val = Math.sqrt(xy_angle * xy_angle + xz_angle * xz_angle + zy_angle * zy_angle);
        //String coord = String.valueOf(xy_angle) + " " + String.valueOf(xz_angle) + " " + String.valueOf(zy_angle);
        Log.i(Preferences.TAG, String.valueOf(val));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
