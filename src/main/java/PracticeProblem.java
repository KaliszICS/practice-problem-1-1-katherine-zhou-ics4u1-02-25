
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] array){
		int sum = 0;
		for (int row = 0; row < array.length; row++){
			for (int col = 0; col< array[row].length; col++){
				sum += array[row][col];
			}
		}
		return sum;

	}


	public static int sumRow(int[][] array, int row){
		int sum = 0;
		if (row >= 0 && row < array.length){
			for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
		}
		} 
		else{
			return 0;
		}
		return sum;
	}



	public static int sumColumn(int[][] array, int column){
		int total = 0;
		for (int row = 0; row < array.length; row++){
			for (int col = 0; col< array[row].length; col++){
				if (col == column){
					total += array[row][col];
				}
			}
		}
		
		return total;
	}


}

