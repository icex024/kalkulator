package kalkulator;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		String komanda="";
		do {
			komanda = scr.nextLine();
			if (komanda.isEmpty()) {
				continue;
			}
			
			String[] kom=komanda.split(" ");
			int x=Integer.parseInt(kom[0]);
			int y=Integer.parseInt(kom[2]);
			int z=0;
			switch (kom[1]) {
			case "+":
				z=addition(x,y);
				break;
			default:
				System.out.println("Operand nije podrzan");
				continue;
			}
			System.out.println("Rezultat "+z);
			if (kom.length!=3) {
				continue;
			}
		}while(!komanda.equals("End"));
		scr.close();
	}
	public static int addition(int a,int b) {
		return a+b;
	}

}
