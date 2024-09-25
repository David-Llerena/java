package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora calcu;
		calcu=new Calculadora();
		
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromediar;

		resultadoSuma=calcu.sumar(5, 3);
		resultadoResta=calcu.restar(5,3);
		resultadoMultiplicar=calcu.multiplicar(5,3);
		resultadoDividir=calcu.dividir(5,3);
		resultadoPromediar=calcu.promediar(5, 3, 10);
		calcu.mostrarResultado();
		
		
		System.out.println("Resultado Suma: "+resultadoSuma);		
		System.out.println("Resultado Resta: "+resultadoResta);	
		System.out.println("Resultado Multiplicacion: "+resultadoMultiplicar);		
		System.out.println("Resultado Division: "+resultadoDividir);
		System.out.println("Resultado Promedio: "+resultadoPromediar);

	}

}
