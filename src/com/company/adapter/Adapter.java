package com.company.adapter;

public class Adapter implements NewInterface {

    private final OldAPI oldAPI;

    public Adapter(OldAPI oldAPI) {
        this.oldAPI = oldAPI;
    }

    @Override
    public float getTemperature() {
        ApiResponse apiResponse = this.oldAPI.getWeatherData();
        float temperatureInFahrenheit = apiResponse.getTemperature()*9/5+32;
        return temperatureInFahrenheit;
    }
}
