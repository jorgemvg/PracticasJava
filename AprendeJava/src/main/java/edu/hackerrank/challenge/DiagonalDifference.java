package edu.hackerrank.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * Return:
 * int: the absolute diagonal difference
 */

public class DiagonalDifference {

	public static void main(String[] args) {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 3;//Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

//        IntStream.range(0, n).forEach(i -> {
//            try {
//                arr.add(
//                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                        .map(Integer::parseInt)
//                        .collect(toList())
//                );
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        });
        
        List<Integer> lista1 = Arrays.asList(1, 2, 8);
        List<Integer> lista2 = Arrays.asList(2, 3, 4);
        List<Integer> lista3 = Arrays.asList(5, 6, 7);
        
        arr.add(lista1);
        arr.add(lista2);
        arr.add(lista3);
        
        
        int result = DiagonalDifference.diagonalDifference(arr);

        System.out.println( String.valueOf(result) );
        
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();

	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here

		int sumaDiagDerecha = 0;
		int sumaDiagIzquierda = 0;
		Integer diferencia = 0;
		
		Integer integer = 0;
		for (int i = 0; i < arr.size(); i++) {
			List<Integer> lista = arr.get(i);

			integer = lista.get(i);
			sumaDiagDerecha += integer;
			
			integer = lista.get((arr.size() - 1) - i);			
			sumaDiagIzquierda += integer;
		}
		
		diferencia = sumaDiagDerecha - sumaDiagIzquierda;
		
		System.out.println(sumaDiagDerecha);
		System.out.println(sumaDiagIzquierda);
		System.out.println( Math.abs(diferencia) );
		
		return Math.abs(diferencia);
	}
}
