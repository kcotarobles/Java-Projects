//Karin Cota-Robles 11/05/2015
public class Matrix {
	//class variable
	public int[][] matrixa;
	//first constructor, takes two int parameters, changes number of rows/columns if necessary
	//assigns random values for matrix entries
	public Matrix(int numRows, int numColumns) {
		int rows = (numRows<1) ? 1 : numRows;
		rows = (numRows>5) ? 5 : rows;
		int columns = (numColumns<1) ? 1 : numColumns;
		columns = (numColumns>5) ? 5: columns;
		matrixa = new int[rows][columns];
		for (int i = 0; i<rows; i++)
			for (int j = 0; j<columns;j++)
				matrixa[i][j]=(int)(-11+Math.random()*21);
	}
	//second constructor, takes a 2d array parameter, checks dimensions
	//changes row/column numbers if necessary
	//if number of rows/columns is changed, creates new random entries for matrix
	//otherwise matrix is left alone
	public Matrix(int[][] array) {
		int rows = (array.length<1) ? 1: array.length;
		rows = (array.length>5) ? 5 : array.length;
		int columns = (array[0].length<1) ? 1: array[0].length;
		columns = (array[0].length>5) ? 5 : array[0].length;
		if(rows != array.length || columns != array[0].length) {
			matrixa = new int[rows][columns];
			for (int i = 0; i<rows; i++)
				for (int j = 0; j<columns;j++)
					matrixa[i][j]=(int)(-11+Math.random()*21);
		}
		else {
			int [][] matrixa = array;
		}
		}
	//method getNumOfRows, returns number of rows in matrix
	public int getNumOfRows() {
		return matrixa.length;
	}
	//method getNumOfColumns, returns number of columns in matrix
	public int getNumOfColumns() {
		return matrixa[0].length;
	}
	//methods from HW4 with slight changes
	public int [] rowMax() {
		int [] maxes = new int[getNumOfRows()];
		for (int i=0;i<getNumOfRows();i++)
			for (int j=0;j<getNumOfColumns();j++) {
				if(matrixa[i][j]>maxes[i])
					maxes[i] = matrixa[i][j];
			}
		return maxes;
	}
	public int[] columnSum() {
		int[] sums = new int[getNumOfColumns()];
		for (int i=0;i<getNumOfColumns();i++){
			for (int j=0;j<getNumOfRows();j++){
				sums[i]+=matrixa[j][i];
			}
		}
		return sums;
	}
	public void transpose() {
		int a=getNumOfRows();
		int b=getNumOfColumns();
		int [][] matrix2 = new int[b][a];
		for (int i=0;i<a;i++){
			for (int j=0; j<b;j++) {
				matrix2[j][i]=matrixa[i][j];
			}
		}
		matrixa = matrix2;
	}
	//toString() method, turns matrix into a string with spaces and line breaks
	public String toString() {
		String matrixstring = "";
		for (int i=0;i<matrixa.length; i++) {
			for (int j=0;j<matrixa[0].length;j++) {
				matrixstring += matrixa[i][j];
				matrixstring += " ";
			}
			matrixstring += "\n";
			}
		return matrixstring;
	}
	//add method, returns boolean for whether the Matrix and the parameter are defined under matrix addition, 
	//if true, adds the parameter to the matrix
	public boolean add(Matrix array) {
		boolean addable;
		addable = (getNumOfRows() == array.getNumOfRows() && getNumOfColumns() == array.getNumOfColumns()) ? true : false;
		if (addable) {
			for(int i =0;i<getNumOfRows();i++){
				for(int j = 0; j<getNumOfColumns();j++){
					matrixa[i][j] += array.matrixa[i][j];
				}
			}
		}
		return addable;
	}
	//multiply method, takes int parameter, multiplies all entries of matrix by the integer 
	public void multiply(int c) {
		for(int i =0;i<getNumOfRows();i++){
			for(int j = 0; j<getNumOfColumns();j++){
				matrixa[i][j] = matrixa[i][j] * c;
			}
		}
	}
	//problem2 getMax method, returns the maximum value in the matrix
	public int getMax() {
		int max = matrixa[0][0];
		for(int i = 0; i<getNumOfRows();i++) {
			for(int j = 0; j<getNumOfColumns();j++)
				max = (matrixa[i][j]>max) ? matrixa[i][j] : max;
		}
		return max;
	}
}
