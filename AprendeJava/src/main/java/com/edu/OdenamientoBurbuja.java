package com.edu;

public class OdenamientoBurbuja {

	public static void main(String[] args) {
		int[] i = {78, 95, 65, 99, 24};
		
		burbuja( i );
	}

	public static void burbuja(int[] A) {
		System.out.print("Original: ");
		for(int a: A) System.out.print(a + " ");
		System.out.println();
		int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                    for(int a: A) System.out.print(a + " ");
                    System.out.println();
                }
            }
        }
}
	
}
