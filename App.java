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
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class App {

    public static void main(String[] args) {
       
        WeatherCity wCity = new WeatherDBI();
        Adapter weateherAdapter = new Adapter(wCity);
        String weatherInfo = weateherAdapter.getWeatherInfo(21.543333, 39.172778);
        System.out.println(weatherInfo);    
    }
}