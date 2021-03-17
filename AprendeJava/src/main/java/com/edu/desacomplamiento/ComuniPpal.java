package com.edu.desacomplamiento;

public class ComuniPpal {

	public static void main(String[] args) {

		Comunicador telefonoCel = new TelefonoCelular();
		Comunicador palomaMens = new PalomaMensajera();
		Comunicador telegrafo = new Telegrafo();

		Comunicador c = ComunicadorManager.crearComunicador();
		c.enviarMensaje("Hola, este es el mensaje");
		
		
		
	}

}
