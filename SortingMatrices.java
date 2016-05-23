//Karin Cota-Robles 11/05/2015
public class SortingMatrices {

	public static void main(String[] args) {
		//array of 5 matrices
		Matrix [] array = new Matrix[5];
		//create random dimensions for each matrix in array
		for(int i=0; i<5; i++) {
			int a = (int) (1+Math.random()*5);
			int b = (int) (1+Math.random()*5);
			array[i] = new Matrix(a,b);
		}
		//print each matrix using toString method
		for(int i = 0; i<5; i++) {
			System.out.println(array[i].toString());
		}
		//sort the matrices
		selectionSort(array);
		//print each matrix in the new sorted order
		System.out.println("sorted: ");
		for(int i = 0; i<5; i++) {
			System.out.println(array[i].toString());
		}
		
	}
	//method to sort matrices by their maximum value
	//eg. largest max, second largest max, ..., minimum max
	public static void selectionSort(Matrix[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			Matrix currentMax = list[i];
			int currentMaxIndex = i;
			for (int j = i + 1; j < list.length; j++) {
				if (currentMax.getMax() < list[j].getMax()) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}


}
