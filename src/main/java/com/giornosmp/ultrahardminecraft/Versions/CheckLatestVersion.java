package com.giornosmp.ultrahardminecraft.Versions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckLatestVersion {

    public static HttpURLConnection connection;

    public static String checkLatestVersion() {

        String line;
        BufferedReader reader;

        StringBuffer responsecontent = new StringBuffer();

        try {

            URL url = new URL("https://giornosmp.com/ultrahardminecraftversion.json");
            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10000);

            int status = connection.getResponseCode();

            if (status > 299) {
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                    responsecontent.append(line);
                }
                reader.close();
            }
            else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null) {
                    responsecontent.append(line);
                }
                reader.close();
            }


        }
        catch (IOException exception) {
            exception.printStackTrace();
        }
        finally {
            connection.disconnect();
        }
        return responsecontent.toString();
    }

    private void IntelliJSucks() {
        // i made this because i kept getting warnings from intellij you can remove this if you want
    }

}
