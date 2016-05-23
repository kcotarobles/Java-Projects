//Karin Cota-Robles 11/05/2015
public class TestMatrix {
	public static void main(String[] args) {
		//test dimensions of matrices
		Matrix Matrix1 = new Matrix(3,4);
		Matrix Matrix2 = new Matrix(0,4);
		Matrix Matrix3 = new Matrix(6,3);
		Matrix Matrix4 = new Matrix(3,0);
		Matrix Matrix5 = new Matrix(4,6);
		System.out.println("Matrix1 Rows: " + Matrix1.getNumOfRows());
		System.out.println("Matrix1 Columns: " + Matrix1.getNumOfColumns());
		System.out.println("Matrix2 Rows: " + Matrix2.getNumOfRows());
		System.out.println("Matrix2 Columns: " + Matrix2.getNumOfColumns());
		System.out.println("Matrix3 Rows: " + Matrix3.getNumOfRows());
		System.out.println("Matrix3 Columns: " + Matrix3.getNumOfColumns());
		System.out.println("Matrix4 Rows: " + Matrix4.getNumOfRows());
		System.out.println("Matrix4 Columns: " + Matrix4.getNumOfColumns());
		System.out.println("Matrix5 Rows: " + Matrix5.getNumOfRows());
		System.out.println("Matrix5 Columns: " + Matrix5.getNumOfColumns());
		
		//test row max and column sum methods
		Matrix test = new Matrix(4,5);
		System.out.println(test.toString());
		System.out.println("row max: ");
		for(int k=0;k<test.rowMax().length;k++) {
			System.out.printf("%3d ",test.rowMax()[k]);
		}
		System.out.println("\n column sum: ");
		for(int k=0;k<test.columnSum().length;k++) {
			System.out.printf("%3d ", test.columnSum()[k]);
		}
		//test transpose method
		test.transpose();
		System.out.println(" \n transposed: \n" + test);
		
		//test add method
		Matrix test1 = new Matrix(3,4);
		Matrix test2 = new Matrix(3,4);
		System.out.println("1st: \n" + test1.toString() + "2nd: \n" + test2.toString());
		test1.add(test2);
		System.out.println("added: \n"+ test1.toString());
		
		//test add method for matrices which are not defined under matrix addition
		Matrix test3 = new Matrix(3,4);
		Matrix test4 = new Matrix(3,5);
		System.out.println("1st: \n" + test3.toString() + "2nd: \n" + test4.toString());
		test3.add(test4);
		System.out.println("addable: " + test3.add(test4));
		System.out.println("1st: \n" + test3.toString() + "2nd: \n" + test4.toString());
		
		//test multiply method for positive, negative, and zero parameters
		Matrix test5 = new Matrix(3,4);
		System.out.println("original: \n"+ test5.toString());
		test5.multiply(5);
		System.out.println("times 5: \n"+ test5.toString());
		test5.multiply(-2);
		System.out.println("times -2: \n"+ test5.toString());
		test5.multiply(0);
		System.out.println("times 0: \n"+ test5.toString());
		
		}
}
