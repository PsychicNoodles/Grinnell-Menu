package edu.grinnell.glicious.models.OldModel;



import com.google.gson.annotations.SerializedName;

import java.util.EnumMap;
import java.util.List;

import edu.grinnell.glicious.models.OldModel.Interface.MealPeriod;

/**
 * Created by albertowusu-asare on 9/17/15.
 */
public class Dinner implements MealPeriod {

    private String mealPeriodName;
    @SerializedName("DESSERTS                 ")
    private List<edu.grinnell.glicious.models.OldModel.Entree> desserts;
    @SerializedName("BREADS                   ")
    private List<edu.grinnell.glicious.models.OldModel.Entree> breads;
    @SerializedName("SALADS                   ")
    private List<edu.grinnell.glicious.models.OldModel.Entree> salads;
    @SerializedName("VEGAN SPECIAL")
    private List<edu.grinnell.glicious.models.OldModel.Entree> veganSpecial;
    @SerializedName("STIR FRY STATION")
    private List<edu.grinnell.glicious.models.OldModel.Entree> stirFryStation;
    @SerializedName("SOUPS                    ")
    private List<edu.grinnell.glicious.models.OldModel.Entree> soups;
    @SerializedName("ROLLER GRILL")
    private List<edu.grinnell.glicious.models.OldModel.Entree> rollerGrill;
    @SerializedName("PLAT DU JOUR")
    private List<edu.grinnell.glicious.models.OldModel.Entree>  platDuJour;
    @SerializedName("PIZZA PARLOR")
    private List<edu.grinnell.glicious.models.OldModel.Entree> pizzaParlor;
    @SerializedName("HUMMUS BAR")
    private List<edu.grinnell.glicious.models.OldModel.Entree> hummusBar;
    @SerializedName("HONOR G GRILL")
    private List<edu.grinnell.glicious.models.OldModel.Entree>  honorGGrill;
    @SerializedName("HALAL")
    private List<edu.grinnell.glicious.models.OldModel.Entree> halal;
    @SerializedName("GLUTEN FREE")
    private List<edu.grinnell.glicious.models.OldModel.Entree> gluttenFree;
    EnumMap<edu.grinnell.glicious.models.OldModel.Utility.Stations, List<edu.grinnell.glicious.models.OldModel.Entree>> stations;

    public Dinner(){
    }
    public Dinner(String dinner) {
        this.mealPeriodName = dinner;
    }



   // @Override
    public void setMealPeriodName(String mealPeriodName) {this.mealPeriodName = mealPeriodName;}

   // @Override
    public String getMealPeriodName() {return this.mealPeriodName;}

   // @Override
    public void setStations(EnumMap<edu.grinnell.glicious.models.OldModel.Utility.Stations,List<edu.grinnell.glicious.models.OldModel.Entree>> stations) {this.stations = stations;}

   // @Override
    public EnumMap<edu.grinnell.glicious.models.OldModel.Utility.Stations,List<edu.grinnell.glicious.models.OldModel.Entree>> getStations() {return populateStations();}

    public EnumMap<edu.grinnell.glicious.models.OldModel.Utility.Stations,List<edu.grinnell.glicious.models.OldModel.Entree>> populateStations(){
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.DESSERTS,this.desserts);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.BREADS, this.breads);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.SALADS, this.salads);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.VEGAN_SPECIAL, this.veganSpecial);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.STIR_FRY_STATION, this.stirFryStation);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.SOUPS, this.soups);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.ROLLER_GRILL, this.rollerGrill);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.PLAT_DU_JOUR, this.platDuJour);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.PIZZA_PARLOR, this.pizzaParlor);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.HUMMUS_BAR, this.hummusBar);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.HONOR_G_GRILL, this.honorGGrill);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.HALAL, this.halal);
        this.stations.put(edu.grinnell.glicious.models.OldModel.Utility.Stations.GLUTTEN_FREE,this.gluttenFree);
        return this.stations;
    }
}
