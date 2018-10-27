package com.ifood.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class CurrentWeather implements Serializable {
	@SerializedName("main")
	private String weatherGroup;
	private String description;

	public String getWeatherGroup() {
		return weatherGroup;
	}

	public void setWeatherGroup(String weatherGroup) {
		this.weatherGroup = weatherGroup;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CurrentWeather [weatherGroup=").append(weatherGroup);
		builder.append(", description=").append(description);
		builder.append("]");
		return builder.toString();
	}
}