package com.kwabenaberko.openweathermaplib.models.sixteenforecast;

import com.google.gson.annotations.SerializedName;
import com.kwabenaberko.openweathermaplib.models.common.Temp;
import com.kwabenaberko.openweathermaplib.models.common.Weather;

import java.util.List;

public class SixteenWeather {

    @SerializedName("dt")
    private Long dt;

    @SerializedName("temp")
    private Temp mTemp;

    @SerializedName("pressure")
    private double pressure;

    @SerializedName("humidity")
    private double humidity;

    @SerializedName("weather")
    private List<Weather> mWeatherArray;

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public List<Weather> getWeatherArray() {
        return mWeatherArray;
    }

    public void setWeatherArray(List<Weather> weatherArray) {
        mWeatherArray = weatherArray;
    }

    public Temp getTemp() {
        return mTemp;
    }

    public void setTemp(Temp mTemp) {
        this.mTemp = mTemp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
