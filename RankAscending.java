import java.util.Arrays;

public class RankAscending {
	public static void main(String[] args) {
		int[] arr = {5, 4, 8, 11, 2};
		int[] rank = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.println("i :" + arr[i] + " j :" + arr[j]);
				if (arr[i] > arr[j]) {
					rank[i]++;
				} else {
					rank[j]++;
				}
			}
		}
		
		System.out.println(Arrays.toString(rank));
	}
}
