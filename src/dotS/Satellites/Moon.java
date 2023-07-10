package dotS.Satellites;

import dotS.Planets.*;

public class Moon extends Satellite{

    public Moon(Planet oPlanet){

        sName[0] = "Луна";
        sName[1] = "Moon";
        radius   = 1737e+3;//m
        mass     = 7.3477e+22;//kg
        owner    = oPlanet;

    }

}