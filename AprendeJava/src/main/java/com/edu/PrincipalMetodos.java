package com.edu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PrincipalMetodos {

	public static void main(String[] args) {
		
//		probarMapCustom();
		
		listas();

		for( int i = 0; i < 40; i++ ) {
			System.out.println( Objects.hash(34) );
		}
		
	}
	
	public static void probarMapCustom() {
		
		MapCustom map = new MapCustom();
		
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key1", "value4");
		map.put("key3", "value33");
		map.put("key4", 99);
		
		System.out.println( map );

		int mapRest = (Integer)map.get("key4");
		
		System.out.println("Resultado: ");
		System.out.println( mapRest );
		
//		Map mapr = new HashMap();
//		mapr.put("llave", "valor");
//		mapr.put("llave1", "valor");
//		mapr.put("llave2", "valor");
//		mapr.put("llave3", 23);
//		
//		String mapRest2 = (String)mapr.get("llave3");
//		
//		System.out.println(mapr);
		
	}

	public static void listas() {
		
		List<String> list = Arrays.asList("a", "X", "10", "20", "1", "2");
//		List<String> list = new ArrayList<>();
//		List<String> list = List.of("a", "X", "10", "20", "1", "2");
		Collections.sort(list);
//		list.add("c1");
//		list.add("jorge");
	
//		list.set(0, "Mario");
		
		System.out.println(list);
		
	}
	
}
