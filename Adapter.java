/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.lab05;

/**
 *
 * @author SATTAM
 */
import edu.kau.fcit.cpit252.geoLocation.GeoLocation;

public class Adapter implements WeatherGeo {

    private WeatherCity weatherCity;
    private GeoLocation geoLocation;

    public Adapter(WeatherCity weatherCity) {
        this.weatherCity = weatherCity;
        geoLocation = new GeoLocation();
    }

    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        String cityName = geoLocation.search(latitude, longitude);
        return this.weatherCity.getWeatherInfo(cityName);
    }

}