import java.util.Scanner;

public class Prg2 {
	public static void main(String args[]) {

		int num[] = { 2, 3, 4, 5 };

		int max[] = { 2, 4 };

		int result[] = new int[num.length];

		for (int i = 0; i < num.length; i++) {
			boolean flag = false;
			for (int j = 0; j < max.length; j++) {
				if (num[i] <= max[j]) { 
flag = true;
					break;
				}
			}
			if (flag) {
				result[i] = num[i];
			}
		}

		for (int j = 0; j < result.length; j++) {
			System.out.print((result[j] != 0 ? result[j] : " ") + "\t");
		}
	}
} 