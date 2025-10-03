package com.internetitem.logback.elasticsearch.config;

import java.net.HttpURLConnection;

import com.internetitem.logback.elasticsearch.util.Base64;

public class ModernBasicAuthentication implements Authentication {
    public void addAuth(HttpURLConnection urlConnection, String body) {
        // this method does nothing in this implementation
    }

    @Override
    public void addAuth(HttpURLConnection urlConnection, String basicusername, String basicpassword) {
        String userInfo = basicusername + ":" + basicpassword;
        String basicAuth = "Basic " + Base64.encode(userInfo.getBytes());
        urlConnection.setRequestProperty("Authorization", basicAuth);
    }
}
