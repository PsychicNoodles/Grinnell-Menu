package edu.grinnell.glicious.models.OldModel;


import com.google.gson.annotations.SerializedName;

import java.util.EnumMap;
import java.util.List;

import edu.grinnell.glicious.models.OldModel.Interface.MealPeriod;
import edu.grinnell.glicious.models.OldModel.Utility.Stations;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public class Breakfast implements MealPeriod {

    private String mealPeriodName;
    @SerializedName("WAFFLE BAR")
    private List<edu.grinnell.glicious.models.OldModel.Entree> waffleBar;
    @SerializedName("SMOOTHIE BAR")
    private List<edu.grinnell.glicious.models.OldModel.Entree>  smoothieBar;
    @SerializedName("PLAT DU JOUR")
    private List<edu.grinnell.glicious.models.OldModel.Entree> platDuJour;
    @SerializedName("GLUTEN FREE")
    private List<edu.grinnell.glicious.models.OldModel.Entree> glutenFree;
    @SerializedName("EGG STATION")
    private List<edu.grinnell.glicious.models.OldModel.Entree> eggStation;
    @SerializedName("BREAKFAST PASTRY")
    private List<edu.grinnell.glicious.models.OldModel.Entree> breakfastPastry;

    private EnumMap<Stations,List<edu.grinnell.glicious.models.OldModel.Entree>> stations;

    public Breakfast(String breakfast){
        this.mealPeriodName = breakfast;
    }

    public Breakfast(){
    }

    //@Override
    public void setMealPeriodName(String mealPeriodName) {
        this.mealPeriodName = mealPeriodName;
    }

   // @Override
    public String getMealPeriodName() {
        return mealPeriodName;
    }

   // @Override
    public void setStations(EnumMap<Stations,List<edu.grinnell.glicious.models.OldModel.Entree>> stations) {
        this.stations = stations;
    }

    // @Override
    public EnumMap<Utility.Stations,List<Entree>> getStations() {
        return  populateStations();
    }


    private EnumMap<Stations, List<edu.grinnell.glicious.models.OldModel.Entree>> populateStations(){
       // this.stations.put(Utility.Stations.WAFFLE_BAR,this.WAFFLE_BAR);
        this.stations.put(Stations.SMOOTHIE_BAR, this.smoothieBar);
        this.stations.put(Stations.PLAT_DU_JOUR, this.platDuJour);
        this.stations.put(Stations.GLUTTEN_FREE, this.glutenFree);
        this.stations.put(Stations.EGG_STATION, this.eggStation);
        this.stations.put(Stations.BREAKFAST_PASTRY, this.breakfastPastry);
        return this.stations;
    }

}
