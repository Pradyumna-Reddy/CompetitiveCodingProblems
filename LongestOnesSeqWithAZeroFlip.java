import java.util.ArrayList;
public class LongestOnesSeqWithAZeroFlip {
	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 1, 1, 0, 1, 0, 1, 1};
		// int[] arr = { 0, 1, 1 };
		// int[] arr = { 0, 1, 0, 0, 1, 1 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		int ones = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				ones++;
				if(i == arr.length-1) {
					list.add(ones);
				}
			} else {
				if(ones > 0) {
					list.add(ones);
				}
				list.add(arr[i]);
				ones = 0;
			}
		}

		System.out.println(list);

		int maxseq = 0;
		int sum = 0;
		for (int i = 0; i<list.size(); i++) {
			sum = list.get(i); 
			if(i + 1 < list.size()) {
				sum	+= list.get(i+1);
			}
			if(i + 2 < list.size()) {
				sum += list.get(i+2);
			}
			if(sum > maxseq) {
				maxseq = sum;
			}
		}
		maxseq = maxseq + 1;
		System.out.println("Max 1s Seq with one zero flip: "+ maxseq);
	}
}