package com.ifood.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	private String main;

	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Weather [main=").append(main);
		builder.append("]");
		return builder.toString();
	}

}
