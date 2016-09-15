package com.summitcoding.imzytest;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity
        implements SearchView.OnQueryTextListener{

    private CardAdapter mCardAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mCardAdapter = new CardAdapter();
        mRecyclerView.setAdapter(mCardAdapter);

    }

    private String search() {

        return "";
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        FlickrService service = ServiceFactory.createRetrofitService(FlickrService.class, FlickrService.SERVICE_ENDPOINT);
        service.getPhotos(query)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Flickr>() {

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("TEST", "Error: " + e.getMessage());
                    }

                    @Override
                    public void onNext(Flickr response) {
                        Log.d("TEST", "Response: " + response.getTotal());
                        mCardAdapter.addData(response);
                    }
                });
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }
}
