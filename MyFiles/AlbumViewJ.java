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

public class AlbumViewJ extends AppCompatActivity implements View.OnClickListener{
    private Button back_Button;
    private Button home_Button;
    private ArrayList<String> hotFussSongs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ListView songList = (ListView) findViewById(R.id.listView);
        songList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> ad, View view, int pos, long arg) {
                if(pos == 1) {
                    startActivity(new Intent(AlbumViewJ.this, NowPlayingActivity.class));
                }
            }
        });


        hotFussSongs = new ArrayList<>();
        hotFussSongs.add("Jenny Was a Friend of Mine");
        hotFussSongs.add("Mr Brightside");
        hotFussSongs.add("Smile Like You Mean It");
        hotFussSongs.add("Somebody Told Me");
        hotFussSongs.add("All These Things That I've Done");
        hotFussSongs.add("Andy, You're a Star");
        hotFussSongs.add("On Top");
        hotFussSongs.add("Change Your Mind");
        hotFussSongs.add("Believe Me Natalie");
        hotFussSongs.add("Midnight Snow");
        hotFussSongs.add("Everything Will Be Alright");

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, hotFussSongs);
        songList.setAdapter(arrayAdapter);


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
           startActivity(new Intent(AlbumViewJ.this, MainActivity.class));
       }
    }
}
