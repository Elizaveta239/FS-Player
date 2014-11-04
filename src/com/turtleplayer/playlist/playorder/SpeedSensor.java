package com.turtleplayer.playlist.playorder;


import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class SpeedSensor implements SensorEventListener {
    private SpeedInfo info;
    private float xy_angle = 0;
    private float xz_angle = 0;
    private float zy_angle = 0;

    public SpeedSensor() {
        info = new SpeedInfo();
    }

    public SpeedInfo getInfo() {
        return info;
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        xy_angle = sensorEvent.values[0];
        xz_angle = sensorEvent.values[1];
        zy_angle = sensorEvent.values[2];
        float val = (float)Math.sqrt(xy_angle * xy_angle + xz_angle * xz_angle + zy_angle * zy_angle);
        info.addValue(val);
        //String coord = String.valueOf(xy_angle) + " " + String.valueOf(xz_angle) + " " + String.valueOf(zy_angle);
        //Log.i(Preferences.TAG, String.valueOf(val));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
