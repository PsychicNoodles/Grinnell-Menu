package edu.grinnell.glicious.models.OldModel;


import com.google.gson.annotations.SerializedName;
import edu.grinnell.glicious.models.OldModel.Utility;
import java.util.EnumMap;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public class Lunch  {
    private  String mealPeriodName;
    private EnumMap<Utility.Stations,List<Entree>> stations;
    @SerializedName("DESSERTS                 ")
    private List<Entree> DESSERTS;
    @SerializedName("VEGAN SPECIAL")
    private List<Entree> veganSpecial;
   @SerializedName("STIR FRY STATION")
    private List<Entree> stirFryStation;
    @SerializedName("SOUPS                    ")
    private List<Entree> soups;
    @SerializedName("ROLLER GRILL")
    private List<Entree> rollerGrill;
   @SerializedName("PLAT DU JOUR")
    private List<Entree> platDuJour;
   @SerializedName("PIZZA PARLOR")
    private List<Entree> pizzaParlor;


    public Lunch(){

    }

    public Lunch(String lunch){
        this.mealPeriodName = lunch;
    }
    // @Override
    public void setMealPeriodName(String mealPeriodName) {
        this.mealPeriodName = mealPeriodName;
    }

   // @Override
    public String getMealPeriodName() {
        return this.mealPeriodName;
    }

  //  @Override
    public void setStations(EnumMap<Utility.Stations,List<Entree>> stations) {this.stations = stations;}

//    @Override
    public EnumMap<Utility.Stations,List<Entree>> getStations() {return populateStations();}

    public EnumMap<Utility.Stations, List<Entree>> populateStations(){
        stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.DESSERTS,DESSERTS);
        stations.put(Utility.Stations.VEGAN_SPECIAL,veganSpecial);
        stations.put(Utility.Stations.STIR_FRY_STATION,stirFryStation);
        stations.put(Utility.Stations.SOUPS,soups);
        stations.put(Utility.Stations.ROLLER_GRILL,rollerGrill);
        stations.put(Utility.Stations.PLAT_DU_JOUR,platDuJour);
        stations.put(Utility.Stations.PIZZA_PARLOR,pizzaParlor);
        return this.stations;
    }
}
