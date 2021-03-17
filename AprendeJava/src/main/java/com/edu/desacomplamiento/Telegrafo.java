package com.edu.desacomplamiento;

public class Telegrafo extends Reliquia implements Comunicador{

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Telegrafo: " + mensaje);
		
	}

}
