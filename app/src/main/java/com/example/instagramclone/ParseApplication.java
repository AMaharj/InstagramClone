package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ypyAKxnwIlUIP1gvAJFNraDK0N1EziRjEYPL8LhM")
                .clientKey("9pP6ROx5RPgkoRRfbkiIbYhCL1i7iJaaZ2qImDEX")
                .server("https://parseapi.back4app.com")
                .build()

        );
    }
}
