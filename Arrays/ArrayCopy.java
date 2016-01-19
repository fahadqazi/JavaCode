import java.util.Arrays;

public class ArrayCopy{
	public static int[] copy(int[] array){
		int[] newArr = new int[array.length];

		for(int i=0; i<array.length; i++){
			newArr[i] = array[i];
		}
		return newArr;
	}

	public static int[] reverseCopy(int[] array){
		int[] newArr = new int[array.length];

		for(int i=0; i<array.length; i++){
			
				newArr[i] = array[array.length-1-i];
			
		}
		return newArr;
	}


	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		int[] copied = copy(nums);
		int[] reverse = reverseCopy(nums);

		System.out.println("Original: " + Arrays.toString(nums));
		System.out.println("Copied: " + Arrays.toString(copied));
		System.out.println("Reversed: " + Arrays.toString(reverse));
		
	}


}