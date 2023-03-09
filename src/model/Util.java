package model;

import java.util.Scanner;

public class Util {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int edad;
		int curso;
		double peso;
		String escribir;
		String texto;
		String texto2;
		String caracter;
		float nota;
		byte nota2;

		edad = leerInt("Escribe tu edad: ");
		curso = leerInt("¿Cuál es tu curso?: ");
		peso = leerdouble("¿Cuánto pesas?: ");
		escribir = leerString("Escribir lo que quieras: ");
		nota = leerfloat("¿Cuál es su nota media?");
		nota2 = leerbyte("¿Cuál es tu nota de mates(Sin decimales)?");

		System.out.println("Tienes " + edad + " años.");
		System.out.println("Cursas el " + curso + " año.");
		System.out.println("Pesas " + peso + " kilos.");
		System.out.println("El mensaje que has escrito es: " + escribir);
		System.out.println("Su nota media es de: " + nota);
		System.out.println("Su nota en mates es: " + nota2);
		System.out.println(fibonacci(8));
	}

	public static String leerCadena(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;
		escribir(pregunta);
		respuesta = teclado.nextLine();
		return respuesta;
	}
	
//Sucesión de fibonacci
	
	public static int fibonacci (int n) {
		int r;
		
		if (n < 2) {
			r = n;
		} else {
			r = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return r;
	}
	
//Factorial of a number
	public static int factorial(int n) {
		int r;
		if (n == 1) {
			r = 1;
		} else {
			r = n * factorial (n-1);
		}
		return r;
	}
//Util.subrayar("Hello", "*" );
	public static void subrayar(String texto2, String caracter) {
		System.out.println(texto2);
		for (int i = 1; i <= texto2.length(); i++) {
			System.out.print(caracter);

		}
		System.out.println("");
	}

	public static void escribir(String texto) {
		System.out.println(texto);

	}

	public static int leerInt(String pregunta) {

		int respuesta;
		Scanner teclado = new Scanner(System.in);

		System.out.print(pregunta);

		respuesta = Integer.parseInt(teclado.nextLine());

		return respuesta;

	}

	public static double leerdouble(String pregunta) {

		double respuesta;
		Scanner teclado = new Scanner(System.in);

		System.out.print(pregunta);

		respuesta = Double.parseDouble(teclado.nextLine());

		return respuesta;
	}

	public static String leerString(String escribir) {

		String respuesta;
		Scanner teclado = new Scanner(System.in);

		System.out.print(escribir);

		respuesta = teclado.nextLine();

		return respuesta;

	}

	public static float leerfloat(String nota) {

		float respuesta;
		Scanner teclado = new Scanner(System.in);

		System.out.print(nota);

		respuesta = Float.parseFloat(teclado.nextLine());

		return respuesta;

	}

	public static byte leerbyte(String nota2) {

		byte respuesta;
		Scanner teclado = new Scanner(System.in);

		System.out.print(nota2);

		respuesta = Byte.parseByte(teclado.nextLine());

		return respuesta;

	}

}

// PARA SABER CUANTO TIEMPO TARDA MI PROGRAMA EN EL FUNCIONAMIENTO


//  long time_start, time_end;
//  time_start = System.currentTimeMillis();


//ejecutamos la tarea



//  time_end = System.currentTimeMillis();
//  System.out.println("Tiempo: "+ (time_end - time_start) +" milisegundos");


