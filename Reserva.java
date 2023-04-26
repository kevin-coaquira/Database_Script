package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Reserva {
	Persona persona;
	Llibre llibre;
	Estat estat;
	
	//Constructors
	public Reserva(Persona persona, Llibre llibre, Estat estat) {
		persona = new Persona();
		llibre = new Llibre();
		
		this.setPersona(persona);
		this.setLlibre(llibre);
		this.setEstat(estat);
	}
	
	public Reserva () {
		this(null,null,null);
	}
	
	//Altres m�todes
	@Override
	public String toString() {
		return "-----\n" +
			   "USUARIO:\n " + 
				persona + 
				"\nLIBRO:\n" + llibre + "ESTADO:\n " + estat +"\n";
	}
	
	public static void afegirReserva(ArrayList<Reserva> llistaReserves, ArrayList<Llibre> llistaLlibres, ArrayList<Persona> llistaUsuaris) {
		Reserva reserva = new Reserva();
		int posPersona = Persona.cercarPersonaDNI(llistaUsuaris);
		
		if (posPersona>-1) {
			int quantitatReserves = 0;			
			for (int i=0;i<llistaReserves.size();i++) {
				if (llistaReserves.get(i).getPersona().getDni().equals(llistaUsuaris.get(posPersona).getDni())) {
					quantitatReserves++;
				}
			}
			if (quantitatReserves<=5) {
				reserva.setPersona(llistaUsuaris.get(posPersona));
				
				int posLlibre = Llibre.cercarLlibreISBN(llistaLlibres);
				if (posLlibre>-1) {
					if (llistaLlibres.get(posLlibre).getNumCopiesDisponibles()>0) {
						reserva.setLlibre(llistaLlibres.get(posLlibre));
						reserva.setEstat(Estat.Vigent);
						llistaReserves.add(reserva);
						llistaLlibres.get(posLlibre).setNumCopiesDisponibles(llistaLlibres.get(posLlibre).getNumCopiesDisponibles()-1);
						System.out.println("Reserva realizada correctamente");
					}else {
						System.out.println("El libro no tiene copias disponibles");
					}
					
				}
			}else {
				System.out.println("Reserva no realizada, el usuari ha alzanzado el maximo de 5 reservas");
			}
			}
	}
	
	public static boolean llibreTeReserva(ArrayList<Reserva> llistaReserves, Llibre llibre) {
		boolean reserva=false;
		int i=0;
		while(!reserva && i<llistaReserves.size()){
			if(llistaReserves.get(i).getLlibre().getIsbn().equals(llibre.getIsbn())) {
				reserva=true;
			}
			i=i+1;
		}
		
		return reserva;
	}
	
	public static void eliminarReserva(ArrayList<Reserva> llistaReserves) {
		Scanner teclat = new Scanner (System.in);
		System.out.println("Introduzca el DNI del usuario: ");
		String dni = teclat.nextLine();
		System.out.println("Introduzca el ISBN del libro: ");
		String isbn = teclat.nextLine();
		
		int i=0;
		boolean trobat=false;
		while(!trobat && i<llistaReserves.size()) {
			if (llistaReserves.get(i).getPersona().getDni().equals(dni) && llistaReserves.get(i).getLlibre().getIsbn().equals(isbn)) {
				trobat=true;
				System.out.println("Reserva eliminada");
				llistaReserves.get(i).getLlibre().setNumCopiesDisponibles(llistaReserves.get(i).getLlibre().getNumCopiesDisponibles()+1);
				llistaReserves.remove(i);
			}
		}
		if (!trobat) {
			System.out.println("No se ha  encontrado nignuna coincidencia.");
		}
	}
	
	//Setters i getters
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Llibre getLlibre() {
		return llibre;
	}
	public void setLlibre(Llibre llibre) {
		this.llibre = llibre;
	}
	public Estat getEstat() {
		return estat;
	}
	public void setEstat(Estat estat) {
		this.estat = estat;
	}	
}
