package com.pluralsight.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEveryDayDemo {

    public static void main(String[] args) throws Exception {

        //URL is a facade
        URL url = new URL("http", "www.42freeway.com", 80, "/");

        //BufferdReader is a decorator
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        inputLine = in.readLine();
        while (inputLine != null) {
            System.out.println(inputLine);
            inputLine = in.readLine();
        }

    }
}
