package com.example.android.multimodulesample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import com.example.android.nativelib.NativeLib;

import com.example.android.multimodulesample.databinding.ActivityMainBinding;

public class MainActivity extends Activity {
    String TAG = "MainActivity";
    private TextView mTextView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NativeLib nl = new NativeLib();
        Log.d(TAG,"Before Setting Text");
        Log.d(TAG,"nl.stringFromJNI()) = " + nl.stringFromJNI());
        mTextView = binding.text;
        mTextView.setText(nl.stringFromJNI());
    }
}