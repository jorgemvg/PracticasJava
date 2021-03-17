package edu.hackerrank.challenge;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class CompareTheTriplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		int pointA = 0;
		int pointB = 0;
		for (int i = 0; i <= 2; i++) {
			if ((a.get(i) >= 1 && a.get(i) <= 100) && (b.get(i) >= 1 && b.get(i) <= 100)) {

				if (a.get(i) > b.get(i)) {
					pointA++;
				} else if (a.get(i) < b.get(i)) {
					pointB++;
				}
			}
		}

		//return List.of(pointA, pointB);
		return Arrays.asList(pointA, pointB);
	}

	public static void main(String[] args) throws IOException {
		/*
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
				.collect(toList());

		List<Integer> result = compareTriplets(a, b);

		bufferedWriter.write(result.stream().map(Object::toString).collect(joining(" ")) + "\n");

		bufferedReader.close();
		bufferedWriter.close();
		*/
		
		List<Integer> result = compareTriplets(List.of(17,28,30), List.of(99,16,8));
		System.out.println( (result.stream().map(Object::toString).collect(joining(" ")) + "\n") );
	}

}
