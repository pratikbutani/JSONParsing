package com.androidbuts.jsonparsingfull;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void simpleReceiveData(View view) {
        Intent intent = new Intent(MainActivity.this, SimpleReceiveDataActivity.class);
        startActivity(intent);
    }

    public void simpleSendData(View view) {
    }

    public void okhttpReceiveData(View view) {
    }

    public void okhttpSendData(View view) {
    }

    public void uploadImage(View view) {
    }
}
