package com.amy.mysecondapp;

import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by amy on 1/16/15.
 */
public interface WeatherService {
    @GET("/")
    public Response fetchWeather(@Query("weather") String weather);

}


////@GET("/users/{user}")
//public SomeUserModel fetchUser(@Path("user") String user);
// api.openweathermap.org/data/2.5/