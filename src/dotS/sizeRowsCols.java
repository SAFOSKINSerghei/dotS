package dotS;

public class sizeRowsCols {
    
    public int rows, cols;
    
    @Override
    public String toString(){
    
        return "Rows = " + String.valueOf(rows) + " Columns = " + String.valueOf(cols);
    
    }
    
    
    public boolean equals(sizeRowsCols sRC2){
        
        return cols == sRC2.cols && rows == sRC2.rows;        
    
    }
    
    
    public sizeRowsCols(int r, int c){
        
        rows = r;
        cols = c;
    
    }
    
    
    public sizeRowsCols(int s){
        
        rows = s;
        cols = s;
    
    }
    
}
