package com.sharansh.patterns.adapter;

public class WeatherFinderImpl implements WeatherFinder {

  @Override
  public int find(String city) {
    int temperature = 0;
    if(city == "Bangaluru"){
      temperature = 33;
    } else if(city == "Delhi") {
      temperature = 44;
    }
    return temperature;
  }
}
