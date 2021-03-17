package com.example.instagram;

import android.app.Application;
import com.parse.Parse;
import android.app.Application;
public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Use for troubleshooting -- remove this line for production
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("scNjuEFakdKeLZf88imP1WDCKa5Od1oHx0yn3Cyn")
                .clientKey("jNh9tAED6mEtukLKULfZojW2dLCuGWTkeFxc6tyN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}