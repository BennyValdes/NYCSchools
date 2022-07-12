package com.example.nycschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import com.example.nycschool.view.Listener;
import com.example.nycschool.view.SchoolDetails;
import com.example.nycschool.view.SchoolDisplay;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity implements Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDisplayFragment();
    }

    private void showDisplayFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SchoolDisplay())
                .commit();
    }

    @Override
    public void openDetails(String dbn, String name, String loc, String email, String phone) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SchoolDetails().getInstance(dbn, name, loc, email, phone))
                .addToBackStack(null)
                .commit();
    }
}