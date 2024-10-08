package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipes;

public class Jugadores {
    private ArrayList<String> jugadores;

    public Jugadores() {
        this.jugadores = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<String> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
    }

    // Método jugar
    public void jugar() {
        // Agregar tres jugadores
        jugadores.add("Jugador 1");
        jugadores.add("Jugador 2");
        jugadores.add("Jugador 3");

        // Crear naipe y repartir cartas
        Naipes naipe = new Naipes();
        ArrayList<ArrayList<Carta>> cartasJugadores = naipe.entregarCartas(5);

        // Mostrar resultados
        for (int i = 0; i < jugadores.size(); i++) {
            int total = 0;
            System.out.println(jugadores.get(i) + ":");
            
            for (Carta carta : cartasJugadores.get(i)) {
                System.out.println("   " + carta);
                total += carta.getNumero().getValor();
            }
            
            System.out.println("Total: " + total);
            System.out.println();
        }

        // Determinar ganador
        String ganador = determinarGanador(cartasJugadores);
        System.out.println("El ganador es: " + ganador);
    }

    private String determinarGanador(ArrayList<ArrayList<Carta>> cartasJugadores) {
        int maxPuntaje = -1;
        int jugadorGanador = -1;

        for (int i = 0; i < cartasJugadores.size(); i++) {
            int puntajeActual = 0;
            for (Carta carta : cartasJugadores.get(i)) {
                puntajeActual += carta.getNumero().getValor();
            }
            
            if (puntajeActual > maxPuntaje) {
                maxPuntaje = puntajeActual;
                jugadorGanador = i;
            }
        }

        return jugadores.get(jugadorGanador) + " con " + maxPuntaje + " puntos";
    }
}
