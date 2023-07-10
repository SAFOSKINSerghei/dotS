package dotS;

import java.util.*;

public abstract class Derivative {

    protected double x;
    protected double dx;
    protected ArrayList<Double> ax;
    protected ArrayList<Double> ay;

    public Derivative(){

        ax = new ArrayList<Double>(3);
        ay = new ArrayList<Double>(3);


    }

    abstract public double Func(double vx);

    public double getDerivativeValue1(double vx){

        x  = vx;
        dx = 0.00015;
        double x3 = x - dx;

        for (int i = 0; i < 3; i++){

            ax.add(x3); ay.add(Func(x3));
            x3 += dx;

        }


        long precision = 11;
        double x1 = F.round((x - dx), precision);
        double x2 = F.round((x + dx), precision);

        double y1 = F.getYOfXByLagrangePolinomialInterpolation(x1, ax, ay, precision);
        double y2 = F.getYOfXByLagrangePolinomialInterpolation(x2, ax, ay, precision);

        x1 = x2 - x1;
        y1 = y2 - y1;

        return F.round((y1 / x1), 6);

    }

    public double getDerivativeValue2(double vx){

        x  = vx;
        dx = 0.010003;
        long precision = 11;

        double x1 = F.round((x - dx), precision);
        double x2 = F.round((x + dx), precision);


        double y1 = getDerivativeValue1(x1);
        double y2 = getDerivativeValue1(x2);

        x1 = x2 - x1;
        y1 = y2 - y1;

        return F.round((y1 / x1), 6);

    }


}

