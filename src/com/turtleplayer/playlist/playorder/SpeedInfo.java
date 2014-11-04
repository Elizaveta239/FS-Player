package com.turtleplayer.playlist.playorder;

import java.util.LinkedList;

/**
 * Created by elizabeth on 11/4/14.
 */

public class SpeedInfo {
    private LinkedList<Float> speedData;
    private int capacity = 1000;
    private int size = 0;

    SpeedInfo () {
        speedData = new LinkedList<Float>();
    }

    public void addValue(float newValue) {
        if (size == capacity) {
            speedData.removeFirst();
            size--;
        }
        speedData.addLast(newValue);
        size++;
    }

    private float getMean() {
        float sum = 0;
        for (Float val : speedData) {
            sum += val;
        }
        return sum / size;
    }

    public float getSpeed() {
        float mean = getMean();
        float diff = 0;
        for (Float val : speedData) {
            diff += Math.abs(val - mean);
        }
        return diff;
    }

}
