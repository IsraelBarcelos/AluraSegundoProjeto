package linkedList;

public class TestLinkedList {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		
		list.addAtStart("teste1");
		System.out.println(list);
		list.addAtStart("list2");
		System.out.println(list);
		
		
		LinkedList list2 = new LinkedList();
		
		list2.addAtFinish("Test 3");
		
		System.out.println(list2);
		
		list2.addAtFinish("Test 4");
		
		System.out.println(list2);
		
		list2.addAtFinish("Teste 5");
		
		System.out.println(list2);
		
		list2.add("pezinho da maiara", 1);
		
		System.out.println(list2);
		
		list2.add("outro pezinho da maiara", 1);
		
		System.out.println(list2);
		
		list2.remove(1);
		
		System.out.println(list2);
		
		list2.remove(3);
		
		System.out.println(list2);
		
		list2.remove(0);
		
		System.out.println(list2);
	}
}
