package numbers;

import java.util.ArrayList;
import java.util.List;

public class HexadecimalConverter {

	public static void main(String[] args) {
		int number = 91, input = number;
		int value = 0;
		List<String> hexValue = new ArrayList<String>();
		while (number != 0) {
			value = number % 16;
			switch (value) {
				case 10:
					hexValue.add("A");
					break;
				case 11:
					hexValue.add("B");
					break;
				case 12:
					hexValue.add("C");
					break;
				case 13:
					hexValue.add("D");
					break;
				case 14:
					hexValue.add("E");
					break;
				case 15:
					hexValue.add("F");
					break;
				default:
					hexValue.add(value+"");
					break;
			}
			number /= 16;
		}
		System.out.println("Decimal : " + input + "\n Hex : ");
		for(int i = hexValue.size() -1 ; i>=0 ; i--) {
			System.out.print(hexValue.get(i));
		}
		
		System.out.println("\nUsing inbuilt Hex : " + Integer.toHexString(input) );
	}

}
