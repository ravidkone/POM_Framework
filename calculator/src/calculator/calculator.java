package calculator;

import java.util.Scanner;

public class calculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		boolean bRes_Flag=true;
		while(bRes_Flag) {
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine(); 
        String[] sCalValues = name.split(",");
       double toPrint=calculate(sCalValues[0],sCalValues[1],sCalValues[2]);
       System.out.println("Sri Created server and printing result you.."+toPrint);
		}
	}

	private static double calculate(String val_1, String val_2, String calType) {
		double result = 0;
				switch (calType) {
				case "a":
					result= Integer.parseInt(val_1)+Integer.parseInt(val_2);
					break;
				case "s":
					result= Integer.parseInt(val_2)-Integer.parseInt(val_1);
					break;
				case "m":
					result= Integer.parseInt(val_2)*Integer.parseInt(val_1);
					break;
				case "d":
					if(Integer.parseInt(val_2)>Integer.parseInt(val_1))
						result= Integer.parseInt(val_2)/Integer.parseInt(val_1);
					else
						result= Integer.parseInt(val_1)/Integer.parseInt(val_2);
					break;
					
				default:
					System.out.println("Give valid calculation type");
					break;
				}
		return result;
	}

	
}
