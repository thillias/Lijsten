package Lijsten;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ListTest {
	
	EmptyList emptylist = new EmptyList();
	
	int[] tail = {6, 3};
	int head = 3;
	NonEmptyList nonemptylist = new NonEmptyList(head, tail);
	
	

	
	
	
	@Test
	public void test() {
		
		assertEquals("[3, 6, 3]", nonemptylist.toString());
		
	}}

