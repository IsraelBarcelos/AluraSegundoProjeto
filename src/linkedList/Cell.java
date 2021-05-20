package linkedList;

public class Cell {
	private String object;
	private Cell next;
	private Cell previous;
	
	
	public Cell(String object,Cell previous, Cell next) {
		super();
		this.object = object;
		this.next = next;
		this.previous = previous;
	}


	public Cell getNext() {
		return next;
	}


	public void setNext(Cell next) {
		this.next = next;
	}


	public Cell getPrevious() {
		return previous;
	}


	public void setPrevious(Cell previous) {
		this.previous = previous;
	}


	public String getObject() {
		return object;
	}
	
	@Override
	public String toString() {
		return "This element is the " + this.object;
	}	
	
}
