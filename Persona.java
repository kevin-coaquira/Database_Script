package biblioteca;

import java.util.ArrayList;

import java.util.Scanner;

public class Persona {
	private String nom;
	private String cognoms;
	private String dni;
	private String contrassenya;
	
	//Constructors
	public Persona() {
		this(null,null,null,"12345678");
	}	
	public Persona(Persona persona) {
		this(persona.getNom(),persona.getCognoms(),persona.getDni(),persona.getContrassenya());
	}
	public Persona(String nom, String cognoms, String dni, String contrassenya) {
		this.nom = new String();
		this.cognoms = new String();
		this.dni = new String();
		this.contrassenya = new String();
		
		this.setNom(nom);
		this.setCognoms(cognoms);
		this.setDni(dni);
		this.setContrassenya(contrassenya);
	}

	
	//Altres m�todes
	@Override
	public String toString() {
		return "Persona [Nombre:" + nom + ", Apellidos:" + cognoms + ", DNI:" + dni + "]";
	}
	
	public static void afegirPersona(ArrayList<Persona> llista, Persona usuari) {
		llista.add(usuari);
	}
	
	
	public static void afegirPersona(ArrayList<Persona> llista) {
		Scanner teclat = new Scanner(System.in);
		Persona persona = new Persona();
		
		System.out.println("Introduzca su nombre: ");
		persona.setNom(teclat.nextLine());
		
		System.out.println("Introduzca sus apellidos: ");
		persona.setCognoms(teclat.nextLine());
		
		System.out.println("Introduzca el DNI: ");
		persona.setDni(teclat.nextLine());
		
		System.out.println("Introduzca la contraseña: ");
		persona.setContrassenya(teclat.nextLine());
		
		llista.add(persona);
	}
	
	public static int cercarPersonaDNI(ArrayList<Persona> llista) {
		Scanner teclat = new Scanner(System.in);
		String dni;
		int posicio=-1;
		
		System.out.println("Introduzca el DNI que quire buscar: ");
		dni=teclat.nextLine();
		
		int i = 0;
		boolean trobat=false;
		while (!trobat && i<llista.size()) {
			if (llista.get(i).getDni().equals(dni)) {
				trobat = true;
				posicio=i;
			}
			i=i+1;
		}
		if (!trobat) {
			System.out.println("No se ha encontrado ninguna coincidencia.");
		}
		return posicio;
	}
	
	public static int cercarPersonaDNIaReserva(ArrayList<Reserva> llista) {
		Scanner teclat = new Scanner(System.in);
		String dni;
		int posicio=-1;
		
		System.out.println("Introduzca el DNI que quiere buscar: ");
		dni=teclat.nextLine();
		
		int i = 0;
		boolean trobat=false;
		while (!trobat && i<llista.size()) {
			if (llista.get(i).getPersona().getDni().equals(dni)) {
				trobat = true;
				posicio=i;
			}
			i=i+1;
		}
		if (!trobat) {
			System.out.println("No se ha encontrado ninguna coincidencia.");
		}
		return posicio;
	}
	
	public static void eliminarPersona(ArrayList<Persona> llista) {
		if(cercarPersonaDNI(llista)>-1) {
			llista.remove(cercarPersonaDNI(llista));
		}else {
			System.out.println("No se ha podido eliminar la persona.");
		}
	}
	
	//Setters i getters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCognoms() {
		return cognoms;
	}
	public void setCognoms(String cognoms) {
		this.cognoms = cognoms;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getContrassenya() {
		return contrassenya;
	}
	public void setContrassenya(String contrassenya) {
		Scanner teclat = new Scanner(System.in);
		while (contrassenya.length()<8) {
			System.out.println("Introduzca una contraseña de 7 o mas caracteres: ");
			contrassenya=teclat.nextLine();
		}
		this.contrassenya = contrassenya;
	}
}
