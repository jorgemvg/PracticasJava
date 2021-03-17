package com.edu;

public interface InterfacePrueba {

	String atributoUno = "Valor";
	
	/*
	 * En ina interfaz todos los miembros son public por defecto, a no ser q sean declarados privados.
	 */
	
	void imprimir();
	
	default void metodo1 () {
		System.out.println("Impresion del metodo default" + atributoUno);
	}
	
	public default void metodo2 () {
		metodo1();
		System.out.println("Impresion del metodo2 default" + atributoUno);
		metodo3();
	}
	
	private void metodo3() {
		System.out.println("Esto solo se puede llamar desde la interface");
	}
	
	static void metodo4() {
		System.out.println("Impresion metodo estatico");
	}
	
	private void  metodo5() {
		
	}
	
	void metodo5(String s) ;
}
