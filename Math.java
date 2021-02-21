package com.edrol.fun;

import java.util.Scanner;

public class Math {                                                                                                                                                                                                        
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);                                                                                                                                                                                                                                                                                 
		for (int i = 0; i >= 0; i++) {
			System.err.print("Введите количество месяцев: ");
			int a = input.nextInt();
			int b = a % 12;
			System.out.println("Количество лет: " + a / 12);
			if (a > 0)
				System.out.println("Сезон: " + Season(b));
			else {
				b = (13 + b) % 12;
				System.out.println("Сезон: " + Season(b));
			}
				System.out.println("Месяц: " + Month(b) + "\n");                                                                                                                                                                                  
		}
	}                                                                                                                                                     

	public static String Season(int c) {
		if (c >= 3 && c < 6)                                                                                                                                                      
			return "Весна";                                                                                                                                                                                     
		else if (c >= 6 && c < 9)                                                                                                                                                  
				return "Лето";                                                                                                                                                 
			else if (c >= 9 && c < 12)                                                                                                                                                   
					return "Осень";                                                                                                                                                    
				else                                                                                                                                                
					return "Зима";
	}

	public static String Month(int d) {
		if (d == 1)
			return "Январь";
		else if (d == 2)
				return "Февраль";
			else if (d == 3)
					return "Март";
				else if (d == 4)
						return "Апрель";
					else if (d == 5)
							return "Май";
						else if (d == 6)
								return "Июнь";
							else if (d == 7)
									return "Июль";
								else if (d == 8)
										return "Август";
									else if (d == 9)
											return "Сентябрь";
										else if (d == 10)
												return "Октябрь";
											else if (d == 11)
													return "Ноябрь";
												else
													return "Декабрь";
	}                                                                                                                                                                                                 
}
