package edu.grinnell.glicious.models.OldModel;

/**
 * Created by albertowusu-asare on 9/7/15.
 */
public class Entree {
    private String name;
    private boolean vegan;
    private boolean ovolacto;
    private boolean glutenFree;
    private boolean passover;
    private boolean halal;
    private String ID;
    private String nutrition;

    public Entree(String name, boolean vegan, boolean ovolacto, boolean glutenFree,
                  boolean passover, boolean halal, String ID, String nutrition){
        this.name = name;
        this.vegan = vegan;
        this.ovolacto = ovolacto;
        this.glutenFree = glutenFree;
        this.passover = passover;
        this.halal = halal;
        this.ID = ID;
        this.nutrition = nutrition;
    }

    public Entree(){}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public boolean getVegan() {return this.vegan;}
    public void setVegan(String name) {this.vegan = vegan;}

    public boolean getOvolacto(){return this.ovolacto;}
    public void setOvolacto(boolean ovolacto){this.ovolacto = ovolacto;}

    public boolean getPassover(){return this.passover;}
    public void setPassover(boolean passover){this.passover = passover;}

    public boolean getHalal(){ return this.halal;}
    public void setHalal(boolean halal){this.halal= halal;}

    public String getID(){return this.ID;}
    public void setID(String ID){this.ID = ID;}

    public String getNutrition(){return this.nutrition;}
    public void setNutrition(String nutrition){this.nutrition = nutrition;}

}
