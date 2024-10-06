package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.MaquinaDulces;

public class TestMaquinaDulces {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda(new Celda("A").getCodigo());
        maquina.agregarCelda(new Celda("B").getCodigo());
        maquina.agregarCelda(new Celda("C").getCodigo());
        maquina.agregarCelda(new Celda("D").getCodigo());
        maquina.mostrarConfiguracion();
    }
}
