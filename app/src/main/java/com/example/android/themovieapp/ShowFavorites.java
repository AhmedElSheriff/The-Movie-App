package com.example.android.themovieapp;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ShowFavorites extends Activity {

    ArrayList arrayList = new ArrayList();;
    FavoritesDbHelper mydb = new FavoritesDbHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_favorites);

       // arrayList = new ArrayList();
        ListView listView = (ListView) findViewById(R.id.showfavoriteslistview);
       // arrayList.add(mydb.getAll());
        arrayList = mydb.getAll();
        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.reviewsonerow,R.id.reviewsonerowtext,arrayList);
        listView.setAdapter(adapter);
    }

}
