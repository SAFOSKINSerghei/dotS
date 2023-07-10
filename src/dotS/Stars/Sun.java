package dotS.Stars;


import dotS.Planets.*;

public class Sun extends Star{

    public Sun(){

        pName[0]     = "Солнце";
        pName[1]     = "Sun";
        radius       = 6.96e+8;//m
        mass         = 1.9885e+30;//kg
        planet    = new Planet[8];
        planet[2] = new Earth(this);

    }

}
