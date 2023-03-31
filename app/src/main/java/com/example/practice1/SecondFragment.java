package com.example.practice1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class SecondFragment extends Fragment {
String text;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText Login = R.findViewById(R.id.login);
        getChildFragmentManager()
                .setFragmentResultListener("fromLog", this, new
                        FragmentResultListener() {
                            @Override
                            public void onFragmentResult(@NonNull String
                                                                 requestKey, @NonNull Bundle bundle) {
                                Login.setText(bundle.getString("login"));


                            }
                        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}