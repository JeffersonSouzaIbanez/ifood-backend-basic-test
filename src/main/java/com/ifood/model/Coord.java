package com.ifood.model;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 @JsonIgnoreProperties(ignoreUnknown = true)
public class Coord {
	private double lon;
	private double lat;
 	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coord [lon=").append(lon);
		builder.append(", lat=").append(lat);
		builder.append("]");
		return builder.toString();
	}
 }