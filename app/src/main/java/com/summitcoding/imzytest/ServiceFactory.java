package com.summitcoding.imzytest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit.RestAdapter;
import retrofit.android.AndroidLog;

/**
 * Created by Logan on 9/14/2016.
 */

public class ServiceFactory {

    /**
     * Creates a retrofit service from an arbitrary class (clazz)
     * @param clazz Java interface of the retrofit service
     * @param endPoint REST endpoint url
     * @return retrofit service with defined endpoint
     */
    public static <T> T createRetrofitService(final Class<T> clazz, final String endPoint) {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setLog(new AndroidLog("TEST"))
                .setEndpoint(endPoint)
                .setConverter(new LenientGsonConverter(new GsonBuilder().create()))
                .build();
        T service = restAdapter.create(clazz);

        return service;
    }
}