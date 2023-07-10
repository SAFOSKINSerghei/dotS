package dotS;


public class Matrix {
    
    private Complex[][] arrK;
    private sizeRowsCols sizeRC;
    
    public Matrix(sizeRowsCols sz){
        
        sizeRC = sz;
        arrK = new Complex[sizeRC.rows][sizeRC.cols];
        
        for (int r = 0; r < sizeRC.rows; r++){
        
            for (int c = 0; c < sizeRC.cols; c++){
                
                arrK[r][c] = new Complex(0);
                
            }
        
        }        
    
    }
    
    
    public void setValue(sizeRowsCols sz){
        
        sizeRC = sz;
        arrK = new Complex[sizeRC.rows][sizeRC.cols];
        
        for (int r = 0; r < sizeRC.rows; r++){
        
            for (int c = 0; c < sizeRC.cols; c++){
                
                arrK[r][c] = new Complex(0);
                
            }
        
        }        
    
    }
    
    
    public Matrix(Complex[][] arrComplex){
        
        arrK = arrComplex;
        sizeRC = new sizeRowsCols(arrComplex.length, arrComplex[0].length);
    
    }
    
    
    public void setValue(Complex[][] arrComplex){
        
        arrK = arrComplex;
        sizeRC = new sizeRowsCols(arrComplex.length, arrComplex[0].length);
    
    }
    
    
    public Matrix(int sz){

        sizeRC = new sizeRowsCols(sz);
        arrK = new Complex[sizeRC.rows][sizeRC.cols];
        
        for (int r = 0; r < sizeRC.rows; r++){
        
            for (int c = 0; c < sizeRC.cols; c++){
                
                if (r == c){
                
                    arrK[r][c] = new Complex(1);
                
                } else{
                
                    arrK[r][c] = new Complex(0);
                
                }
                
            }
        
        }

    }
    
    
    public void setValue(int sz){

        sizeRC = new sizeRowsCols(sz);
        arrK = new Complex[sizeRC.rows][sizeRC.cols];
        
        for (int r = 0; r < sizeRC.rows; r++){
        
            for (int c = 0; c < sizeRC.cols; c++){
                
                if (r == c){
                
                    arrK[r][c] = new Complex(1);
                
                } else{
                
                    arrK[r][c] = new Complex(0);
                
                }
                
            }
        
        }

    }
    
    
    public Matrix(int sz, int valMax){
    
        sizeRC = new sizeRowsCols(sz);
        arrK = new Complex[sizeRC.rows][sizeRC.cols];
        java.util.Random random = new java.util.Random();
        
        for (int r = 0; r < sizeRC.rows; r++){
        
            for (int c = 0; c < sizeRC.cols; c++){
                
                arrK[r][c] = new Complex(random.nextInt(valMax));
                
            }
        
        }  
        
    
    }
    
    
    public void setValue(int sz, int valMax){
    
        sizeRC = new sizeRowsCols(sz);
        arrK = new Complex[sizeRC.rows][sizeRC.cols];
        java.util.Random random = new java.util.Random();
        
        for (int r = 0; r < sizeRC.rows; r++){
        
            for (int c = 0; c < sizeRC.cols; c++){
                
                arrK[r][c] = new Complex(random.nextInt(valMax));
                
            }
        
        }  
        
    
    }
    
    
    @Override
    public String toString(){
    
        String rs = "", s;
                
        for (int r = 0; r < sizeRC.rows; r++){
        
            rs += "(";
            for (int c = 0; c < sizeRC.cols; c++){
                
                s = arrK[r][c].toString();
                if (c < sizeRC.cols - 1){
                    
                    rs += s + ", ";
                    
                } else{
                
                    rs += s;
                
                }
                
            }
            if (r < sizeRC.rows - 1){
            
                rs += ")\n";
            
            } else{
            
                rs += ")";
            
            }
        
        }
                
        return rs;
    
    }
    
    
    public String toStringInAlgebraicForm(int precision){
    
        String rs = "", s;
                
        for (int r = 0; r < sizeRC.rows; r++){
        
            rs += "(";
            for (int c = 0; c < sizeRC.cols; c++){
                
                s = arrK[r][c].getAlgebraicForm(precision);
                if (c < sizeRC.cols - 1){
                    
                    rs += s + ", ";
                    
                } else{
                
                    rs += s;
                
                }
                
            }
            if (r < sizeRC.rows - 1){
            
                rs += ")\n";
            
            } else{
            
                rs += ")";
            
            }
        
        }
                
        return rs;
    
    }
  
    
    public void setValue(int r, int c, Complex newValue){
    
        arrK[r - 1][c - 1] = newValue;
    
    }
    
    public void setValue(int r, int c, double newValue){
    
        arrK[r - 1][c - 1].setValue(newValue);
    
    }
    
    
    public void setValue(int r, int c, String newValue){
    
        arrK[r - 1][c - 1].setValue(newValue);
    
    }
    
    
    public sizeRowsCols getSize(){
    
        return sizeRC;
    
    }
    
    
    public Matrix getTranspose(){
    
        return new Matrix(F.transpose(arrK));
    
    }
    
    
    public Complex[][] getCells(){
    
        return arrK;
    
    }
    
    
    public Complex getCellValue(int r, int c){
    
        return arrK[r - 1][c - 1];
    
    }
    
    
    public Matrix getPower(int pw){
    
        Matrix m1;
        int p;
        
        
        m1 = this;
        
        for (p = 0; p < (pw - 2); p++){
        
            m1 = mul(this, m1);
            
        }
        
        return m1;    
    
    }
    
    
    public static Matrix mul(Matrix m, Complex k){
        Complex[][] ak;

      ak = new Complex[m.sizeRC.rows][m.sizeRC.cols];

      for (int r = 0; r < m.sizeRC.rows; r++){

          for (int c = 0; c < m.sizeRC.cols; c++){

              ak[r][c] = Complex.mul(m.arrK[r][c], k);

          }

      }
      
      return new Matrix(ak);

    }
    
    
    public static Matrix mul(Matrix m, double k){
        Complex[][] ak;

      ak = new Complex[m.sizeRC.rows][m.sizeRC.cols];

      for (int r = 0; r < m.sizeRC.rows; r++){

          for (int c = 0; c < m.sizeRC.cols; c++){

              ak[r][c] = Complex.mul(m.arrK[r][c], k);

          }

      }
      
      return new Matrix(ak);

    }
    
    
    public static Matrix mul(Complex k, Matrix m){
        Complex[][] ak;

      ak = new Complex[m.sizeRC.rows][m.sizeRC.cols];

      for (int r = 0; r < m.sizeRC.rows; r++){

          for (int c = 0; c < m.sizeRC.cols; c++){

              ak[r][c] = Complex.mul(k, m.arrK[r][c]);

          }

      }
      
      return new Matrix(ak);

    }
    
    
    public static Matrix mul(double k, Matrix m){
        Complex[][] ak;

      ak = new Complex[m.sizeRC.rows][m.sizeRC.cols];

      for (int r = 0; r < m.sizeRC.rows; r++){

          for (int c = 0; c < m.sizeRC.cols; c++){

              ak[r][c] = Complex.mul(k, m.arrK[r][c]);

          }

      }
      
      return new Matrix(ak);

    }
        
    
    public static Matrix mul(Matrix m1, Matrix m2){
      Complex[][] mss, mss2;
      Complex k;

      if (m1.sizeRC.cols == m2.sizeRC.rows){

          mss  = new Complex[m1.sizeRC.rows][m2.sizeRC.cols];
          mss2 = m2.getCells();

          for (int r = 0; r < m1.sizeRC.rows; r++){

              for (int c = 0; c < m2.sizeRC.cols; c++){

                  mss[r][c] = new Complex(0);
                  for (int c2 = 0; c2 < m1.sizeRC.cols; c2++){

                      k         = mss2[c2][c];
                      k         = Complex.mul(m1.arrK[r][c2], k);
                      mss[r][c] = Complex.add(mss[r][c], k);

                    }

                }

            }
          return new Matrix(mss);

        } else{

            return null;

        }     
      

    }
    
    
    public void addCols(int countOfNewCols){
    
        int n, nc, nr;
        Complex[][] arrK2;
        arrK2 = arrK;
        
        n  = sizeRC.cols;
        nc = n + countOfNewCols;
        nr = sizeRC.rows;
        arrK = new Complex[nr][nc];
        
        for (int c = 0; c < n; c++){
        
            for (int r = 0; r < nr; r++){
            
                arrK[r][c] = arrK2[r][c];
            
            }
        
        }        
        
        for (int c = n; c < nc; c++){
        
            for (int r = 0; r < nr; r++){
            
                arrK[r][c] = new Complex(0);
            
            }
        
        }
        
        sizeRC.cols = nc;
    
    }
    
    
    public void deleteCols(int countOfCols){
    
        int n, nc, nr;   
        Complex[][] arrK2;
        arrK2 = arrK;
        n  = sizeRC.cols;
        nc = n - countOfCols;
        nr = sizeRC.rows;
        arrK = new Complex[nr][nc];
        
        for (int c = 0; c < nc; c++){
        
            for (int r = 0; r < nr; r++){
            
                arrK[r][c] = arrK2[r][c];
            
            }
        
        }  
        
        sizeRC.cols = nc;
    
    }
    
    
    public void addRows(int countOfNewRows){
    
        int n, nc, nr;
        Complex[][] arrK2;
        arrK2 = arrK;
        
        nc  = sizeRC.cols;
        n = sizeRC.rows;
        nr = n + countOfNewRows;
        arrK = new Complex[nr][nc];
        
        for (int c = 0; c < nc; c++){
        
            for (int r = 0; r < n; r++){
            
                arrK[r][c] = arrK2[r][c];
            
            }
        
        }        
        
        for (int c = 0; c < nc; c++){
        
            for (int r = n; r < nr; r++){
            
                arrK[r][c] = new Complex(0);
            
            }
        
        }
        
        sizeRC.rows = nr;
    
    }
    
    
    public void deleteRows(int countOfRows){
    
        int n, nc, nr;   
        Complex[][] arrK2;
        arrK2 = arrK;
        n  = sizeRC.cols;
        nc = n;
        nr = sizeRC.rows - countOfRows;
        arrK = new Complex[nr][nc];
        
        for (int c = 0; c < nc; c++){
        
            for (int r = 0; r < nr; r++){
            
                arrK[r][c] = arrK2[r][c];
            
            }
        
        }  
        
                
        sizeRC.rows = nr; 
    
    }
    
    
    public Matrix deleteCol(int colNumber){
    
        Complex[][] nm;
        int nc, nr;
        
        nc = sizeRC.cols - 1;
        nr = sizeRC.rows;
        nm = new Complex[nr][nc];
        
        for (int r = 0; r < nr; r++){
        
            for (int c = 0; c < (colNumber - 1); c++){
                
                    nm[r][c] = new Complex(0);
                    nm[r][c].setValue(arrK[r][c].toString());
                
            }
        
        }
        
        for (int r = 0; r < nr; r++){
        
            for (int c = colNumber; c < nc + 1; c++){
                
                    nm[r][c - 1] = new Complex(0);
                    nm[r][c - 1].setValue(arrK[r][c].toString());
                
            }
        
        }
        
        return new Matrix(nm);
    
    }
    
    
    public Matrix deleteRow(int rowNumber){
    
        Complex[][] nm;
        int nc, nr;
        
        nc = sizeRC.cols;
        nr = sizeRC.rows - 1;
        nm = new Complex[nr][nc];
        
        for (int r = 0; r < (rowNumber - 1); r++){
        
            for (int c = 0; c < nc; c++){
                
                    nm[r][c] = new Complex(0);
                    nm[r][c].setValue(arrK[r][c].toString());
                
            }
        
        }
        
        for (int r = rowNumber; r < nr + 1; r++){
        
            for (int c = 0; c < nc; c++){
                
                    nm[r - 1][c] = new Complex(0);
                    nm[r - 1][c].setValue(arrK[r][c].toString());
                
            }
        
        }
        
        return new Matrix(nm);
    
    }
    
    
    public Matrix getCol(int c){
    
        Complex[][] ms;
        
        ms = new Complex[sizeRC.rows][1];
        for (int r = 0; r <sizeRC.rows; r++){
        
            ms[r][0] = arrK[r][c - 1];
        
        }
        
        return new Matrix(ms);
    
    }
    
    
    public Matrix getRow(int r){
    
        Complex[][] ms;
        
        ms = new Complex[1][sizeRC.cols];
        for (int c = 0; c <sizeRC.cols; c++){
        
            ms[0][c] = arrK[r - 1][c];
        
        }
        
        return new Matrix(ms);
    
    }
    
    
    public static Matrix add(Matrix m1, Matrix m2){
    
        Complex[][] mss;
        boolean eq;
        
        eq = m1.sizeRC.equals(m2.sizeRC);
        
        if (eq == true){
        
            mss = new Complex[m1.sizeRC.rows][m1.sizeRC.cols];
            
            for (int r = 0; r < m1.sizeRC.rows; r++){
        
                for (int c = 0; c < m1.sizeRC.cols; c++){

                    mss[r][c] = Complex.add(m1.arrK[r][c], m2.arrK[r][c]);

                }
        
            }  
            
            return new Matrix(mss);
            
        } else{
        
            return null;
        
        }   
            
    }
    
    
    public static Matrix sub(Matrix m1, Matrix m2){
    
        Complex[][] mss;
        boolean eq;
        
        eq = m1.sizeRC.equals(m2.sizeRC);
        
        if (eq){
        
            mss = new Complex[m1.sizeRC.rows][m1.sizeRC.cols];
            
            for (int r = 0; r < m1.sizeRC.rows; r++){
        
                for (int c = 0; c < m1.sizeRC.cols; c++){

                    mss[r][c] = Complex.sub(m1.arrK[r][c], m2.arrK[r][c]);

                }
        
            }  
            
        } else{
        
            return null;
        
        }   
        
        return new Matrix(mss);
    
    }
    
    
    public Complex getDeterminant(){
        Complex m, p, rslt, d;
        Matrix mt2;
        
        rslt = new Complex(0);
        
        if (sizeRC.rows == 1 && sizeRC.cols == 1){
        
            rslt = arrK[0][0];
        
        }
        
        m = new Complex(0);
        
        if ((sizeRC.rows > 1 && sizeRC.cols > 1) && sizeRC.rows == sizeRC.cols){
        
            for (int c = 0; c < sizeRC.cols; c++){
            
                mt2 = deleteCol(c + 1);
                mt2 = mt2.deleteRow(1);
                
                if ((c + 1) % 2 == 0){
                
                    d = mt2.getDeterminant();
                    p = Complex.mul(arrK[0][c], d);
                    p = Complex.mul(-1, p);
                
                } else{
                
                    d = mt2.getDeterminant();
                    p = Complex.mul(arrK[0][c], d);
                
                }
                m = Complex.add(m, p);
            
            }
            
            rslt = m;
        
        }
        
        if (sizeRC.rows != sizeRC.cols){
        
            rslt = null;
        
        }
        
        return rslt;
    
    
    }
    
    
    public Complex getMinor(int r, int c){
        Matrix m;
        
        m = deleteCol(c);
        m = m.deleteRow(r);
        
        return m.getDeterminant();
    
    }
    
    
    public Matrix getMatrixOfMinors(){
    
        Complex[][] amr;
        Matrix m, mr;
        Complex k;
                
        amr = new Complex[sizeRC.rows][sizeRC.cols];
        
        for (int r = 1; r < sizeRC.rows + 1; r++){
        
                for (int c = 1; c < sizeRC.cols + 1; c++){

                    m = deleteCol(c);
                    m = m.deleteRow(r);
                    k = m.getDeterminant();
                    amr[r - 1][c - 1] = k;

                }
        
            }  
                
        if (sizeRC.cols == sizeRC.rows){
        
            mr = new Matrix(amr);
            return mr;
        
        } else{
        
            return null;
            
        }
    
    }
    
    
    public Complex getAlgebraicComplement(int r, int c){
    
        Complex rslt;
        Matrix m;
        
        m    = deleteCol(c);
        m    = m.deleteRow(r);
        rslt = m.getDeterminant();
        rslt = Complex.mul(Math.pow(-1, (r + c)), rslt);
        
        return rslt;
    
    }
    
    
    public Matrix getMatrixOfAlgebraicComplements(){
    
        Complex[][] amr;
        Matrix m, mr;
        Complex k;
                
        amr = new Complex[sizeRC.rows][sizeRC.cols];
        
        for (int r = 1; r < sizeRC.rows + 1; r++){
        
                for (int c = 1; c < sizeRC.cols + 1; c++){

                    m = deleteCol(c);
                    m = m.deleteRow(r);
                    k = m.getDeterminant();
                    k = Complex.mul(Math.pow(-1, (r + c)), k);
                    amr[r - 1][c - 1] = k;

                }
        
            }  
                
        if (sizeRC.cols == sizeRC.rows){
        
            mr = new Matrix(amr);
            return mr;
        
        } else{
        
            return null;
            
        }
    
    }
    
    
    public Matrix getInversedMatrix(){
    
        Matrix mad, rslt;
        Complex kc, kc1, d;
        String s;
        
        kc1 = new Complex(1);
        d   = getDeterminant();
        s   = d.toString();
        
        if (!s.equals("0")){
    
            mad  = getMatrixOfAlgebraicComplements();
            mad  = mad.getTranspose();
            kc   = Complex.div(kc1, d);
            rslt = Matrix.mul(mad, kc);
            
            return rslt;
    
        } else{
                
            return null;
                
        }
    
    }
    
    
    public Matrix getSolutionOfLinearSystem(){
    
        Matrix mo, mosn, mot, rslt = null;
        Complex kc1, d;
        String s;
        
        kc1 = new Complex(1);
        mosn = deleteCol(sizeRC.cols);
        d = mosn.getDeterminant();
        s = d.toString();
        
        if (!s.equals("0")){
        
            mo   = mosn.getInversedMatrix();
            mot  = getCol(sizeRC.cols);
            rslt = Matrix.mul(mo, mot);
            System.out.println("rslt" + rslt.toString());
        
        }
        
        if (sizeRC.cols - sizeRC.rows != 1){
        
            rslt = null;
            
        }
        
        return rslt;
    
    }
    
    
}
