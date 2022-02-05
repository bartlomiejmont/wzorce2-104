package com.company.adapter;

public class ApiResponse {
    private float temperature;
    private String cloudiness;

    public ApiResponse(float temperature, String cloudiness) {
        this.temperature = temperature;
        this.cloudiness = cloudiness;
    }

    public float getTemperature() {
        return temperature;
    }

    public String getCloudiness() {
        return cloudiness;
    }
}
