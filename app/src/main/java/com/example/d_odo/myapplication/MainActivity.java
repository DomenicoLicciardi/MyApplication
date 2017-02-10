package com.example.d_odo.myapplication;



import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by d-odo on 08/02/2017.
 */

public class MainActivity extends AppCompatActivity {
    //Button read,nascondi;
    //TextView testo
    private static final String TAG="Ciclo di vita";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        Log.d(TAG, "Sto in onCreate");
        /*read = (Button)findViewById(R.id.read);
        testo = (TextView) findViewById(R.id.testo);
        nascondi= (Button) findViewById(R.id.nascondi);
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo.setVisibility(View.VISIBLE);
            }
        });

        nascondi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testo.setVisibility(View.INVISIBLE);
            }
        });*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Sono in onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Sono in onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Sono in onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Sono in onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Sono in onDestroy");
    }
}

