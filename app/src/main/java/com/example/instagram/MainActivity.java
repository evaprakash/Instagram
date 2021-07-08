package com.example.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    private Button btnLogout;
    private ImageButton btnPost;
    private ImageButton btnFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        btnLogout = findViewById(R.id.btnLogout);
        btnPost = findViewById(R.id.btnPost);
        btnFeed = findViewById(R.id.btnFeed);

        if (ParseUser.getCurrentUser() == null) {
            logOut();
        }

        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToPost();
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logOut();
            }
        });

        btnFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFeed();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void logOut() {
        ParseUser.logOut();
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
        finish();
    }

    private void goToPost() {
        Intent i = new Intent(MainActivity.this, PostActivity.class);
        startActivity(i);
        finish();
    }

    private void goToFeed() {
        Intent i = new Intent(MainActivity.this, FeedActivity.class);
        startActivity(i);
        finish();
    }
}