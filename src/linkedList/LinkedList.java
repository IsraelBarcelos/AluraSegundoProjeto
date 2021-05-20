package linkedList;

public class LinkedList {
	private int totalMembers = 0;
	private Cell first = null;
	private Cell last = null;

	public void addAtStart(String object) {
		Cell newCell = new Cell(object, null, first);
		if (totalMembers == 0) {
			this.first = newCell;
			this.last = newCell;
		} else {
			this.first.setPrevious(newCell);
			this.first = newCell;
		}

		this.totalMembers++;
	}

	public void addAtFinish(String object) {
		Cell newCell = new Cell(object, last, null);
		if (totalMembers == 0) {
			this.addAtStart(object);
		} else {
			this.last.setNext(newCell);
			this.last = newCell;
			this.totalMembers++;
		}
	}

	private boolean verifyPosition(int position) {
		return position >= 0 && position < this.totalMembers;
	}

	private Cell getElement(int position) {
		if (!this.verifyPosition(position)) {
			throw new IllegalArgumentException("Invalid position");
		} else {
			Cell actual = this.first;
			for (int i = 0; i < position; i++) {
				actual = actual.getNext();

			}

			return actual;
		}
	}

	public void add(String object, int position) {
		if (this.totalMembers == 0) {
			this.addAtStart(object);
		} else {
			Cell prevCell = this.getElement(position - 1);
			Cell nextCell = prevCell.getNext();
			Cell newCell = new Cell(object, prevCell, nextCell);
			nextCell.setPrevious(newCell);
			prevCell.setNext(newCell);

			this.totalMembers++;
		}
	}

	public void remove(int position) {
		if (this.totalMembers == 0) {
			throw new IllegalArgumentException("List is null!");
		}else if(this.totalMembers == 1) {
			this.last = null;
			this.first = null;
		}else {
			
			//Just remove an item if list is not null
			Cell toBeRemoved = this.getElement(position);
			if (toBeRemoved.equals(first)) {
				
				this.first = toBeRemoved.getNext();
				this.first.setPrevious(null);
			} else if (toBeRemoved.equals(last)) {
				this.last = toBeRemoved.getPrevious();
				this.last.setNext(null);
			} else {
				toBeRemoved.getNext().setPrevious(toBeRemoved.getPrevious());
				toBeRemoved.getPrevious().setNext(toBeRemoved.getNext());
			}
			this.totalMembers--;
		}
	}

	@Override
	public String toString() {

		if (this.totalMembers == 0) {
			return "[]";
		}

		Cell actual = this.first;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < this.totalMembers; i++) {

			builder.append(actual.getObject() + ", ");

			actual = actual.getNext();

		}

		builder.append("]");

		return builder.toString();
	}

}
