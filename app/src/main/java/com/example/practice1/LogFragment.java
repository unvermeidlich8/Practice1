package com.example.practice1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogFragment extends Fragment {

    String Tag = this.getClass().getSimpleName();

    public LogFragment() {
        super(R.layout.fragment_log);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public void onStart() {
        Toast.makeText(getActivity(),"onStart",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onStart");
        super.onStart();
    }

    @Override
    public void onResume() {
        Toast.makeText(getActivity(),"onResume",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onResume");
        super.onResume();
    }

    @Override
    public void onPause() {
        Toast.makeText(getActivity(),"onPause",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onPause");
        super.onPause();
    }

    @Override
    public void onStop() {
        Toast.makeText(getActivity(),"onStop",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getActivity(),"onDestroy",Toast.LENGTH_SHORT).show();
        Log.d(Tag,"onDestroy");
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText editText = R.findViewById(R.id.login);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle result = new Bundle();
                result.putString("login",editText.getText().toString());
                getParentFragmentManager().setFragmentResult("to SecondFragment",result);
            }
        });

        return null;
    }
}