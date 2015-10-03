package edu.grinnell.glicious.models.OldModel.Interface;


import edu.grinnell.glicious.models.OldModel.Entree;
import edu.grinnell.glicious.models.OldModel.Utility;

import java.util.EnumMap;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public interface MealPeriod {
    void setMealPeriodName(String mealPeriodName);
    String getMealPeriodName();
    void setStations(EnumMap<Utility.Stations, List<Entree>> stations);
    EnumMap<Utility.Stations,List<Entree>> getStations();
}
