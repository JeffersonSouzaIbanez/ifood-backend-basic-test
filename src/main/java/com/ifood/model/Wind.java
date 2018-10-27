package com.ifood.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind {
	private double speed;
	private int deg;

	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getDeg() {
		return deg;
	}
	public void setDeg(int deg) {
		this.deg = deg;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wind [speed=");
		builder.append(speed);
		builder.append(", deg=");
		builder.append(deg);
		builder.append("]");
		return builder.toString();
	}
}
