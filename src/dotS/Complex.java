package dotS;

import java.util.*;

public class Complex {
	
	public static class I{
		
		private double coefficient;
		private String value;
		
		public I(double k, long p) {
			
			if (p % 4 == 0) {
				
				value       = "";
				coefficient = k;
				
			}
			
			if ((p - 1) % 4 == 0) {
				
				value       = "i";
				coefficient = k;
				
			}
			
			if (p % 2 == 0 && p % 4 != 0) {
				
				value       = "";
				coefficient = -k;
				
			}
			
			if ((p - 1) % 2 == 0 && (p - 1) % 4 != 0) {
				
				value       = "i";
				coefficient = -k;
				
			}
			
		}
		
		
		public void setValue(double k, long p) {
			
			if (p % 4 == 0) {
				
				value       = "";
				coefficient = k;
				
			}
			
			if ((p - 1) % 4 == 0) {
				
				value       = "i";
				coefficient = k;
				
			}
			
			if (p % 2 == 0 && p % 4 != 0) {
				
				value       = "";
				coefficient = -k;
				
			}
			
			if ((p - 1) % 2 == 0 && (p - 1) % 4 != 0) {
				
				value       = "i";
				coefficient = -k;
				
			}
			
		}
		
		
		public I(double k) {
			
			coefficient = k;
			value       = "";
			
		}
		
		
		public void setValue(double k) {
			
			coefficient = k;
			value       = "";
			
		}
		
		
		public I(String str) {
			
			double koef;
			long   stepn;
			String koefs  = "";
			String stepns;
			String[] msstr;
                        
                        str = str.replaceAll(" ", "");
			
			if (str.contains("i") == false) {
				
				koef  = F.sToD(str);
				stepn = 0;
				
			} else {
				
				msstr = str.trim().split("i");
                                
				if (str.trim().charAt(0) == 'i') koefs = "1";
				if (str.trim().charAt(0) == '-' && str.trim().charAt(1) == 'i'){
                                    
                                    koefs = "-1";
                                    
                                }
				if (str.trim().charAt(0) == '-' && str.trim().charAt(1) != 'i') {
					
					koefs = "-";
					for (int iper = 1; iper < (str.trim().indexOf("i")); iper++) {
						
						koefs += str.trim().charAt(iper);
						
					}
					
				}
                                
				if (str.trim().charAt(0) != 'i' && str.trim().charAt(0) != '-') koefs = msstr[0];
				koef = F.sToD(koefs);
				if (str.trim().charAt(str.trim().length() - 1) == 'i') {
					
					stepns = "1";
					
				} else{
					
					stepns = msstr[1];
					
				}
				
				stepn = Integer.parseInt(stepns);
				
			}
			
		    
                        if (stepn % 4 == 0) {
				
                            value       = "";
                            coefficient = koef;
				
			}
			
			if ((stepn - 1) % 4 == 0) {
				
                            value       = "i";
                            coefficient = koef;
				
			}
			
			if (stepn % 2 == 0 && stepn % 4 != 0) {
				
                            value       = "";
                            coefficient = -koef;
				
			}
			
			if ((stepn - 1) % 2 == 0 && (stepn - 1) % 4 != 0) {
				
                            value       = "i";
                            coefficient = -koef;
				
			}
			
		}
		
		
		public void setValue(String str) {
			
			double koef;
			long   stepn;
			String koefs  = "";
			String stepns;
			String[] msstr;
                        
                        str = str.replaceAll(" ", "");
			
			if (str.contains("i") == false) {
				
				koef  = F.sToD(str);
				stepn = 0;
				
			} else {
				
				msstr = str.trim().split("i");
                                
				if (str.trim().charAt(0) == 'i') koefs = "1";
				if (str.trim().charAt(0) == '-' && str.trim().charAt(1) == 'i'){
                                    
                                    koefs = "-1";
                                    
                                }
				if (str.trim().charAt(0) == '-' && str.trim().charAt(1) != 'i') {
					
					koefs = "-";
					for (int iper = 1; iper < (str.trim().indexOf("i")); iper++) {
						
						koefs += str.trim().charAt(iper);
						
					}
					
				}
                                
				if (str.trim().charAt(0) != 'i' && str.trim().charAt(0) != '-') koefs = msstr[0];
				koef = F.sToD(koefs);
				if (str.trim().charAt(str.trim().length() - 1) == 'i') {
					
					stepns = "1";
					
				} else{
					
					stepns = msstr[1];
					
				}
				
				stepn = Integer.parseInt(stepns);
				
			}
			
		    
                        if (stepn % 4 == 0) {
				
                            value       = "";
                            coefficient = koef;
				
			}
			
			if ((stepn - 1) % 4 == 0) {
				
                            value       = "i";
                            coefficient = koef;
				
			}
			
			if (stepn % 2 == 0 && stepn % 4 != 0) {
				
                            value       = "";
                            coefficient = -koef;
				
			}
			
			if ((stepn - 1) % 2 == 0 && (stepn - 1) % 4 != 0) {
				
                            value       = "i";
                            coefficient = -koef;
				
			}
			
		}
		
		
                @Override
		public String toString() {
			
                    String r = "";
			
                    if (coefficient == 0) r = "0";
                    if (coefficient == 1 && value.equals("i")) r = value;
                    if (coefficient == 1 && value.equals(""))  r = String.valueOf(coefficient);
                    if (coefficient ==-1 && value.equals("i")) r = "-" + value;
                    if (coefficient ==-1 && value.equals(""))  r = String.valueOf(coefficient);
                    if (coefficient != 0 && coefficient != 1 && coefficient != -1)  r = String.valueOf(coefficient) + value;
			
                    return r;
			
		}
		
		
		public String toString(long precision) {
			
			String r = "";
			
			if (coefficient == 0) r = "0";
			if (coefficient == 1 && value.equals("i")) r = value;
			if (coefficient == 1 && value.equals(""))  r = String.valueOf(F.round(coefficient, precision));
	        if (coefficient ==-1 && value.equals("i")) r = "-" + value;
	        if (coefficient ==-1 && value.equals(""))  r = String.valueOf(F.round(coefficient, precision));
	        if (coefficient != 0 && coefficient != 1 && coefficient != -1)  r = String.valueOf(F.round(coefficient, precision)) + value;
			
			return r;
			
		}
		
		
		public double getCoefficient() {
			
			return coefficient;
			
		}
		
		
		public String getValue() {
			
			return value;
			
		}
		
		
		public double getAbsoluteValue() {
			
			return Math.abs(coefficient);
			
		}
		
		
		public double getArgument() {
			
			double r;
			
			if (value.equals("")) {
				
				if (coefficient > 0) r = 0; else r = 180;
				
			} else {
				
				if (coefficient > 0) r = 90; else r = -90;
				
			}
			
			if (coefficient == 0) r = 0;
			
			return r;
			
		}
		
		
	}

	I imaginaryPart;
	double realPart;
	
	
	public Complex(double rp) {
		
		imaginaryPart = new I(0);
		realPart = rp;
		
	}


	public Complex(double rp, I imp){
        
            if (!imp.getValue().equals("")){
                
                imaginaryPart = imp;
                realPart      = rp;
                
            } else {
            
                imaginaryPart.setValue(0);
                realPart      = rp + imp.getCoefficient();
                
            }
            
        }


	public Complex(double rp, double imp){

		imaginaryPart = new I(imp, 1);
		realPart      = rp;
	}
        
        
        private void setValue(double rp, I imp){
        
            if (!imp.getValue().equals("")){
                
                imaginaryPart = imp;
                realPart      = rp;
                
            } else {
            
                imaginaryPart.setValue(0);
                realPart      = rp + imp.getCoefficient();
                
            }
            
        }
         
        
        private Complex(I imp){
        
            if (imp.getValue().equals("i")){
                
                imaginaryPart = imp;
                realPart      = 0;
            
            } else{
            
                realPart      = imp.getCoefficient();
                imaginaryPart = new I(0);
            
            }
            
        }


	public Complex(double AbsValue, double angle, boolean degree){

		double rlV, imV;

		if (degree == true) {

			rlV = AbsValue * F.cos(angle);
			imV = AbsValue * F.sin(angle);

		} else{

			rlV = AbsValue * Math.cos(angle);
			imV = AbsValue * Math.sin(angle);

		}

		realPart = rlV;
		imaginaryPart = new I(imV, 1);

	}

        
        
        private void setValue(I imp){
        
            if (imp.getValue().equals("i")){
                
                imaginaryPart = imp;
                realPart      = 0;
            
            } else{
            
                realPart      = imp.getCoefficient();
                imaginaryPart = new I(0);
            
            }
            
        }
        
	
	public void setValue(double rp) {
		
		imaginaryPart.setValue(0);
		realPart = rp;
		
	}
	
	
	public Complex(String str) {
            
            if (str.charAt(0) == '+'){
                
                str = '0' + str;

            }

            double vc = 0;
            Complex r = new Complex(0);
            I me = new I(0);
            char[] chrs = {'-', '+'};
            String[] sm = F.splitStringBySomeChars(str, chrs, false);
            I[] imas = new I[sm.length];

            for (int i = 0; i < sm.length; i++){

                imas[i] = new I(sm[i].replace("+", ""));

            }

            if (sm.length > 1){

                for (I imas2: imas){

                    r = Complex.add(r, imas2);

                }

            }else{

                r = Complex.add(0, imas[0]);

            }

            realPart = r.getRealPart();
            imaginaryPart = r.getImaginaryPart();
		
	}
	
	
	public void setValue(String str) {
		
            if (str.charAt(0) == '+'){
                
                str = '0' + str;

            }

            double vc = 0;
            Complex r = new Complex(0);
            I me = new I(0);
            char[] chrs = {'-', '+'};
            String[] sm = F.splitStringBySomeChars(str, chrs, false);
            I[] imas = new I[sm.length];

            for (int i = 0; i < sm.length; i++){

                imas[i] = new I(sm[i].replace("+", ""));

            }

            if (sm.length > 1){

                for (I imas2: imas){

                    r = Complex.add(r, imas2);

                }

            }else{

                r = Complex.add(0, imas[0]);

            }

            realPart = r.getRealPart();
            imaginaryPart = r.getImaginaryPart();
		
	}

	
        @Override
	public String toString() {
		
		String r = "";
		
		double ki;
		String sr, si, vi;
		
		ki = imaginaryPart.getCoefficient();
		sr = String.valueOf(realPart);
		si = imaginaryPart.toString();
		vi = imaginaryPart.getValue();
		
		if (ki != 0 && realPart != 0 && imaginaryPart.getCoefficient() > 0) {
			
			r = sr + "+" + si;
			
		}
                
                if (ki != 0 && realPart != 0 && imaginaryPart.getCoefficient() < 0) {
			
			r = sr + si;
			
		}
		
		if (ki != 0 && realPart == 0) {
			
			r = si;
			
		}
		
		if (ki == 0 && realPart != 0) {
			
			r = sr;
			
		}
		
		if (vi.equals("")) {
			
			r = sr;
			
		}
		
		if (ki == 0 && realPart == 0) {
			
			r = "0";
			
		}
		
		return r;
		
	}
	
	
	public String toString(long precision) {
		
		String r = "";
		
		double ki;
		String sr, si, vi;
		
		ki = imaginaryPart.getCoefficient();
		sr = String.valueOf(F.round(realPart, precision));
		si = imaginaryPart.toString(precision);
		vi = imaginaryPart.getValue();
		
		if (ki != 0 && realPart != 0 && imaginaryPart.getCoefficient() > 0) {
			
			r = sr + "+" + si;
			
		}
                
                if (ki != 0 && realPart != 0 && imaginaryPart.getCoefficient() < 0) {
			
			r = sr + si;
			
		}
		
		if (ki != 0 && realPart == 0) {
			
			r = si;
			
		}
		
		if (ki == 0 && realPart != 0) {
			
			r = sr;
			
		}
		
		if (vi.equals("")) {
			
			r = sr;
			
		}
		
		if (ki == 0 && realPart == 0) {
			
			r = "0";
			
		}
		
		return r;
		
	}


	public double getRealPart() {
		
		return realPart;
		
	}


	public I getImaginaryPart() {
		
		return imaginaryPart;
		
	}


	public double getAbsoluteValue() {
		
		String si;
		double ki, r;
		
		si = imaginaryPart.getValue();
		if (si.equals("")) {
			
			r = Math.abs(realPart);
			
		} else {
			
			ki = imaginaryPart.getCoefficient();
			r  = Math.pow((Math.pow(realPart, 2) + Math.pow(ki, 2)), 0.5);
			
		}
		
		return r;
		
	}
	
	
	public double getArgument() {
		
		double r, ki;
                r = 0;
		
		ki = imaginaryPart.getCoefficient();
		
		if (realPart > 0) {
			
			r = Math.atan(ki / realPart);
			
		}
		
		if (realPart < 0 && ki >= 0) {
			
			r = C.pi + Math.atan(ki / realPart);
			
		}
		
		if (realPart < 0 && ki < 0) {
			
			r = -C.pi + Math.atan(ki / realPart);
			
		}
		
		if (realPart == 0 && ki > 0) {
			
			r = C.pi / 2;
			
		}
		
		if (realPart == 0 && ki < 0) {
			
			r = -C.pi / 2;
			
		}
		
		if (realPart == 0 && ki == 0) {
			
			r = 0;
			
		}
		
		return r;
		
	}

	
	public String getTrigonometricForm(long precision, boolean degrees) {
		
		String r;
		
		String dabs  = String.valueOf(F.round(getAbsoluteValue(), precision));
		String dargr = String.valueOf(F.round(getArgument(), precision));
		String dargd = String.valueOf(F.round(F.radiansToDegrees(F.round(getArgument(), precision)), precision));
		
		if (!degrees) {
			
			r = dabs + "*(cos(" + dargr + "rad)+i*sin(" + dargr + "rad))";
			
		} else {
			
			r = dabs + "*(cos(" + dargd + F.getDegreeSymbolToString() + ")+i*sin(" + dargd + F.getDegreeSymbolToString() + "))";
			
		}
		
		return r;
		
	}
	
	
	public String getTrigonometricFormFormatFractional(long precision, boolean degrees) {
		
		String r;
		
		String dabs  = F.toFraction(F.round(getAbsoluteValue(), precision));
		String dargr = F.toFraction(F.round(getArgument(), precision));
		String dargd = F.toFraction(F.round(F.radiansToDegrees(F.round(getArgument(), precision)), precision));
		
		if (!degrees) {
			
			r = dabs + "*(cos(" + dargr + "rad)+i*sin(" + dargr + "rad))";
			
		} else {
			
			r = dabs + "*(cos(" + dargd + F.getDegreeSymbolToString() + ")+i*sin(" + dargd + F.getDegreeSymbolToString() + "))";
			
		}
		
		return r;
		
	}


	public String getAlgebraicForm(long precision) {
		
	String r = "";
		
	double ki;
        String kis, sr, vi;
        
        ki  = imaginaryPart.getCoefficient();
        ki  = F.round(ki, precision);
        kis = String.valueOf(ki);
        sr  = String.valueOf(F.round(realPart, precision));
        vi  = imaginaryPart.getValue();
		
        if (ki != 0 && realPart != 0){

	        if (ki < 0 && ki != -1) r = sr + kis + vi;
	        if (ki > 0 && ki != 1) r = sr + "+" + kis + vi;
	        if (ki == -1) r = sr + "-" + vi;
	        if (ki == 1) r = sr + "+" + vi;

        }
        
        if (ki != 0 && realPart == 0){

	        if (ki != -1 && ki != 1) r = kis + vi;
	        if (ki == -1) r = "-" + vi;
	        if (ki == 1) r  = vi;

        }
        
        if (ki == 0 && realPart != 0){

        	r = sr;

        }

        if (vi.equals("")) {

        	r = sr;

        }
       
        if (ki == 0 && realPart == 0){

        	r = "0";

        }
        
        
        
		return r;
		
	}
	
	
	public String getAlgebraicFormFormatFractional(long precision) {
		
	String r;
        r = "";
		
	double ki;
        String sr, vi;
        
        ki  = imaginaryPart.getCoefficient();
        ki  = F.round(ki, precision);
        sr  = String.valueOf(F.round(realPart, precision));
        vi  = imaginaryPart.getValue();
		
        if (ki != 0 && realPart != 0){

	        if (ki < 0 && ki != -1) r = F.toFraction(F.sToD(sr)) + F.toFraction(ki) + vi;
	        if (ki > 0 && ki != 1) r = F.toFraction(F.sToD(sr)) + "+" + F.toFraction(ki) + vi;
	        if (ki == -1) r = F.toFraction(F.sToD(sr)) + "-" + vi;
	        if (ki == 1) r = F.toFraction(F.sToD(sr)) + "+" + vi;

        }
        
        if (ki != 0 && realPart == 0){

	        if (ki != -1 && ki != 1) r = F.toFraction(ki) + vi;
	        if (ki == -1) r = "-" + vi;
	        if (ki == 1) r  = vi;

        }
        
        if (ki == 0 && realPart != 0){

        	r = F.toFraction(F.sToD(sr));

        }

        if (vi.equals("")) {

        	r = F.toFraction(F.sToD(sr));

        }
       
        if (ki == 0 && realPart == 0){

        	r = "0";

        }
        
        
        
		return r;
		
	}


	public String getExponentialForm(long precision) {
		
		String r;
		
		String dabs  = String.valueOf(F.round(getAbsoluteValue(), precision));
		String darg = String.valueOf(F.round(getArgument(), precision));
		String etemp = String.valueOf(F.round(C.e, precision));
		
		r = dabs + " * (" + etemp + " ^ (i * " + darg + ")";
		
		return r;
		
	}
	
	
	public String getExponentialFormFormatFractional(long precision) {
		
		String r;
		
		String dabs  = F.toFraction(F.round(getAbsoluteValue(), precision));
		String darg = F.toFraction(F.round(getArgument(), precision));
		String etemp = F.toFraction(F.round(C.e, precision));
		
		r = dabs + " * (" + etemp + " ^ (i * " + darg + ")";
		
		return r;
		
	}


        public Complex ln(){
        
            double a, ar;
            I ir = new I(0);
            
            a  = getAbsoluteValue();
            a  = Math.log(a);
            ar = getArgument();
            ir.setValue(ar, 1);
            
            return new Complex(a, ir);
        
        }


        public Complex changeArgument(double newAngle){
        
            double cosa, sina;
            I ir;
            
            cosa = F.cos(newAngle) * getAbsoluteValue();
            sina = F.sin(newAngle) * getAbsoluteValue();
            
            ir = new I(sina, 1);
            return new Complex(cosa, ir);
            
        }
        
        
        public Complex getComplexConjugateNumber(){
            Complex k;
            I i;
            

            k = mul(-1, imaginaryPart);
            i = k.getImaginaryPart();
            k.setValue(realPart, i); 
            
            return k;

          }
        
        
        private static Complex add(I i1, I i2){
        
            String sm1, sm2;
            double km1, km2;
            I ir;
            Complex r;
            r = new Complex(0);
            ir = new I(0);
            
            sm1 = i1.getValue();
            sm2 = i2.getValue();
            km1 = i1.getCoefficient();
            km2 = i2.getCoefficient(); 
            
            if (sm1.equals("") && sm2.equals("")){

              ir.setValue(0);
              r.setValue((km1 + km2), ir);

            }

            if (sm1.equals("i") && sm2.equals("")){

              r.setValue(km2, i1);

            }

            if (sm1.equals("") && sm2.equals("i")){

              r.setValue(km1, i2);

            }

            if (sm1.equals("i") && sm2.equals("i")){

              ir.setValue((km1 + km2), 1);
              r.setValue(ir);

            }
            
            return r;
            
        }
        
        
        private static Complex add(I i1, double c){
            
            I ir;
            ir = new I(c);
            
            return add(i1, ir);
            
        }
        
        
        private static Complex add(double c, I i1){
            
            I ir;
            ir = new I(c);
            
            return add(ir, i1);
            
        }


        public static Complex add(Complex c1, Complex c2){
            double vc1, vc2;
            I i1, i2;
            double kf, ki1, ki2;
            I ir;
            ir = new I(0);


           vc1 = c1.getRealPart();
           vc2 = c2.getRealPart();
           i1  = c1.getImaginaryPart();
           i2  = c2.getImaginaryPart();
           ki1 = i1.getCoefficient();
           ki2 = i2.getCoefficient();
           kf  = ki1 + ki2;

           ir.setValue(kf, 1);
           return new Complex((vc1 + vc2), ir);

        }

        
        public static Complex add(Complex c, double d){
            Complex kr;
            kr = new Complex(d);
            
            return add(c, kr);

        }
        
        
        public static Complex add(double d, Complex c){
            Complex kr;
            kr = new Complex(d);
            
            return add(kr, c);

        }
        
        
        private static Complex add(Complex c, I i){
            Complex kr;
            kr = new Complex(i);
            
            return add(c, kr);

        }
        
        
        private static Complex add(I i, Complex c){
            Complex kr;
            kr = new Complex(i);
            
            return add(kr, c);

        }


        private static Complex sub(I i1, I i2){
        
            String sm1, sm2;
            double km1, km2;
            I ir;
            Complex r;
            r = new Complex(0);
            ir = new I(0);
            
            sm1 = i1.getValue();
            sm2 = i2.getValue();
            km1 = i1.getCoefficient();
            km2 = i2.getCoefficient(); 
            
            if (sm1.equals("") && sm2.equals("")){

              ir.setValue(0);
              r.setValue((km1 - km2), ir);

            }

            if (sm1.equals("i") && sm2.equals("")){

              r.setValue(-km2, i1);

            }

            if (sm1.equals("") && sm2.equals("i")){

              ir.setValue(-km2, 1);
              r.setValue(km1, ir);

            }

            if (sm1.equals("i") && sm2.equals("i")){

              ir.setValue((km1 - km2), 1);
              r.setValue(ir);

            }
            
            return r;
            
        }
        
        
        private static Complex sub(I i1, double c){
            
            I ir;
            ir = new I(c);
            
            return sub(i1, ir);
            
        }
        
        
        private static Complex sub(double c, I i1){
            
            I ir;
            ir = new I(c);
            
            return sub(ir, i1);
            
        }

        
        public static Complex sub(Complex c1, Complex c2){
            double d1, d2;
            I ir;

            d1 = c1.realPart - c2.realPart;
			d2 = c1.imaginaryPart.coefficient - c2.imaginaryPart.coefficient;

            return new Complex(d1, d2);

        }


        public static Complex sub(Complex c, double d){
            Complex kr;
            kr = new Complex(d);
            
            return sub(c, kr);

        }
        
        
        public static Complex sub(double d, Complex c){
            Complex kr;
            kr = new Complex(d);
            
            return sub(kr, c);

        }
        
        
        private static Complex sub(Complex c, I i){
            Complex kr;
            kr = new Complex(i);
            
            return sub(c, kr);

        }
        
        
        private static Complex sub(I i, Complex c){
            Complex kr;
            kr = new Complex(i);
            
            return sub(kr, c);

        }
        
        
        private static Complex mul(I i1, I i2){
            String sm1, sm2;
            double km1, km2, d;
            Complex r;
            r = new Complex(0);
            I ir = new I(0);
         

           sm1 = i1.getValue();
           sm2 = i2.getValue();
           km1 = i1.getCoefficient();
           km2 = i2.getCoefficient();
           d   = km1 * km2;

           if (sm1.equals("") && sm2.equals("")){

               r.setValue(d);

           }

           if (sm1.equals("i") && sm2.equals("")){

               ir.setValue(d, 1);
               r.setValue(0, ir);

           }

           if (sm1.equals("") && sm2.equals("i")){

               ir.setValue(d, 1);
               r.setValue(0, ir);

           }

           if (sm1.equals("i") && sm2.equals("i")){

               ir.setValue(d, 2);
               r.setValue(0, ir);

           }

           return r;
        }   


        private static Complex mul(I i1, double c){
            
            I ir;
            ir = new I(c);
            
            return mul(i1, ir);
            
        }
        
        
        private static Complex mul(double c, I i1){
            
            I ir;
            ir = new I(c);
            
            return mul(ir, i1);
            
        }


        public static Complex mul(Complex c1, Complex c2){
            Complex r;

            r = mul(c1.imaginaryPart, c2.realPart);
            r = add(r, mul(c1.imaginaryPart, c2.imaginaryPart));
            r = add(r, mul(c2.imaginaryPart, c1.realPart));
            r = add(r, (c2.realPart * c1.realPart));
            return r;

        }


        public static Complex mul(Complex c, double d){
            
            return add(mul(c.imaginaryPart, d), (c.realPart * d));

        }
        
        
        public static Complex mul(double d, Complex c){
            
            return add(mul(c.imaginaryPart, d), (c.realPart * d));

        }
        
        
        private static Complex mul(Complex c, I i){
            
            return mul(new Complex(i), c);

        }
        
        
        private static Complex mul(I i, Complex c){
            
            return mul(new Complex(i), c);

        }


        private static Complex div(I i1, I i2){
            String sm1, sm2;
            double km1, km2, d;
            Complex r;
            r = new Complex(0);
            I ir = new I(0);
         

           sm1 = i1.getValue();
           sm2 = i2.getValue();
           km1 = i1.getCoefficient();
           km2 = i2.getCoefficient();
           d   = km1 / km2;

           if (sm1.equals("") && sm2.equals("")){

               ir.setValue(d, 0);
               r.setValue(0, ir);

           }

           if (sm1.equals("i") && sm2.equals("")){

               ir.setValue(d, 1);
               r.setValue(0, ir);

           }

           if (sm1.equals("") && sm2.equals("i")){

               ir.setValue(d, -1);
               r.setValue(0, ir);

           }

           if (sm1.equals("i") && sm2.equals("i")){

               ir.setValue(d, 0);
               r.setValue(0, ir);

           }

           return r;
        }


        private static Complex div(I i1, double d){
            
            I ir;
            ir = new I(d);
            
            return div(i1, ir);
            
        }
        
        
        private static Complex div(double c, I i1){
            
            I ir;
            ir = new I(c);
            
            return div(ir, i1);
            
        }

        
        public static Complex div(Complex c, double d){
                                 
            return add(div(c.imaginaryPart, d), (c.realPart / d));
            
        }
        
        
        public static Complex div(double d, Complex c){
                        
            return div(new Complex(d), c);
            
        }
        

        public static Complex div(Complex c1, Complex c2){
            Complex r, ks, kt1, kt2;
            double d;

            ks  = c2.getComplexConjugateNumber();
            kt1 = mul(c1, ks);
            kt2 = mul(c2, ks);
            d   = kt2.getRealPart();
            r   = div(kt1, d);
            
            return r;

        }


        private static Complex div(Complex c, I i){
                                 
            return div(c, new Complex(i));
            
        }
        
        
        private static Complex div(I i, Complex c){
                        
            return div(new Complex(i), c);
            
        }


        public static Complex pow(Complex c1, Complex p){
            Complex kcs;
            double d, k, d2, d1;

            if (c1.getAbsoluteValue() == 0){

            	return new Complex(0);

			} else {

				I i1;
				I ir = new I(0);

				kcs = c1.ln();
				kcs = mul(p, kcs);
				d = kcs.getRealPart();
				i1 = kcs.getImaginaryPart();
				k = i1.getCoefficient();
				d1 = Math.cos(k) * Math.pow(C.e, d);
				d2 = Math.sin(k) * Math.pow(C.e, d);
				ir.setValue(d2, 1);

				return new Complex(d1, ir);
			}

        }
        
        
        public static Complex pow(Complex c1, double pwr){
			Complex kcs, p;
			double d, k, d2, d1;

			if (c1.getAbsoluteValue() == 0){

				return new Complex(0);

			} else {

				I i1;
				I ir = new I(0);
				p = new Complex(pwr);

				kcs = c1.ln();
				kcs = mul(p, kcs);
				d = kcs.getRealPart();
				i1 = kcs.getImaginaryPart();
				k = i1.getCoefficient();
				d1 = Math.cos(k) * Math.pow(C.e, d);
				d2 = Math.sin(k) * Math.pow(C.e, d);
				ir.setValue(d2, 1);

				return new Complex(d1, ir);
			}

		}


	public static Complex root(Complex c1, double p){
		Complex kcs;
		double d, k, d2, d1;

		if (c1.getAbsoluteValue() == 0){

			return new Complex(0);

		} else {

			I i1;
			I ir = new I(0);
			p = 1 / p;

			kcs = c1.ln();
			kcs = mul(p, kcs);
			d = kcs.getRealPart();
			i1 = kcs.getImaginaryPart();
			k = i1.getCoefficient();
			d1 = Math.cos(k) * Math.pow(C.e, d);
			d2 = Math.sin(k) * Math.pow(C.e, d);
			ir.setValue(d2, 1);

			return new Complex(d1, ir);
		}

	}

        
        public static Complex root(Complex c1, Complex p){
			Complex kcs;
			double d, k, d2, d1;

			if (c1.getAbsoluteValue() == 0){

				return new Complex(0);

			} else {

				I i1;
				I ir = new I(0);
				p = Complex.div(1, p);

				kcs = c1.ln();
				kcs = mul(p, kcs);
				d = kcs.getRealPart();
				i1 = kcs.getImaginaryPart();
				k = i1.getCoefficient();
				d1 = Math.cos(k) * Math.pow(C.e, d);
				d2 = Math.sin(k) * Math.pow(C.e, d);
				ir.setValue(d2, 1);

				return new Complex(d1, ir);
			}

		}
        
        
        public static Complex pow(double x, Complex p){
			Complex kcs, c1;
			double d, k, d2, d1;

			if (x == 0){

				return new Complex(0);

			} else {

				I i1;
				I ir = new I(0);
				c1 = new Complex(x);

				kcs = c1.ln();
				kcs = mul(p, kcs);
				d = kcs.getRealPart();
				i1 = kcs.getImaginaryPart();
				k = i1.getCoefficient();
				d1 = Math.cos(k) * Math.pow(C.e, d);
				d2 = Math.sin(k) * Math.pow(C.e, d);
				ir.setValue(d2, 1);

				return new Complex(d1, ir);
			}

		}


        public void roundSelf(long precision){
          double ic;

          realPart = F.round(realPart, precision);
          ic = F.round(imaginaryPart.getCoefficient(), precision);

          if (imaginaryPart.getValue().equals("")) imaginaryPart.setValue(ic, 0); else imaginaryPart.setValue(ic, 1);

        }
        
        
        public Complex round(long precision){
            double ic;
            double rp;
            I imp = new I(0);

            rp = F.round(realPart, precision);

            if (imaginaryPart.getValue().equals("")){
                
                imp.setValue(0, 1);
                
            } else {
                
                ic = F.round(imaginaryPart.getCoefficient(), precision);
                imp.setValue(ic, 1);
                
            }

            return new Complex(rp, imp);
            
        }


        public Complex getReciprocal(){
            
            return div(1, this);

        }
        
        
        public Complex getExp(){
            
            return pow(C.e, this);

        }


        public Complex sin(){

			Complex st1, st2, e1, e2, ch, zn;
			Complex mnI = new Complex("i");

			st1 = Complex.mul(this, mnI);
			st2 = Complex.mul(-1, Complex.mul(this, mnI));
			e1  = Complex.pow(C.e, st1);
			e2  = Complex.pow(C.e, st2);
			ch  = Complex.sub(e1, e2);
			zn  = Complex.mul(2, new Complex("i"));

			return Complex.div(ch, zn);
            
        }
        
        
        public Complex cos(){

			Complex st1, st2, e1, e2, ch;
            Complex mnI = new Complex("i");
        
            st1 = Complex.mul(this, mnI);
			st2 = Complex.mul(-1, Complex.mul(this, mnI));
			e1  = Complex.pow(C.e, st1);
			e2  = Complex.pow(C.e, st2);
			ch  = Complex.add(e1, e2);

            return Complex.div(ch, 2);
            
        }
        
        
        public Complex tg(){
        
            return div(sin(), cos());
            
        }
        
        
        public Complex ctg(){
        
            return div(cos(), sin());
            
        }


        public Complex asin(){
        
            Complex k1, k2, k3;
            
            k1 = new Complex("1i");
            k2 = new Complex("-i");
            k3 = pow(this, 2);
            k3 = sub(1, k3);
            k3 = pow(k3, 0.5);
            k3 = add(k3, mul(this, k1));
            k3 = mul(k3.ln(), k2);

            return k3;
            
        }


        public Complex acos(){
        
            Complex k2, k3;
            
            k2 = new Complex("-i");
            k3 = pow(this, 2);
            k3 = sub(k3, 1);
            k3 = pow(k3, 0.5);
            k3 = add(k3, this);
            k3 = mul(k3.ln(), k2);

            if (F.sign(this).getRealPart() < 0) {

            	k3 = Complex.mul(-1, k3);

			}

            return k3;
            
        }


        public Complex atg(){
        
            Complex k1, k2, k3;
            
            k1 = new Complex("i");
            k2 = new Complex("-i");
            k3 = div(k2, 2);

            k1 = add(1, mul(k1, this));
            k2 = add(1, mul(k2, this));
            k1 = div(k1, k2);
            k1 = mul(k1.ln(), k3);

            return k1;
            
        }
        
        
        public Complex actg(){
        
            Complex k1, k2, k3;
            
            k1 = new Complex("i");
            k2 = new Complex("-i");
            k3 = div(k1, 2);

            k2 = mul(k1, this);
            k2 = sub(k2, 1);
            k1 = mul(k1, this);
            k1 = add(k1, 1);
            k1 = div(k1, k2);
            k1 = mul(k1.ln(), k3);

            return k1;
            
        }
        
        
        public Complex toRadians(){
        
            return mul(this, C.pi / 180);
            
        }
        
        
        public Complex toDegrees(){
        
            return mul(this, 180 / C.pi);
            
        }
        

        public Complex sec(){
        
            return div(1, cos());
            
        }
        
        
        public Complex cosec(){
        
            return div(1, sin());
            
        }
        

        public Complex ash(){
            Complex r;
            
            r = pow(this, 2);
            r = add(r, 1);
            r = pow(r, 0.5);
            r = add(r, this);
            r = r.ln();
            
            return r;
        }


        public Complex ach(){
            Complex r;
            
            r = pow(this, 2);
            r = sub(r, 1);
            r = pow(r, 0.5);
            r = add(r, this);
            r = r.ln();
            
            return r;
        }


        public Complex ath(){
            Complex r;
            
            r = div(add(1, this), sub(1, this));
            r = mul(r.ln(), 0.5);
            
            return r;
        }
        
        
        public Complex acth(){
            Complex r;
            
            r = div(add(1, this), sub(this, 1));
            r = mul(r.ln(), 0.5);
            
            return r;
        }
        
        
        public Complex sh(){
            Complex r1, r2, r3, r4;
            
            r1 = pow(C.e, this);
            r2 = pow(-1, this);
            r3 = pow(C.e, r2);
            r3 = div(sub(r1, r3), 2);
            
            return r3;
        }
        
        
        public Complex ch(){
            Complex r1, r2, r3, r4;
            
            r1 = pow(C.e, this);
            r2 = pow(-1, this);
            r3 = pow(C.e, r2);
            r3 = div(add(r1, r3), 2);
            
            return r3;
        }


        public Complex th(){
        
            return div(sh(), ch());
            
        }
        
        
        public Complex cth(){
        
            return div(ch(), sh());
            
        }
        
        
        public Complex sech(){
        
            return div(1, ch());
            
        }
        
        
        public Complex cosech(){
        
            return div(1, sh());
            
        }
        
        
        public Complex getYOfXByLagrangePolinomialInterpolation(ArrayList<Complex> ax, ArrayList<Complex> ay, long precision){

			Complex[][] m = new Complex[ax.size()][2];

			Complex t1 = new Complex(1);
			Complex t2 = new Complex(1);

			for (int i = 0; i < ax.size(); i++){

				m[i][0] = ax.get(i);
				m[i][1] = ay.get(i);

			}

			Complex[] l = new Complex[m.length];
			Complex L = new Complex(0);

			for (int i = 0; i < m.length; i++){

				l[i]  = new Complex(1);
				for (int j = 0; j < m.length; j++){

					if (j != i){

						t1 = Complex.sub(this, m[j][0]);
						t2 = Complex.sub(m[i][0], m[j][0]);
						t1 = Complex.div(t1, t2);
						l[i] = Complex.mul(l[i], t1);

					}

				}

			}

			for (int i = 0; i < m.length; i++){

				t1 = Complex.mul(m[i][1], l[i]);
				L = Complex.add(L, t1);

			}

			return L.round(precision);

		}
        
}