package com.kwabenaberko.openweathermaplib.models.sixteenforecast;

import com.google.gson.annotations.SerializedName;
import com.kwabenaberko.openweathermaplib.models.threehourforecast.City;

import java.util.List;

public class SixteenForecast {

    @SerializedName("cod")
    private String cod;

    @SerializedName("message")
    private double message;

    @SerializedName("cnt")
    private int cnt;

    @SerializedName("city")
    private City mCity;

    @SerializedName("list")
    private List<SixteenWeather> mSixteenWeatherArray;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public City getCity() {
        return mCity;
    }

    public void setCity(City city) {
        mCity = city;
    }

    public List<SixteenWeather> getSixteenWeatherArray() {
        return mSixteenWeatherArray;
    }

    public void setSixteenWeatherArray(List<SixteenWeather> sixteenWeatherArray) {
        mSixteenWeatherArray = sixteenWeatherArray;
    }
}
