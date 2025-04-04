public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();

	}

	public static void q1() {
		//Write question 1 code here

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


	public static void q2() {
		//Write question 2 code here
	}

	public static int sumRow(int[][] array, int row){
		int sum = 0;
		if (row >= 0 && row < array.length){
			for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
		}
		else{
			return 0;
		}
		return sum;
	}
}

	public static void q3() {
		//Write question 3 code here
	}

	public static int sumColumn(int[][] array, int column){
		int total = 0;
		for (int c = 0; c< array.length; c++){
			total+= array[c][column];
		}
		return total;
	}


}
