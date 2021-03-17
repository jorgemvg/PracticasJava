package com.edu.desacomplamiento;

public class PalomaMensajera extends Paloma implements Comunicador {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Paloma mensajera: " + mensaje);
		
	}

}
