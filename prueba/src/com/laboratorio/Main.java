package com.laboratorio;

import java.util.Scanner;


public class Main {
	
	/* Declaracion de variables globales - Objeto global Scanner */
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		/* Declaracion de variables	*/
		int a;
		
		/*Intanciacion de un objeto*/
		Bicicleta mountain_bike = new Bicicleta(2, 1, "Mountain Bike");
		System.out.println(mountain_bike);
		
		
		
		/* -------------------------------------------------------------------
		 * Atajos de teclado:
		 * 
		 * CTRL + ESPACIO ----> Menu de seleccion autocompletado
		 * CTRL + D       ----> Borro Linea
		 * CTRL + F 	  ----> Busqueda por palabra/letra clave
		 * CTRL + S 	  ----> Guardado de clase
		 * CTRL + SHIFT + S --> Guardado de Todo.
		 * CTRL + M 	  ----> Ocultar barras y menus laterales/inferiores
		 * -------------------------------------------------------------------
		 * */
		
		/*
		 * Lineas de comandos mayormente utilizados:
		 * System.out.println("") ------> Salida a pantalla ------ abrevio sysout
		 * Object object = new Object() -----> Hacemos referencia a los objetos 
		 *									   mediante el nombre de la clase, nombre 
		 *									   a la variable igual a NEW(palabra clave 
		 *									   para instanciar) Objeto (datos del objeto en caso de tener);
		 * 
		 * */
		
		
		System.out.println("Ingresa un numero:");
		a = scanner.nextInt();
		/* En java hacemos referencia del objeto Scanner para poder atrapar los datos sean tipo:
		 * String
		 * Enteros
		 * Decimales
		 * Y poder manipular los datos que se van ingresando a medida que lo solicitemos/necesitemos.
		 * */

		System.out.println("El resultado es:  " + a);
		scanner.close();
		
	}

}
