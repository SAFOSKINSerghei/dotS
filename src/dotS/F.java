package dotS;

import java.nio.channels.ScatteringByteChannel;
import java.util.*;

public final class F {
	
	public static double sToD(String text) {
		
		return Double.parseDouble(text.replaceAll(",", "."));
		
	}

	
	
	public static String getDegreeSymbolToString() {
		
		return "°";
		
	}
		
	
	public static long factorial(long n) {
		
		if (n == 0) {
			
			return 1;
			
		} else {
			
			if (n < 0) {
				
				return 0;
				
			} else {
				
				return factorial(n - 1) * n;
				
			}
			
		}
		
	}

	
	public static double degreesToRadians(double degrees) {
		
		return degrees * C.pi/ 180;
		
	}
	
	
	public static double radiansToDegrees(double radians) {
		
		return 180 * radians / C.pi;
		
	}
	
	
	public static double sin(double degrees) {
		
		return Math.sin(degreesToRadians(degrees));
		
	}
	
	
	public static double cos(double degrees) {
		
		return Math.cos(degreesToRadians(degrees));
		
	}
	
	
	public static double tg(double degrees) {
		
		return sin(degrees) / cos(degrees);
		
	}
	
	
	public static double ctg(double degrees) {
		
		return cos(degrees) / sin(degrees);
		
	}


	public static double sec(double degrees) {
		
		return 1 / cos(degrees);
		
	}
	
	
	public static double cosec(double degrees) {
		
		return 1 / sin(degrees);
		
	}


	public static double sh(double x) {
		
		return (Math.pow(C.e, (x)) - Math.pow(C.e, -(x))) / 2;
		
	}
	
	
	public static double ch(double x) {
		
		return (Math.pow(C.e, (x)) + Math.pow(C.e, -(x))) / 2;
		
	}
	
	
	public static double th(double x) {
		
		return sh(x) / ch(x);
		
	}
	
	
	public static double cth(double x) {
		
		return ch(x) / sh(x);
		
	}
	
	
	public static double sch(double x) {
		
		return 1 / ch(x);
		
	}
	
	
	public static double csch(double x) {
		
		return 1 / sh(x);
		
	}


	public static long taxiCabDistance(long x1, long y1, long x2, long y2) {
		
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
		
	}
	
	
	public static long chebyshevDistance(long x1, long y1, long x2, long y2) {
		
		return Math.max(Math.abs(x1 - x2), Math.abs(y1 - y2));
		
	}


	public static long gcd(long number1, long number2) {
		
		long m = number1;
		long n = number2;
		long r = m % n;
		
		while (r > 0) {
			
			m = n;
			n = r;
			r = m % n;
			
		}
		
		return n;
		
	}


	public static long lcm(long number1, long number2) {
		
		return Math.round(Math.abs(number1 * number2) / gcd(number1, number2));
		
	}


	public static String toFraction(double number) {
		
		double c  = number;
		double c2 = 0, ic = 0, kzpz, s10, cTemp, z;
		String cS, zS, icS;
		if (c > 0) {
			
			ic = Math.floor(c);
			c2 = c - ic;
			
		} else {
			
			if (c < 0) {
				
				ic = Math.ceil(c);
				c2 = Math.abs(c - ic);
				
			}
			
		}
		
		if (ic == c) {
			
			cS = String.format("%.0f", number);
			
		} else {
			
			if (Math.round(c) == c) {
				
				kzpz = String.valueOf(c).length() - 1;
				
			} else {
				
				kzpz = String.valueOf(c).length() - 2;
				
			}
			
			s10   = Math.pow(10, kzpz);
			c2    = Math.abs(c2 * s10);
			
			cTemp = gcd(Math.round(c2), Math.round(s10));
			c     = c2 / cTemp;
			z     = s10 / cTemp;
			
			if (ic == 0) {
				
				icS = "";
				
			} else {
				
				icS = String.format("%.0f", ic);
				
			}
			
			cS = String.format("%.0f", c);
			zS = String.format("%.0f", z);
			
			if (ic == 0) {
					
				if (number > 0) {
					
					cS = cS + "/" + zS;
				
				} else {
					
					cS = "-[" + cS + "/" + zS + "]";
					
				}
					
			} else {
			
				if (ic  !=  number && !cS.equals("0")) {
					
					cS = icS + "[" + cS + "/" + zS + "]";
				
				}
			
			}
			
		}
		
		return cS;
	
	}


	public static double sign(double number) {

		if(number != 0){

			return number / Math.abs(number);

		} else {

			return 0;

		}

	}



	public static Complex[] doublicatesRemove(Complex[] arrC) {

		Complex[] result;
		int k = 0, ki = 0;
		for (int i = (arrC.length - 1); i > -1; i--){

			for (int j = (i - 1); j > -1; j--){

				try {
					if (arrC[i].round(6).getRealPart() == arrC[j].round(6).getRealPart() && arrC[i].round(6).getImaginaryPart().getCoefficient() == arrC[j].round(6).getImaginaryPart().getCoefficient()) {

						arrC[j] = null;

					}
				}catch(Exception e){}

			}

		}

		for (int i = 0; i < arrC.length; i++){

			if (arrC[i] != null){

				k += 1;

			}

		}

		result = new Complex[k];
		for (int i = 0; i < arrC.length; i++){

			if (arrC[i] != null){

				result[ki] = arrC[i];
				ki += 1;

			}

		}

		return result;

	}



	public static Complex[] quadratic_equation(Complex a, Complex b, Complex c){
		Complex[] result;
		Complex D = Complex.pow(Complex.sub(Complex.pow(b, 2), Complex.mul(4, Complex.mul(a, c))), 0.5);

		if (F.sign(D).getRealPart() == 0) {//F.round(D.getRealPart(), 6) == 0 && F.round(D.getImaginaryPart().getCoefficient(), 6)

			result = new Complex[1];
			result[0] = Complex.div(Complex.add(Complex.mul(-1, b), D), Complex.mul(2, a));

		} else{

			result = new Complex[2];
			result[0] = Complex.div(Complex.add(Complex.mul(-1, b), D), Complex.mul(2, a));
			result[1] = Complex.div(Complex.sub(Complex.mul(-1, b), D), Complex.mul(2, a));

		}

		return result;
	}
	public static Complex[] cubic_equation(Complex a, Complex b, Complex c){
		Complex[] result  = new Complex[3];
		Complex Q, R, S, fi, T;

		Q = Complex.div(Complex.sub(Complex.pow(a, 2), Complex.mul(3, b)), 9);
		R = Complex.div(Complex.add(Complex.sub(Complex.mul(2, Complex.pow(a, 3)), Complex.mul(9, Complex.mul(a, b))), Complex.mul(27, c)), 54);
		S = Complex.sub(Complex.pow(Q, 3), Complex.pow(R, 2));

		if (F.sign(S).getRealPart() == 0) {

			result    = new Complex[2];
			T         = Complex.mul(F.sign(R), Math.pow(Q.getAbsoluteValue(), 0.5));
			result[0] = Complex.sub(Complex.mul(-2, T), Complex.div(a, 3));
			result[1] = Complex.sub(T, Complex.div(a, 3));

		} else{

			if (F.sign(S).getRealPart() == 1) {

				result    = new Complex[3];
				fi        = Complex.div(Complex.div(R, Complex.pow(Complex.pow(Q, 3), 0.5)).acos(), 3);
				result[0] = Complex.sub(Complex.mul(Complex.mul(-2, Complex.pow(Q, 0.5)), fi.cos()), Complex.div(a, 3));
				result[1] = Complex.sub(Complex.mul(Complex.mul(-2, Complex.pow(Q, 0.5)), Complex.add(fi, (2 * C.pi / 3)).cos()), Complex.div(a, 3));
				result[2] = Complex.sub(Complex.mul(Complex.mul(-2, Complex.pow(Q, 0.5)), Complex.sub(fi, (2 * C.pi / 3)).cos()), Complex.div(a, 3));

			} else{

				result    = new Complex[3];
				fi        = Complex.div(Complex.div(R, Complex.pow(Complex.pow(Q, 3), 0.5)).ach(), 3);
				T         = Complex.mul(Complex.mul(F.sign(R), Math.pow(Q.getAbsoluteValue(), 0.5)), fi.ch());
				result[0] = Complex.sub(Complex.mul(-2, T), Complex.div(a, 3));
				result[1] = Complex.add(Complex.sub(T, Complex.div(a, 3)), Complex.mul(Complex.mul(Math.pow(3, 0.5), fi.sh()), new Complex("i")));
				result[2] = Complex.add(Complex.sub(T, Complex.div(a, 3)), Complex.mul(Complex.mul(-1 * Math.pow(3, 0.5), fi.sh()), new Complex("i")));

			}


		}

		return result;
	}





	public static Complex sign(Complex number) {

		if(F.round(number.getRealPart(), 6) != 0 || F.round(number.getImaginaryPart().getCoefficient(), 6) != 0){

			return Complex.pow(C.e, Complex.mul(new Complex("i"), number.getArgument())).round(6);

		} else {

			return new Complex(0);

		}

	}



	
	public static double round(double number, long precision) {
		
		return Double.parseDouble(String.format("%." + String.valueOf(precision) + "f", number).replaceAll(",", "."));		
		
	}
        
    
        public static int getCharCountInString(String text, char c){

                int r = 0;

                for (int i = 0; i < text.length(); i++){

                    if (text.charAt(i) == c) {

                        r += 1;

                    }

                }

                return r;

            }


        public static int getCharsCountInString(String text, char[] c){

                int r = 0;

                for (int i = 0; i < text.length(); i++){

                    for (int j = 0; j < c.length; j++){

                        if (text.charAt(i) == c[j]) {

                            r += 1;

                        }

                    }

                }

                return r;

            }

        
        public static boolean isCharInArrayOfChars(char ch, char[] c){
        
            boolean b = false;
            
            for (char e: c){
            
                if(ch == e){
                
                    b = true;
                
                }
            
            }
            
            return b;
        
        }
        

        public static String[] splitStringBySomeChars(String text, char[] c, boolean cuttingChars){

            int l = F.getCharsCountInString(text, c);
            String[] r;
            if (text.charAt(0) == '-'){
                
                r = new String[l];
                
                for (int i = 0; i < l; i++){
                    
                    r[i] = "";
                    
                }
                
            } else{
            
                r = new String[l + 1];
                
                for (int i = 0; i < l + 1; i++){
                    
                    r[i] = "";
                    
                }
            
            }
            
            int ind;
            if (isCharInArrayOfChars(text.charAt(0), c)){
                
                ind = -1;
                
            } else {
            
                ind = 0;
            
            }
            
            
            for (int i = 0; i < text.length(); i++){
            
                if (isCharInArrayOfChars(text.charAt(i), c)){
                
                    ind += 1;
                    if (cuttingChars == false){
                    
                        r[ind] += String.valueOf(text.charAt(i));
                    
                    }
                
                } else{
                
                    r[ind] += String.valueOf(text.charAt(i));
                
                }
            
            }

            return r;

        }

        public static Complex[][] transpose(Complex[][] ark){
        
            Complex[][] mk;
            sizeRowsCols sra;
            
            sra = new sizeRowsCols(ark.length, ark[0].length);
            mk = new Complex[sra.cols][sra.rows];
            
            for (int r = 0; r < sra.rows; r++){
            
                for (int c = 0; c < sra.cols; c++){
                
                    mk[c][r] = ark[r][c];
                
                }
            
            }
            
            return mk;
        
        }
        
        
        public static double getYOfXByLagrangePolinomialInterpolation(double x, ArrayList<Double> ax, ArrayList<Double> ay, long precision){
        
            double[][] m = new double[ax.size()][2];
            
            for (int i = 0; i < ax.size(); i++){
            
                m[i][0] = ax.get(i);
                m[i][1] = ay.get(i);
            
            }
            
            double[] l = new double[m.length];
            double L = 0;
            
            for (int i = 0; i < m.length; i++){
            
                l[i] = 1;
                for (int j = 0; j < m.length; j++){
            
                    if (j != i){
                    
                        l[i] *= (x - m[j][0]) / (m[i][0] - m[j][0]);
                    
                    }
            
                }
                                
            }
            
            for (int i = 0; i < m.length; i++){
                
                L += m[i][1]*l[i];               
                
            }

            return F.round(L, precision);

        }


	public static Complex getYOfXByLagrangePolinomialInterpolationComplex(Complex x, ArrayList<Complex> ax, ArrayList<Complex> ay, long precision){

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

					t1 = Complex.sub(x, m[j][0]);
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
