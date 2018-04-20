package collezioni;

import java.util.ArrayList;

import classi.*;

public class ArrayListGenerici {

	public static void main(String[] args) {
		// ArrayList con uso dei Generici
		
		//arraylistr generico con utilizzo di object
		//ArrayList lista = new ArrayList();
		
		//voglio solo oggetti di tipo Persona
		ArrayList<Persona> lista = new ArrayList<Persona>();
		//lista.add(new Cerchio(12.5));
		lista.add(new Persona("Pino","Caluso"));
		lista.add(new Persona("Rino","Caluso"));
		lista.add(new Persona("Nino","Caluso"));
		lista.add(new Persona("Lino","Caluso"));
		lista.add(new Persona("Mino","Caluso"));
		lista.add(new Persona("Dino","Caluso"));
		
		for(Persona p : lista)
			System.out.println(p);
		

	}

}
