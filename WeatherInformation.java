/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lab05;

/**
 *
 * @author SATTAM
 */
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class WeatherInfomation {
    @JsonProperty("dayhour")
    private String time;
    private double tempInC;
    private double tempInF;

    @SuppressWarnings("unchecked")
    @JsonProperty("temp")
    private void unpackNested(Map<String,Object> temp) {
        this.tempInC = (double)temp.get("c");
        this.tempInF = (double)temp.get("f");
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getTempInC() {
        return tempInC;
    }

    public void setTempInC(double tempInC) {
        this.tempInC = tempInC;
    }

    public double getTempInF() {
        return tempInF;
    }

    public void setTempInF(double tempInF) {
        this.tempInF = tempInF;
    }

    @Override
    public String toString() {
        return "WeatherInfo{" +
                "time='" + time + '\'' +
                ", tempInC=" + tempInC +
                ", tempInF=" + tempInF +
                '}';
    }
}