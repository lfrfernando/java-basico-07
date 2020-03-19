package br.fai.basico07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub

		calcular(5, 5);
		calcular(10.27, 10.42);
		calcular("44", "um texto qualquer");
	}

	private void calcular(int primeiroValor, int segundoValor) {

		int resultado = primeiroValor + segundoValor;
		System.out.println("Resultado da operação: " + resultado);
	}

	private void calcular(double primeiroValor, double segundoValor) {

		double resultado = primeiroValor - segundoValor;
		System.out.println("Resultado da operação: " + resultado);
	}

	private void calcular(String primeiroValor, String segundoValor) {

		String resultado = primeiroValor + segundoValor;
		System.out.println("Resultado da operação: " + resultado);
	}

}

