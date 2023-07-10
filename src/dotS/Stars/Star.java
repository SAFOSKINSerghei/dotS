package dotS.Stars;

import dotS.C;
import dotS.Planets.Planet;

public abstract class Star {

    String[] pName;
    Planet[] planet;
    double radius, mass;

    public Star(){

        pName = new String[2];

    }

    public String getName(int ind){

        return pName[ind];

    }

    public double getRadius(){

        return radius;

    }

    public double getMass(){

        return mass;

    }

    public Planet[] getPlanets(){

        return planet;

    }

    public Planet getPlanets(int ind){

        return planet[ind];

    }

    //USKORENIE SVOBODNOGO PADENIA  m/s2
    public double getGravitationalAcceleration(){

        return C.Gnewton * (mass / (radius * radius));

    }


}