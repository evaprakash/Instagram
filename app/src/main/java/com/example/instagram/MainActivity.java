package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void logOut() {
        ParseUser.logOut();
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }
}