package lista;

public class TesteFila {

	public static void main(String[] args) {

		Fila fila = new Fila();

		fila.adiciona("teste1");

		System.out.println(fila);
		fila.adiciona("teste2");

		System.out.println(fila);
		fila.remove();
		System.out.println(fila);

	}

}
