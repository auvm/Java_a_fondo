package libro.cap01;

import java.util.Scanner;

public class DemoSwitch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el número de la semana: ");
		int number = scanner.nextInt();
		
		String day;
		switch(number) {
		case 1:
			day = "Domingo";
			break;
		case 2:
			day = "Lunes";
			break;
		case 3:
			day = "Martes";
			break;
		case 4:
			day = "Miércoles";
			break;
		case 5:
			day = "Jueves";
			break;
		case 6:
			day = "Viernes";
			break;
		case 7:
			day = "Sábado";
			break;
		default:
			day = "Error: Solo se adminten números del 1 al 7.";
			break;
		}
		
		System.out.println(day);
	}

}
