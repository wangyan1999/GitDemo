package com.example.dell.gitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "a", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "a", Toast.LENGTH_SHORT).show();

    }
}
