import java.util.Scanner;

public class A {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//sum of the squares
		int naturalNum = 1;
		int squareOne = 0;
		int storageSq = 0;
		int firstSum = 0;

		while (naturalNum <= 100) {
			squareOne = naturalNum * naturalNum;
			firstSum = storageSq + squareOne;
			storageSq = squareOne;
			naturalNum ++;
		}

		//square of the sum
		naturalNum = 1;
		int storeNum = 0;
		int storageSum = 0;
		
		while (naturalNum <= 100) {
			storageSum = storeNum + naturalNum;
			storeNum = naturalNum;
			naturalNum ++;
		}
		int totalSq = storeNum * storeNum;

		//difference!
		System.out.println(storageSq - totalSq);


	}
}
