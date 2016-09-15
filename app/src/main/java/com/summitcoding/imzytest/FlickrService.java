package com.summitcoding.imzytest;

import org.json.JSONObject;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by Logan on 9/14/2016.
 */
public interface FlickrService {
    String SERVICE_ENDPOINT = "https://api.flickr.com";

    @GET("/services/rest/?method=flickr.photos.search&api_key=3a727909787cc320f383326b499b367e&format=json&nojsoncallback=1")
    Observable<Flickr> getPhotos(@Query("text") String text);
}
