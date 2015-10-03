package edu.grinnell.glicious.models.OldModel;




import com.google.gson.annotations.SerializedName;

/**
 * Created by albertowusu-asare on 9/13/15.
 */
public class Response {

    @SerializedName("BREAKFAST")
    private Breakfast breakfast;

    private edu.grinnell.glicious.models.OldModel.Lunch LUNCH;

    private Dinner DINNER;
    boolean passover ;

    Response(Breakfast food, edu.grinnell.glicious.models.OldModel.Lunch lunch,Dinner dinner,boolean passover){
        this.breakfast = breakfast;
        this.LUNCH = lunch;
        this.DINNER = dinner;
        this.passover =passover;
    }
}
