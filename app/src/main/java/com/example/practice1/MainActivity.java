package com.example.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Жизненный цикл";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onCreate");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStart");
        Log.e(TAG,"onStart");
        Log.w(TAG,"onStart");
        Log.d(TAG,"onStart");
        Log.v(TAG,"onStart");


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onDestroy");
        Log.e(TAG,"onDestroy");
        Log.w(TAG,"onDestroy");
        Log.d(TAG,"onDestroy");
        Log.v(TAG,"onDestroy");


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onRestart");
        Log.e(TAG,"onRestart");
        Log.w(TAG,"onRestart");
        Log.d(TAG,"onRestart");
        Log.v(TAG,"onRestart");


    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStop");
        Log.e(TAG,"onStop");
        Log.w(TAG,"onStop");
        Log.d(TAG,"onStop");
        Log.v(TAG,"onStop");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onResume");
        Log.e(TAG,"onResume");
        Log.w(TAG,"onResume");
        Log.d(TAG,"onResume");
        Log.v(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_LONG).show();
        Log.i(TAG,"onPause");
        Log.e(TAG,"onPause");
        Log.w(TAG,"onPause");
        Log.d(TAG,"onPause");
        Log.v(TAG,"onPause");

    }
}