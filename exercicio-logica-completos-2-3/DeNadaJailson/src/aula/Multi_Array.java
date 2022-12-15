package aula;

public class Multi_Array {

	public static void main(String[] args) {
		
		int[][] myNumbers = {{1, 2, 3}, {4, 5, 6}};

//		myNumbers[1][2] = 9;
		myNumbers[0][0] = 6;
		myNumbers[0][1] = 5;
		myNumbers[0][2] = 4;
		myNumbers[1][0] = 3;
		myNumbers[1][1] = 2;
		myNumbers[1][2] = 1;
		
		for (byte i = 0; i < myNumbers.length; i++) {
			for (byte j = 0; j < myNumbers[i].length; j++) {
				System.out.println(myNumbers[i][j]);
			}
		}
	}

}
