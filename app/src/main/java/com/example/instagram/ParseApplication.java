package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

//Initializes Parse SDK as soon as the application is created

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("n3UoIQhr7iWYgS4Pbr9vcRTsKNeAfp9xc2T5Tplp")
                .clientKey("DGrg2XFyPzzaVNXYDbztIoXKqIGikZemF7FQkRac")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
