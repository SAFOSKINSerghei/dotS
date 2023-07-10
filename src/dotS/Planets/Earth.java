package dotS.Planets;

import dotS.Satellites.Moon;
import dotS.Satellites.Satellite;
import dotS.Stars.Star;
import dotS.Stars.Sun;

public class Earth extends Planet{

    public Earth(Star[] owStar){

        pName[0]     = "Земля";
        pName[1]     = "Earth";
        radius       = 6371e+3;
        mass         = 5.9726e+24;
        satellite    = new Satellite[1];
        satellite[0] = new Moon(this);
        oStar        = owStar;

    }

    public Earth(Star owStar){

        pName[0]     = "Земля";
        pName[1]     = "Earth";
        radius       = 6371e+3;//m
        mass         = 5.9726e+24;//kg
        satellite    = new Satellite[1];
        satellite[0] = new Moon(this);
        oStar        = new Star[1];
        oStar[0]     = owStar;

    }

    public Star getStar(){

        return oStar[0];

    }

}