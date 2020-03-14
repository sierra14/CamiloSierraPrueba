/**
 * 
 */
package com.camilosierra.main;

import java.util.Scanner;

/**
 * @author GreenSQA
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	        
	       while(!salir){
	            
	           System.out.println("1. Ejecutar casos");
	           System.out.println("2. Salir");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();
	            
	           switch(opcion){
	               case 1:
	            	   System.out.println("Has seleccionado la opcion 1");
	                   break;
	               case 2:
	                   System.out.println("Has seleccionado la opcion 2");
	                   break;
	                default:
	                   System.out.println("Solo números entre 1 y 4");
	           }
	            
	       }
	}

}
