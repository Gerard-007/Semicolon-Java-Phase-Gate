import java.util.Arrays;


public class SortSquaredArray {
	public static void main(String[] args) {
		int[] array = {5, 3, 4};
		sortSquaredArray(array);
		//System.out.println("Squared list: " + Arrays.toString(sortSquaredArray(array)));
	}


	public static void sortSquaredArray(int[] array) {
		int lower = array[0] * array[0];
		int[] result = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0 && lower > (array[i] * array[i])) {
				lower = array[i] * array[i];
				array[i] = 0;
			}
			//System.out.println(array[i]);
		}
		//Arrays.sort(result);
		//return result;
		System.out.println(lower);
	}
}