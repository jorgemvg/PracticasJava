package com.edu.desacomplamiento;

public class ComunicadorManager {

	//Implementamos un factory method
	public static Comunicador crearComunicador() {
//		return new PalomaMensajera();
//		return new Telegrafo();
		return new TelefonoCelular();
	}
	
}