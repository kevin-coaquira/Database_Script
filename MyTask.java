package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask {
	
	public static void liniesBlanc(int salts) {
		for (int i=0;i<salts;i++) {
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		
		//////////////////////////////////////////////////
		Llibre llibre1 = new Llibre ("1234","Don Quijote de la Mancha","Miguel de Cervantes","Percebe",10,10);
		Llibre llibre2 = new Llibre ("5678","La Colmena","Camilo José Cela","Anchoa",1,1);
		Llibre llibre3 = new Llibre ("2345","Poesias Completas", "Antonio Machado3","Teclat",3,3);
		Llibre llibre4 = new Llibre ("7890","Harry Potter","JK Rowling","Ratoli",2,2);
		Persona usuari1 = new Persona ("Miquel","Hernandez","4Z","12345678");
		Persona usuari2 = new Persona ("Javier","Maroto","2A","asdfghjk");
		Persona usuari3 = new Persona ("Antonio","Gonzalez","6F","qwertyui");
		Persona usuari4 = new Persona ("Pablo","Perez","1M","87654321");
		//////////////////////////////////////////////////
		
		Biblioteca biblioteca = new Biblioteca("Francesc de Borja Moll",null,null,null,null);
		
		//////////////////////////////////////////////////
		Llibre.afegirLlibre(biblioteca.getLlistaLlibres(), llibre1);
		Llibre.afegirLlibre(biblioteca.getLlistaLlibres(), llibre2);
		Llibre.afegirLlibre(biblioteca.getLlistaLlibres(), llibre3);
		Llibre.afegirLlibre(biblioteca.getLlistaLlibres(), llibre4);
		//////////////////////////////////////////////////
		Persona.afegirPersona(biblioteca.getLlistaUsuaris(), usuari1);
		Persona.afegirPersona(biblioteca.getLlistaUsuaris(), usuari2);
		Persona.afegirPersona(biblioteca.getLlistaUsuaris(), usuari3);
		Persona.afegirPersona(biblioteca.getLlistaUsuaris(), usuari4);
		
		
		//////////////////////////////////////////////////
		
		boolean exit = false;
		while (!exit) {
			liniesBlanc(10);
			System.out.println("Bienvenidos a la Biblioteca "+biblioteca.getNom());
			liniesBlanc(1);
			System.out.println("1. Gestion de libros");
			System.out.println("2. Gestion de reservas");
			System.out.println("3. Gestion de usuarios");
			System.out.println("4. Gestion de administradores");
			System.out.println("5. Salir del programa");
			
			String opcio;
			opcio=teclat.nextLine();
			
			boolean enrere=false;
			while(!enrere) {
				switch(opcio) {
				case "1":
					liniesBlanc(10);
					System.out.println("Menu");
					System.out.println(" >Gestion de libros");
					System.out.println("1. Ver lista de libros");
					System.out.println("2. Ver lista de libros disponibles");
					System.out.println("3. Agregar un libro");
					System.out.println("4. Eliminar un llibro");
					System.out.println("5. Volver atras");
					System.out.println("6. Salir del programa");
					
					String opcio2;
					opcio2=teclat.nextLine();
					liniesBlanc(10);
					
					switch(opcio2) {
					case "1":
						System.out.println("Lista de libros de la Biblioteca "+biblioteca.getNom());
						liniesBlanc(1);
						biblioteca.mostrarLlibres();
						System.out.println("Total de libros: "+biblioteca.getLlistaLlibres().size());
						liniesBlanc(1);
						System.out.println("Aprieta enter para continuar");
						teclat.nextLine();
						break;
						
					case "2":
						System.out.println("Lista de libros disponibles de la Biblioteca "+biblioteca.getNom());
						liniesBlanc(1);
						biblioteca.mostrarLlibresDisponibles();

						break;
					
					case "3":
						Llibre.afegirLlibre(biblioteca.getLlistaLlibres());
						break;
						
					case "4":
						System.out.println("Introduce los datos del libro que quieras eliminar:");
						Llibre.eliminarLlibre(biblioteca.getLlistaLlibres(), biblioteca.getLlistaReserva());
						System.out.println("Pulsa enter para continuar");
						teclat.nextLine();
						break;
						
					case "5":
						enrere=true;
						break;
					case "6":
						enrere=true;
						exit=true;
						break;
					}
					break;
				case "2":
					liniesBlanc(10);
					System.out.println("Menu");
					System.out.println(" >Gestion de reservas");
					System.out.println("1. Ver lista de Reservas");
					System.out.println("2. Añadir una reserva");
					System.out.println("3. Eliminar una Reserva");
					System.out.println("4. Volver atrasa");
					System.out.println("5. Salir del programa");
					
					String opcio3;
					opcio3=teclat.nextLine();
					liniesBlanc(10);
					
					switch(opcio3) {
					case "1":
						System.out.println("Lista de reservas de la Biblioteca "+biblioteca.getNom());
						liniesBlanc(1);
						biblioteca.mostrarReserves();
						System.out.println("Total de reservas: "+biblioteca.getLlistaReserva().size());
						liniesBlanc(1);
						System.out.println("Pulsa  enter para continuar");
						teclat.nextLine();
						break;
						
					case "2":
						System.out.println("Hacer una reserva de la Biblioteca "+biblioteca.getNom());
						liniesBlanc(1);
						Reserva.afegirReserva(biblioteca.getLlistaReserva(), biblioteca.getLlistaLlibres(), biblioteca.getLlistaUsuaris());
						liniesBlanc(1);
						System.out.println("Pulsa enter para continuar");
						teclat.nextLine();
						break;
					
					case "3":
						System.out.println("Introduce los datos de la Reserva que quieras eliminar:");
						Reserva.eliminarReserva(biblioteca.getLlistaReserva());
						System.out.println("Pulsa enter paara continuar");
						teclat.nextLine();
						break;
						
					case "4":
						enrere=true;
						break;
						
					case "5":
						enrere=true;
						exit=true;
						break;
						
					}
					break;
				}
			}
			enrere=false;
		}		
	}
}
