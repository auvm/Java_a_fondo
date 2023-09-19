package libro.cap01;

import java.util.Scanner;

public class DemoConstantes {
	
	/*Las constantes se definen con el modificador "final"
	 * normalmente se hacen publicas y estáticas.*/
	
	public static final int DOMINGO = 1;
	public static final int LUNES = 2;
	public static final int	MARTES = 3;
	public static final int MIERCOLES = 4;
	public static final int JUEVES = 5;
	public static final int VIERNES = 6;
	public static final int SABADO = 7;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingresa el día de la semana: ");
		int v = scanner.nextInt();
		
		String dia;
		switch(v){
		case LUNES:
			dia = "Lunes";
			break;
		case MARTES:
			dia = "Martes";
			break;
		case MIERCOLES:
			dia = "Miércoles";
			break;
		case JUEVES:
			dia = "Jueves";
			break;
		case VIERNES:
			dia = "Viernes";
			break;
		case SABADO:
			dia = "Sábado";
			break;
		case DOMINGO:
			dia = "Domingo";
			break;
		default:
			dia = "Error: día incorrecto, solo se admiten números del 1 al 7.";
			break;
		}
		
		System.out.println(dia);
	}

}
