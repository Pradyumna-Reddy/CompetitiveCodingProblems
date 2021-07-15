// my version. I hope it's not the best
public class Spiral2DMat {
	public static void main(String[] args) {
		int row_r = 0;
		int col_d = 2;
		int row_l = 2;
		int col_u = 0;

		int[][] arr = { {1, 2, 3 }, {4, 5, 6}, {7, 8, 9} };
		int r = 0, d = 1, l = 2, u = 3;
		int dir = r;

		int row = 0, col = 0;

		while( row_r<=row_l || col_d>=col_u) {
			if(dir == r) {
				if(col <= col_d) {
					System.out.print(arr[row][col]+" ");
					col++;
				} else {
					row_r++;
					dir = d; 
					col--;
					row++;
				}
			}
			else if(dir == d) {
				if(row <= row_l) {
					System.out.print(arr[row][col]+" ");
					row++;
				} else {
					col_d--;
					dir = l;
					row--;
					col--;
				}
			}
			else if(dir == l) {
				if(col >= col_u) {
					System.out.print(arr[row][col]+" ");
					col--;
				} else {
					row_l--;
					dir = u;
					col++;
					row--;
				}
			}
			else if(dir == u) {
				if(row >= row_r) {
					System.out.print(arr[row][col]+" ");
					row--;
				} else {
					col_u++;
					dir = r;
					row++;
					col++;
				}	
			}
		}


	}
}