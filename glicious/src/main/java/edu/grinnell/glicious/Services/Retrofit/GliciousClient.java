package edu.grinnell.glicious.services.Retrofit;


import com.google.gson.Gson;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ResponseBody;

import edu.grinnell.glicious.models.OldModel.*;
import retrofit.*;
import edu.grinnell.glicious.models.OldModel.Response;

import java.io.IOException;

/**
 * Created by albertowusu-asare on 9/8/15.
 */
public class GliciousClient {
    private static final String BASE_URL ="https://appdev.grinnell.edu";
    public static final String G_LICIOUS_URL = "https://appdev.grinnell.edu";
    private  ClientServiceApi clientService;
    private Retrofit retrofit;
    private Response response= null;

    public GliciousClient(){
       initialiaze();
    }

    private  void initialiaze(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(G_LICIOUS_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        clientService = retrofit.create(ClientServiceApi.class);
        // retrofit implemenation of our client Api interface class

    }

    public  Response getMenuByDate(String date){


        Call<Response> call = clientService.getMeals(date);
       // Response resp;
        try {
            return call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    public void setResponse(Response response){
        this.response = response;
    }

}
