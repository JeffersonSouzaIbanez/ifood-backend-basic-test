package com.ifood.model;

import java.io.Serializable;

public class Wind implements Serializable {
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
