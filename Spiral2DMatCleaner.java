// my version. I hope it's not the best
public class Spiral2DMatCleaner {
	public static void main(String[] args) {

		int[][] arr = { {1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
		
		spiralListOfArray(arr);
	}

	public static void spiralListOfArray(int[][] arr) {
		int first_row = 0;
		int last_col = arr[0].length-1;
		int last_row = arr.length-1;
		int first_col = 0;

		while( first_row <= last_row && first_col <= last_col) {
			int i;

			for(i=first_col;i<=last_col;i++) {
				System.out.print(arr[first_row][i]+" ");
			}

			for(i=first_row+1;i<=last_row;i++) {
				System.out.print(arr[i][last_col]+" ");
			}

			for(i=last_col-1;i>=first_col;i--) {
				System.out.print(arr[last_row][i]+" ");
			}

			for (i=last_row-1;i > first_row; i--) {
				System.out.print(arr[i][first_col]+" ");
			}

			first_row++;
			last_col--;
			last_row--;
			first_col++;
		}
	}
}