import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.hackerrank.challenge.Student;

@RunWith(value = Parameterized.class)
public class Day12Test {

	Student student;
	
	@Parameters
	public static Iterable<Object[]> getData() {
		List<Object[]> obj = Arrays.asList( new Object[][] {
			{"Jorge", "Vidal", 8160232, new int[] {90,80,100}, 'O'},
			{"Jorge", "Vidal", 8160232, new int[] {80,70,100}, 'E'},
			{"Jorge", "Vidal", 8160232, new int[] {60,50,100}, 'A'},
			{"Jorge", "Vidal", 8160232, new int[] {40,60,100}, 'P'},
			{"Jorge", "Vidal", 8160232, new int[] {30,30,100}, 'D'},
			{"Jorge", "Vidal", 8160232, new int[] {10,20,10}, 'T'}
			
		} );
		
		return obj;
		
	}
	
	String firstName, lastName;
	int id;
	int[] scores;
	char expec;
	
	public Day12Test( String firstName, String lastName, int id, int[] scores, char expec ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.scores = scores;
		this.expec = expec;
	}
	
	@Test
	public void test() {
		student = new Student(firstName, lastName, id, scores );
		assertEquals(expec, student.calculate());
	}
	
//	@Test
//	public void testCase_E() {
//		student = new Student("Jorge", "Vidal", 8160232, new int[]{80, 70, 100});
//		assertEquals('E', student.calculate());
//	}
//	
//	@Test
//	public void testCase_A() {
//		student = new Student("Jorge", "Vidal", 8160232, new int[]{60, 50, 100});
//		assertEquals('A', student.calculate());
//	}
//	
//	@Test
//	public void testCase_P() {
//		student = new Student("Jorge", "Vidal", 8160232, new int[]{40, 60, 100});
//		assertEquals('P', student.calculate());
//	}
//	
//	@Test
//	public void testCase_D() {
//		student = new Student("Jorge", "Vidal", 8160232, new int[]{30, 30, 100});
//		assertEquals('D', student.calculate());
//	}
//	
//	@Test
//	public void testCase_T() {
//		student = new Student("Jorge", "Vidal", 8160232, new int[]{10, 20, 50});
//		assertEquals('T', student.calculate());
//		
//	}
	
}
