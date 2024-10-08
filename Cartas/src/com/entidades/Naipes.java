package com.entidades;

import java.util.ArrayList;
import java.util.Random;

public class Naipes {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	 public Naipes() {
	        this.numerosPosibles = new ArrayList<>();
	        this.cartas = new ArrayList<>();
	        Palos palos = new Palos();

	        numerosPosibles.add(new Numero("A", 11));
	        numerosPosibles.add(new Numero("2", 2));
	        numerosPosibles.add(new Numero("3", 3));
	        numerosPosibles.add(new Numero("4", 4));
	        numerosPosibles.add(new Numero("5", 5));
	        numerosPosibles.add(new Numero("6", 6));
	        numerosPosibles.add(new Numero("7", 7));
	        numerosPosibles.add(new Numero("8", 8));
	        numerosPosibles.add(new Numero("9", 9));
	        numerosPosibles.add(new Numero("10", 10));
	        numerosPosibles.add(new Numero("J", 10));
	        numerosPosibles.add(new Numero("Q", 10));
	        numerosPosibles.add(new Numero("K", 10));
	        
	        for (int i = 0; i < 4; i++) {
	            String palo;
	            if (i == 0) {
	            	palo = palos.getCorazonRojo();
	            }
	            else if (i == 1) {
	            	palo = palos.getCorazonNegro();
	            }
	            else if(i == 2){
	            	 palo = palos.getDiamante();
	            }
	            else {
	            	palo = palos.getTrebol();
	            }
	            for (int j = 0; j < numerosPosibles.size(); j++) {
	                cartas.add(new Carta(numerosPosibles.get(j), palo));
	            }
	        }
	    }
	 
	 public ArrayList<Carta> barajar() {
	        ArrayList<Carta> auxiliar = new ArrayList<>();
	        Random random = new Random();
	        
	        // Resetear el estado de todas las cartas a "N"
	        for (Carta carta : cartas) {
	            carta.setEstado("N");
	        }
	        
	        // Realizar 100 iteraciones
	        for (int i = 0; i < 100; i++) {
	        	int posicion = obtenerPosicion();
	            Carta cartaSeleccionada = cartas.get(posicion);
	            
	            if (cartaSeleccionada.getEstado().equals("N")) {
	                cartaSeleccionada.setEstado("C");
	                auxiliar.add(cartaSeleccionada);
	            }
	        }
	        
	        // Agregar las cartas restantes que no fueron seleccionadas
	        for (Carta carta : cartas) {
	            if (carta.getEstado().equals("N")) {
	                carta.setEstado("C");
	                auxiliar.add(carta);
	            }
	        }
	        
	        return auxiliar;
	    }
	    private int obtenerPosicion() {
	        Random random = new Random();
	        return random.nextInt(52); // Retorna un número aleatorio entre 0 y 51
	    }
	    
	    public ArrayList<ArrayList<Carta>> entregarCartas(int cartasPorJugador) {
	        ArrayList<Carta> naipeBarajado = barajar();
	        ArrayList<ArrayList<Carta>> jugadores = new ArrayList<>();
	        
	        // Determinar el número de jugadores (3 en este caso)
	        int numJugadores = 3;
	        
	        // Inicializar los ArrayLists para cada jugador
	        for (int i = 0; i < numJugadores; i++) {
	            jugadores.add(new ArrayList<>());
	        }
	        
	        // Repartir las cartas
	        int cartasEntregadas = 0;
	        int jugadorActual = 0;
	        
	        while (cartasEntregadas < cartasPorJugador * numJugadores) {
	            jugadores.get(jugadorActual).add(naipeBarajado.get(cartasEntregadas));
	            cartasEntregadas++;
	            jugadorActual = (jugadorActual + 1) % numJugadores;
	        }
	        
	        return jugadores;
	    }
}