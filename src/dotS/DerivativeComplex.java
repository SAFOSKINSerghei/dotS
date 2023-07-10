package dotS;

import java.util.*;

public abstract class DerivativeComplex {

    protected Complex x;
    protected Complex dx;
    protected ArrayList<Complex> ax;
    protected ArrayList<Complex> ay;

    public DerivativeComplex(){

        ax = new ArrayList<Complex>(3);
        ay = new ArrayList<Complex>(3);


    }

    abstract public Complex Func(Complex vx);

    public Complex getDerivativeValue1(Complex vx){

        x  = vx;
        dx = new Complex(0.00015);
        Complex x3 = Complex.sub(x, dx);

        for (int i = 0; i < 3; i++){

            ax.add(x3); ay.add(Func(x3));
            x3 = Complex.add(x3, dx);

        }


        long precision = 11;
        Complex x1 = Complex.sub(x, dx).round(precision);
        Complex x2 = Complex.add(x, dx).round(precision);

        Complex y1 = F.getYOfXByLagrangePolinomialInterpolationComplex(x1, ax, ay, precision);
        Complex y2 = F.getYOfXByLagrangePolinomialInterpolationComplex(x2, ax, ay, precision);

        x1 = Complex.sub(x2, x1).round(precision);
        y1 = Complex.sub(y2, y1).round(precision);

        return  Complex.div(y1, x1).round(6);

    }

    /*public double getDerivativeValue2(double vx){

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

    }*/


}

