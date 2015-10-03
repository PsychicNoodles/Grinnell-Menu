package edu.grinnell.glicious.models.OldModel.Interface;



import java.util.List;

import edu.grinnell.glicious.models.OldModel.Entree;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public interface Station {
    void setEntrees(List<Entree> entrees);
    List<Entree> geEntrees();
    void setStaionName(String stationName);
    String getStationName();
}
