package edu.grinnell.glicious.services.Retrofit;



import edu.grinnell.glicious.models.OldModel.Response;
import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by albertowusu-asare on 9/8/15.
 */
public interface ClientServiceApi {
    @GET("/glicious/{date}")
    Call<Response> getMeals(@Path("date") String date) ;
}
