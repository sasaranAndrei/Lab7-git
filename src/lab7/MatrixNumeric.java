package lab7;

public class MatrixNumeric {

    private Integer rows;
    private Integer cols;
    private Numeric[][] matrix;

    public MatrixNumeric(Integer rows, Integer cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new Numeric[rows][cols];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public Numeric[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(Numeric[][] matrix) {
        this.matrix = matrix;
    }
/*
    public boolean multiplyMatrix (MatrixNumeric matrix) {
        if (this.cols != matrix.rows){
            return false;
        }
        this.cols = matrix.cols;

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                Numeric sum;
                for (int k = 0; k < cols; k++){

                }
            }
        }
        return false;

    }
    */

    public Boolean addElement (Numeric newElement, int row, int col){
        if (row >= this.rows){
            return false;
        }
        if (col >= this.cols){
            return false;
        }
        this.getMatrix()[row][col] = newElement;
        return true;
    }

    public String toString (){
        String s = new String();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                s = s + matrix[i][j];
                s = s + " ";
            }
            s = s + "\n";
        }
        return s;
    }


}
