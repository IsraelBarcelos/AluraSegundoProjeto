package conjuntos;

public class TesteConjuntos {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		conjunto.adiciona("jose");
		System.out.println(conjunto);
		conjunto.adiciona("jose");
		System.out.println(conjunto);
		conjunto.adiciona("mauricio");
		System.out.println(conjunto);
		conjunto.adiciona("arial");
		System.out.println(conjunto);
		conjunto.adiciona("yasmin");
		System.out.println(conjunto);
		conjunto.adiciona("josefildo");
		System.out.println(conjunto);
		conjunto.remove("josefildo");
		System.out.println(conjunto);
		
	}

}
