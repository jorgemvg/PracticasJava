package com.edu.factoryMethod;

public class ClasePrincipal {

	public static void main(String[] args) {

		//Usamos la factoria de obetos para traer una de las implementaciones de CalcSomething
		//Cada que cambie la implemtacion para nosotros sera transparente.
		CalcSomething calc = CalcFactory.getCalculator();
		double result = calc.calculate();
		System.out.println(result);
	}

}
