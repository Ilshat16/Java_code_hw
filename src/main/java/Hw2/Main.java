package Hw2;

public class Main {
	public static void main(String[] args) {
		int[] numbersArray = {11, 24, 4, 6, 7, 22, 37, 11, 0, 0};
		System.out.println(countEvents(numbersArray));
		System.out.println(diffMinMax(numbersArray));
		System.out.println(findZeroNeighbors(numbersArray));
	}
	
	public static int countEvents(int[] numbersArray) {
		int count = 0;
		
		for (int i = 0; i < numbersArray.length; i++) {
			if(isEven(numbersArray[i]))
				count++;
		}
		return count;
	}
	
	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
	
	public static int diffMinMax(int[] numbersArray) {
		int minimum = 99999;
		int maximum = 0;
		
		for(int number : numbersArray) {
			if (number < minimum)
				minimum = number;
			if (number > maximum)
				maximum = number;
		}
		return maximum - minimum;
	}
	
	public static boolean findZeroNeighbors(int[] numbersArray) {
		boolean hasZeroNeighbor = false;
		int i = 0;
		while(!hasZeroNeighbor && i < numbersArray.length - 1) {
			if(numbersArray[i] == 0) {
				if(numbersArray[i + 1] == 0)
					hasZeroNeighbor = true;
			}
			i++;
		}
		return hasZeroNeighbor;
	}

}

