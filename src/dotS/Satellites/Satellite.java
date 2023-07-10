package dotS.Satellites;

import dotS.C;
import dotS.Planets.Planet;

public abstract class Satellite {

    String[] sName;
    Planet owner;
    double radius, mass;

    public Satellite(){

        sName = new String[2];

    }

    public String getName(int ind){

        return sName[ind];

    }

    public double getRadius(){

        return radius;

    }

    public double getMass(){

        return mass;

    }

    public Planet getOwner(){

        return owner;

    }

    //USKORENIE SVOBODNOGO PADENIA  m/s2
    public double getGravitationalAcceleration(){

        return C.Gnewton * (mass / (radius * radius));

    }



}