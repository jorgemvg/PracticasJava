package com.edu;

public class ClaseImplementaInterfacePrueba implements InterfacePrueba {

	private String var2 = "var2";
	
	@Override
	public void imprimir() {
		
		//puedo acceder a los metodos privados de la inner class
		var inner = new innerClase1();
		System.out.println("Esto se imprimio directamente de la clase" + inner.var1);
		
	}

	@Override
	public void metodo5(String s) {
		// TODO Auto-generated method stub
		
	}
	
	public  void metodo7() {
		var inner = new innerClase1();
	}

	//inner class
	public  class innerClase1 {
		private String var1 = "segundo";
		
		//No se puede crear variables staticas si la inner class no es estatica
		//public static String var3 = "dfd"; //error
		
		public void metodoInner() {
			
			//puedo acceder a las propiedades privadsa de la top class
			//System.out.println( var2 );
		}
	}
}
