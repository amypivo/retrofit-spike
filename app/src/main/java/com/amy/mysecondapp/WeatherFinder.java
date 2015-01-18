package com.amy.mysecondapp;

import android.os.AsyncTask;

import retrofit.RestAdapter;
import retrofit.client.Response;
import retrofit.converter.GsonConverter;

/**
 * Created by amy on 1/16/15.
 */
public class WeatherFinder extends AsyncTask {

    public WeatherFinder() {

    }

    @Override
    protected Object doInBackground(Object[] city) {
        RestAdapter.Builder adapterBuilder = new RestAdapter.Builder();
        adapterBuilder
                .setEndpoint("http://www.api.openweathermap.org/data/2.5/");

        RestAdapter adapter = adapterBuilder.build();
        WeatherService service =
                adapter.create(WeatherService.class);
        Response weather = service.fetchWeather(String.valueOf(city));
        return weather.toString();
    }

}
