package com.example.mysongreceiverapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMusicReceiver2 musicBroadCastReceiver2 = new MyMusicReceiver2();
        IntentFilter intentFilter = new IntentFilter("com.jasshugarg.imusic.currsong");
        registerReceiver(musicBroadCastReceiver2, intentFilter);

    }
}