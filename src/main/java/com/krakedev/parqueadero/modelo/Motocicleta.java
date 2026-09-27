package com.krakedev.parqueadero.modelo;

public class Motocicleta extends Vehiculo {
	private int cilindraje;

	public Motocicleta() {
		super("", "");
	}

	@Override
	public double calcularTarifa(int horasPermanencia) {
		double total = horasPermanencia * 0.75;

		if (cilindraje > 250) {
			total += horasPermanencia * 1.00;
		}
		return total;
	}

}
