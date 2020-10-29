package mf0227.uf2404.actividad2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realizar un programa que nos cree una lista de coches, para ello deberá
 * almacenarse dentro de esta lista los objetos de tipo coche que crearemos La
 * clase coche tendrá los siguientes atributos: matricula, marca, modelo, color,
 * potencia, cilindrada Para rellenar la lista se creara un menú que nos
 * solicitara introducir los datos por teclado, y una vez leídos todos, se
 * guardaran en un objeto que se añadirá a la lista y nos pedirá que indiquemos
 * si queremos introducir un vehículo más o no. Una vez que no queramos
 * introducir más coches, nos mostrara todo el contenido en pantalla Realizar el
 * ejercicio en base a las reglas de programación orientada a objetos
 * 
 * @author Victor Campos Leal
 *
 */
public class EjercicioApp {

	// variables globales
	static private Scanner sc = null;
	static private ArrayList<Coche> coches = new ArrayList<Coche>();
	static private String opcion = "";

	// variables locales
	private static final String OPTION_CREAR = "1";
	private static final String OPTION_MOSTRAR = "2";
	private static final String OPTION_NO = "2";
	private static final String OPTION_OUT = "S";
	private static boolean repeat = false;

	public static void main(String[] args) {

		System.out.println("bienvenido a crea tu lista de coches app");
		sc = new Scanner(System.in);
		inicializar();

		do {

			menu();
			switch (opcion) {
			case OPTION_CREAR:
				crear();

				break;

			case OPTION_MOSTRAR:
				mostrar();

				break;

			case OPTION_OUT:
				repeat = true;
				break;

			default:
				System.out.println("introduce a valid option");
				break;
			}

		} while (!repeat);

		System.out.println("-----------Good bye------------");

	}

	private static void inicializar() {

		Coche carro = new Coche();
		carro.setMarca("Ford");
		carro.setModelo("Raptor");
		carro.setPotencia(260);
		carro.setCilindrada(8);
		carro.setColor("Blanco");
		carro.setMatricula("12345");
		coches.add(carro);

		carro = new Coche();
		carro.setMarca("Dodge");
		carro.setModelo("Ram");
		carro.setPotencia(260);
		carro.setCilindrada(6);
		carro.setColor("Blanco");
		carro.setMatricula("1235");
		coches.add(carro);

		carro = new Coche();
		carro.setMarca("Chevrolet");
		carro.setModelo("Silverado");
		carro.setPotencia(230);
		carro.setCilindrada(6);
		carro.setColor("Blanco");
		carro.setMatricula("12335");
		coches.add(carro);
	}

	private static void mostrar() {
		for (Coche coche : coches) {

			System.out.println("-----------------------------");
			System.out.printf("Marca: %s %n", coche.getMarca());
			System.out.printf("Modelo: %s %n", coche.getModelo());
			System.out.printf("Potencia: %sCV %n", coche.getPotencia());
			System.out.printf("Cilindrada: V%s %n", coche.getCilindrada());
			System.out.printf("Color: %s %n", coche.getColor());
			System.out.printf("Matricula: %s %n", coche.getMatricula());
			coche.arrancar();
			System.out.println("-----------------------------");

		}

	}

	private static void crear() {

		Coche c = new Coche();
		boolean repetidor = true;
		String option = "";
		boolean repetidorError = false;
		do {
			System.out.println("Introduce una Marca");
			c.setMarca(sc.nextLine());
			System.out.println("Introduce un Modelo ");
			c.setModelo(sc.nextLine());
			System.out.println("Introduce la potencia ");

			do {
				try {
					c.setPotencia(Integer.parseInt(sc.nextLine()));
					System.out.println("Valid input:)!!");
					repetidorError = true;
				} catch (NumberFormatException e) {
					System.out.println("tienes que introducir un valor numérico");
					System.out.println("----------------------------------");
					System.out.println("Introduce una potencia valida");
				}
			} while (!repetidorError);

			System.out.println("Introduce una cilindrada");
			do {
				try {
					c.setCilindrada(Integer.parseInt(sc.nextLine()));
					System.out.println("Valid input :)!!!!");

				} catch (NumberFormatException e) {
					System.out.println("tienes que introducir un valor numérico");
					System.out.println("----------------------------------");
					System.out.println("Introduce una cilindrada valida");

				}
			} while (!repetidorError);

			System.out.println("introduce un color");
			c.setColor(sc.nextLine());
			System.out.println("introduce una Matricula");
			c.setMatricula(sc.nextLine());
			coches.add(c);
			System.out.println("--------------------------------- ");
			System.out.println("desea introducir otro coche ");
			System.out.println("1-SI ");
			System.out.println("2-NO ");
			option = sc.nextLine();

			if (option.equals(OPTION_NO)) {
				repetidor = false;
				mostrar();

			}

		} while (repetidor);

	}

	private static void menu() {

		System.out.println("************************************");
		System.out.println(" 1.- Crear un coche");
		System.out.println(" 2.- mostrar coches");
		System.out.println(" ");
		System.out.println(" S - Salir");
		System.out.println("************************************");
		opcion = sc.nextLine();

	}

}
