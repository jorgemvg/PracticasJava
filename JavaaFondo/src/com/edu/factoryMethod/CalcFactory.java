package com.edu.factoryMethod;

public class CalcFactory {
	
    public static CalcSomething getCalculator(){
        String alg = getAlgValueFromPropertyFile();
        switch(alg){
            case "1":
                return new CalcUsingAlg1();
            case "2":
                int p1 = getAlg2Prop1FromPropertyFile();
                double p2 = getAlg2Prop2FromPropertyFile();
                return new CalcUsingAlg2(p1, p2);
            default:
                System.out.println("Unknown value " + alg);
                return new CalcUsingAlg1();
        }
    }
    
    private static String getAlgValueFromPropertyFile() {
    	//aqui leemos de un archivo y retornamos el valor para la implementacion
    	return "1";
    }
    
    private static int getAlg2Prop1FromPropertyFile () {
    	return 5;
    }
    
    private static double getAlg2Prop2FromPropertyFile() {
    	return 10;
    }
}
