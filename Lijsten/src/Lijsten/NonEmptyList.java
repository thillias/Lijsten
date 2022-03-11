package Lijsten;

public class NonEmptyList {
	
	private int head;
	private int[] tail;
	
	@Override
	public boolean equals(Object object) {
		
		return object instanceof NonEmptyList nonemptylist && head == nonemptylist.head 
				&& tail == nonemptylist.tail; 
		
	}
	
	public NonEmptyList(int head, int[] tail) {
		this.head = head;
		this.tail = tail;
	}
	
	

	public String toString() {
		String string = "[" + head;
		for(int i=0; i < tail.length; i++) {
			string = string + ", " + tail[i];
		}
		return string + "]";
		
	}
	
	
	
	
	
	
	
}
