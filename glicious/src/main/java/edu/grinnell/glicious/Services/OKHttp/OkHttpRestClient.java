package edu.grinnell.glicious.services.OKHttp;


import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;


import java.io.IOException;

public class OkHttpRestClient {
    private static  String MENU_DATA_ENDPOINT;


    public OkHttpRestClient(){
        this.MENU_DATA_ENDPOINT = "https://appdev.grinnell.edu/glicious/9-3-2015.json";
    }
    public OkHttpRestClient(String baseUrl){
        this.MENU_DATA_ENDPOINT = baseUrl;
    }
    OkHttpClient client = new OkHttpClient();

    String run(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        Response response = client.newCall(request).execute();
        return response.body().string();

    }

    public String getResponseJSON() throws Exception{
        return run(MENU_DATA_ENDPOINT);
    }

    public static void main(String [] args) throws Exception{
        OkHttpRestClient client = new OkHttpRestClient();
        String response = client.getResponseJSON();
        System.out.println(response);
    }


}