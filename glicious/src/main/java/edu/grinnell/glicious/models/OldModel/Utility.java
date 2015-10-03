package edu.grinnell.glicious.models.OldModel;


import com.google.gson.Gson;

import java.util.List;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public final class Utility {


   public enum Stations {
       DESSERTS, VEGAN_SPECIAL, STIR_FRY_STATION, SOUPS, ROLLER_GRILL, PLAT_DU_JOUR,
       BREADS, SALADS,ROLLERGRILL,PIZZA_PARLOR, HUMMUS_BAR, HONOR_G_GRILL,HALAL,GLUTTEN_FREE,
       WAFFLE_BAR, SMOOTHIE_BAR,EGG_STATION,BREAKFAST_PASTRY
    }

/*
    public String sampleJSON (){
        Gson gson = new Gson();
        MenuResponseType responseType = new MenuResponseType();
        MealPeriod mealPeriod = new MealPeriod();
        mealPeriod.setMealPeriodName("Breakfast");
        List<Model.Station> stations = mealPeriod.getStations();
        Model.Station station = new Model.Station("waffleBar");
        FoodItem item1 = new FoodItem();
        item1.setID(1);
        item1.setName("Belgian Waffle Bar");
        item1.setHalal(false);
        item1.setOvolacto(true);
        item1.setPassover(false);
//        station.getFoodItems().add(item1);
        stations.add(station);
        List<MealPeriod> mealPeriods = responseType.getMealPeriods();
        mealPeriods.add(mealPeriod);
        MealPeriod lunch = new MealPeriod("Lunch" ,stations);
        mealPeriods.add(lunch);
        MealPeriod lateLunch = new MealPeriod("Late lunch" ,stations);
        mealPeriods.add(lateLunch);
        MealPeriod dinner = new MealPeriod("Dinner" ,stations);
        mealPeriods.add(dinner);
        return gson.toJson(responseType);
    }
*/


}
