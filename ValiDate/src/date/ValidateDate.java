package date;

import java.util.Scanner;

public class ValidateDate {
	public static void main(String[] args) {
		int day;
		int month;
		int year;
	
		Scanner read = new Scanner(System.in);
		
		System.out.print("Digite o dia: ");
		day = read.nextInt();
		System.out.print("Digite o mes: ");
		month = read.nextInt();
		System.out.print("Digite o ano: ");
		year = read.nextInt();
		
		if(month >= 1 && month <= 12) {
		// valid date
			if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			// months with 31 days
				if(day >= 1 && day <= 31) {
					System.out.println("Data valida. A data digitada foi: " + day + "/" + month + "/" + year);
				} else {
					// Invalid date
					System.out.println("Data invalida.");
				}
			} else if(month == 4 || month == 6 || month == 9 || month == 11) {
				if(day >=1 && day <= 30) {
					System.out.println("Data valida. A data digitada foi: " + day + "/" + month + "/" + year);
				} else {
					// Invalid date
					System.out.println("Data invalida.");
				}
			} else if (month == 2) {
				// check if it ir a leap year
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
					// leap year
					if(day >= 1 && day <= 29) {
						System.out.println("Data valida. A data digitada foi: " + day + "/" + month + "/" + year);
					} else {
						// Invalid date
						System.out.println("Data invalida.");
					}
				} else if(day >= 1 && day <= 28) {
					System.out.println("Data valida. A data digitada foi: " + day + "/" + month + "/" + year);
				} else {
					// Invalid date
					System.out.println("Data invalida.");
				}
			}
		} else {
			// invalid month
			System.out.println("Data invalida");
		}
	}
}