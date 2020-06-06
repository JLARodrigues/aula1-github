package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo;


public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do tri�ngulo A: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do tri�ngulo B: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaA = x.area();
		double areaB = y.area();
		
		System.out.println("A �rea do tri�ngulo A �: " + areaA);
		System.out.println("A �rea do tri�ngulo B �: " + areaB);
				
		
		if (areaA > areaB) {
			
			System.out.println("A maior �rea � a do tri�ngulo A");
		}
		else {
			
			System.out.println("A maior �rea � a do tri�ngulo B");
		}
		
		sc.close();
		
		

	}

}
