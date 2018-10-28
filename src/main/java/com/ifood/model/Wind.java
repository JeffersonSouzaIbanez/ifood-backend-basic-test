package com.ifood.model;

import java.io.Serializable;

/**
 * Wind class
 *
 * @author Jefferson Ibanez
 */
public class Wind implements Serializable {

    private static final long serialVersionUID = 6064313218283056340L;

    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Wind [speed=");
        builder.append(speed);
        builder.append("]");
        return builder.toString();
    }
}
