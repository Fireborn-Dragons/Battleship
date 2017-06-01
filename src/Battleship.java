import java.util.Scanner;

public class Battleship {

	public static boolean checkplacement(int row, int column, String direction, String[][] board) {
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]board = new String[5][5];
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Where do you want to put your destroyer?");
		int row = myScanner.nextInt();
		int column = myScanner.nextInt();
		System.out.println("Which direction do you want to put it?");
		String direction = myScanner.nextLine();
			
		
	}

}
