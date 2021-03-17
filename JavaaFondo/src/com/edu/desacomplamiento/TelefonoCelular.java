package com.edu.desacomplamiento;

public class TelefonoCelular extends Telefono implements Comunicador {

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Telefono Celular: " + mensaje);
		
	}

}
