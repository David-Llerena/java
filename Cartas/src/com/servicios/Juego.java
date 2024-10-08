package com.servicios;

import java.util.ArrayList;
import java.util.Random;

import com.entidades.Carta;
import com.entidades.Naipes;

public class Juego {
	private Naipes naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	
	public Juego(ArrayList<String> arrayList) {
		this.naipe = naipe;
		this.cartasJugadores = new ArrayList();
	       for (String id : arrayList) {
	            ArrayList<Carta> cartas = new ArrayList<>(); 
	            this.cartasJugadores.add(cartas); 
	       }
	 }

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void setCartasJugadores(ArrayList<ArrayList<Carta>> cartasJugadores) {
		this.cartasJugadores = cartasJugadores;
	}

	public Juego() {
		this.naipe = new Naipes();
		ArrayList<Carta> naipeBarajado=this.naipe.barajar();
		}
	
    public ArrayList<ArrayList<Carta>> entregarCartas(int cartasPorJugador) {
        
        if (naipe == null) {
            naipe = new Naipes(); // Doble verificación por si acaso
        }
        naipe.barajar();   	
    	
        // Determinar el número de jugadores (3 en este caso)
        int numJugadores = 3;
        
        // Inicializar los ArrayLists para cada jugador
        for (int i = 0; i < numJugadores; i++) {
        	cartasJugadores.add(new ArrayList<>());
        }
        
        // Repartir las cartas
        int cartasEntregadas = 0;
        int jugadorActual = 0;
        
        while (cartasEntregadas < cartasPorJugador * numJugadores) {
        	cartasJugadores.get(jugadorActual).add(this.naipe.barajar().get(cartasEntregadas));
            cartasEntregadas++;
            jugadorActual = (jugadorActual + 1) % numJugadores;
        }
        
        return cartasJugadores;
    }
    
    public int determinarGanador() {
        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual >= sumaGanador) {
                sumaGanador = sumaActual;
                idGanador = i;
            }
        }

        return idGanador;
    }

    public int devolverTotal(int idJugador) {
        int suma = 0;
        for (Carta carta : cartasJugadores.get(idJugador)) {
            suma += carta.getNumero().getValor();
        }
        return suma;
    }

  }
