package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;

		
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(5, 3);
		System.out.println("Resultado Suma: "+resultadoSuma);
		resultadoResta=calcu.restar(5,3);
		System.out.println("Resultado Resta: "+resultadoResta);
		resultadoMultiplicar=calcu.multiplicar(5,3);
		System.out.println("Resultado Multiplicacion: "+resultadoMultiplicar);
		resultadoDividir=calcu.dividir(5,3);
		System.out.println("Resultado Division: "+resultadoDividir);
		resultadoPromediar=calcu.promediar(5, 3, 10);
		System.out.println("Resultado Promedio: "+resultadoPromediar);
		calcu.mostrarResultado();
	}

}
