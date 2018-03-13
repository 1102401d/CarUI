package com.rickneilson.carui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class FavouriteViewJ extends AppCompatActivity implements View.OnClickListener{
    private Button back_Button, home_Button;
    private ArrayList<String> favouriteSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        ListView faveList = (ListView) findViewById(R.id.faveView);
        faveList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> ad, View view, int pos, long arg) {
                if(pos == 1) {
                    startActivity(new Intent(FavouriteViewJ.this, NowPlayingActivity.class));
                }
            }
        });

        favouriteSongs = new ArrayList<>();
        favouriteSongs.add("Jenny Was a Friend of Mine by The Killers");
        favouriteSongs.add("Mr Brightside by The Killers");
        favouriteSongs.add("Purple Rain by Prince");
        favouriteSongs.add("Stayin' Alive by The Bee Gees");
        favouriteSongs.add("You Can Call me Al by Paul Simon");
        favouriteSongs.add("Stand By Me by Ben E King");
        favouriteSongs.add("Somebody's Watching Me by Rockwell");
        favouriteSongs.add("I'm Not In Love by 10cc");
        favouriteSongs.add("Sweet Caroline by Neil Diamond");
        favouriteSongs.add("Daniel by Elton John");

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, favouriteSongs);
        faveList.setAdapter(arrayAdapter);


        back_Button=(Button) findViewById(R.id.back_button);
        back_Button.setOnClickListener(this);

        home_Button=(Button) findViewById(R.id.home_button);
        home_Button.setOnClickListener(this);



    }
    @Override
    public void onClick(View v)
    {
        if(v.getId()==R.id.back_button){
            onBackPressed();
        }
        if(v.getId()==R.id.home_button){
            startActivity(new Intent(FavouriteViewJ.this, MainActivity.class));
        }
        // default method for handling onClick Events..
    }
}