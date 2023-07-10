package dotS.Planets;

import dotS.C;
import dotS.Satellites.Satellite;
import dotS.Stars.Star;

public abstract class Planet {

    String[] pName;
    Satellite[] satellite;
    double radius, mass;
    Star[] oStar;

    public Planet(){

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

    public Satellite[] getSatellites(){

        return satellite;

    }

    //USKORENIE SVOBODNOGO PADENIA  m/s2
    public double getGravitationalAcceleration(){

        return C.Gnewton * (mass / (radius * radius));

    }


}