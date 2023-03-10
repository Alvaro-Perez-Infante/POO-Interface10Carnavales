package view;

import controller.COAC;
import model.Agrupacion;
import model.AgrupacionOficial;
import model.Chirigota;
import model.Comparsa;
import model.Coro;
import model.Cuarteto;
import model.Integrante;
import model.Romancero;
import model.Util;

/**
 * <h2>Clase Principal, donde realizamos de la creaci&oacute;n,
 * modificaci&oacute;n y configuraci&oacute;n de los men&uacute;s de opciones
 * para poder darle uso al programa.</h2>
 * 
 * @version 4.0
 * @author &Aacute;lvaro P&eacute;rez Infante
 */
public class Principal {

	/*
	 * Creamos un objeto COAC para poder darle uso a algunos m&eacute;todos.
	 */
	static COAC coac = new COAC(20, 10);

	/*
	 * M&eacute;etodo principal desde donde se llaman los men&uacute;s.
	 */
	public static void main(String[] args) {

		iniprogram();
		gestionPrograma();
	}

	/*
	 * M&eacute;todo que se encarga en la creaci&oacute;n de algunos objetos para
	 * comprobar el funcionamineto del programa.
	 */
	private static void iniprogram() {
		Chirigota ch1 = new Chirigota(10, "Jino", "Antonio", "Josefa", "Antonia", "Hospital", 28);
		Comparsa com1 = new Comparsa("Arpaso", "Claudia", "Juan", "Marcos", "Josefa", "Pokemon", 40);
		Coro cor1 = new Coro("Del tiron", "Austin", "Clara", "Eustaquio", "Penelope", 34);
		Cuarteto cua1 = new Cuarteto(4, "Los Paco", "Alfonso", "Perri", "Letre", "Anime", 25);
		Romancero rom1 = new Romancero("El Piso", "Los Alocao", "Laura", "Carlos", "Asin", "Parsero");
	}

	/*
	 * M&eacute;todo que se encarga de la gesti&oacute;n del men&uacute; del
	 * programa principal.
	 */
	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
			case 1 -> opcIntegrantes();
			case 2 -> inscribir_agrupacion();
			case 3 -> eliminar_agrupacion();
			case 4 -> opcConcurso();
			case 5 -> listarTodo();
			case 6 -> CompAgrupacionNombre();
			case 7 -> CompAgrupacionAutor();
			case 8 -> CompAgrupacionMusLet();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	/*
	 * M&eacute;todo que se encarga de la gesti&oacute;n del men&uacute; de
	 * integrantes.
	 */
	private static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> insertarIntegrante();
			case 2 -> eliminarIntegrante();
			case 3 -> listaIntegrantes();
			}
		} while (opc != 0);
	}

	/*
	 * M&eacute;todo que se encarga de la gesti&oacute;n del men&uacute; del
	 * concurso.
	 */
	private static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			case 1 -> asignarPuntos();
			case 2 -> listarTodo();
			case 3 -> CompAgrupacionPuntos();
			case 4 -> CompAgrupacionNombre();
			case 5 -> CompAgrupacionAutor();
			case 6 -> CompAgrupacionMusLet();
			}
		} while (opc != 0);
	}

	/*
	 * Men&uacute; que muestra por pantalla el men&uacute; principal.
	 */
	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  5. Listar todas.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 6. Ordenar por el nombre.");
		Util.escribir(" 7. Ordenar por el autor.");
		Util.escribir(" 8. Ordenar por el autor de música/letra.");
	}

	/*
	 * M&eacute;todo que muestra por pantalla el men&uacute; de integrantes.
	 */
	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│ GESTION DE PARTICIPANTES │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Listar todos los participantes.");
	}

	/*
	 * M&eacute;todo que muestra por pantalla el men&uacute; sobre la gesti&oacute;n
	 * del concurso.
	 */
	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("  1. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  2. Listar todos.");
		Util.escribir("Ordenación del listado:");
		Util.escribir("  3. Ordenar por puntos.");
		Util.escribir("  4. Ordenar por el nombre.");
		Util.escribir("  5. Ordenar por el autor.");
		Util.escribir("  6. Ordenar por autor de música/letra.");
	}

	/*
	 * M&eacute;todo que muestra por pantalla el men&uacute; sobre las agrupaciones.
	 */
	public static void mostrarAgrup() {
		Util.escribir(" 1 - Cuartetos");
		Util.escribir(" 2 - Romanceros");
		Util.escribir(" 3 - Chirigota");
		Util.escribir(" 4 - Comparsa");
		Util.escribir(" 5 - Coro");
	}

	/*
	 * M&eacute;todo que inscribe agrupaciones al programa.
	 */
	private static void inscribir_agrupacion() {
		Util.escribir("¿Que agrupación quieres añadir?");
		mostrarAgrup();
	}

	/*
	 * M&eacute;todo que elimina agrupaciones del programa.
	 */
	private static void eliminar_agrupacion() {
		Util.escribir("¿Que agrupación quieres eliminar?");
		mostrarAgrup();
	}

	/*
	 * M&eacute;todo que llama al comprardor de puntos para hacerlo funcionar y
	 * mostrarlo por pantalla.
	 */
	private static void CompAgrupacionPuntos() {
		coac.ordenar_por_puntos(null);
		listarTodo();
	}

	/*
	 * M&eacute;todo que llama al comprardor de nombre para hacerlo funcionar y
	 * mostrarlo por pantalla.
	 */
	private static void CompAgrupacionNombre() {
		coac.ordenar_por_nombre();
		listarTodo();
	}

	/*
	 * M&eacute;todo que llama al comprardor de autor para hacerlo funcionar y
	 * mostrarlo por pantalla.
	 */
	public static void CompAgrupacionAutor() {
		coac.ordenar_por_autor();
		listarTodo();
	}

	/*
	 * M&eacute;todo que llama al comprardor de musica y letra para hacerlo
	 * funcionar y mostrarlo por pantalla.
	 */
	private static void CompAgrupacionMusLet() {
		coac.ordenar_por_autor_musica_letra();
		listarTodo();
	}

	/*
	 * M&eacute;todo encargado de listar todas las agrupaciones y mostrarlas por
	 * pantalla.
	 */
	private static void listarTodo() {
		Agrupacion[] aux = coac.getAgrupaciones();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.print("" + aux[i]);
			}
		}
	}

	/*
	 * M&eacute;todo que modifica e inserta integrantes.
	 */
	private static void insertarIntegrante() {
		Integrante i = new Integrante();
		coac.insertarIntegrante(i);
	}

	/*
	 * M&eacute;todo que modifica y elimina integrantes.
	 */
	private static void eliminarIntegrante() {
		listaIntegrantes();
		System.out.println(("¿Que integrante quieres eliminar?"));
	}

	/*
	 * M&eacute;todo que lista y muestra todos los integrantes del programa.
	 */
	private static void listaIntegrantes() {
		Integrante[] aux = coac.getIntegrantes();
		for (int i = 0; i < aux.length; i++) {
			if (aux[i] != null) {
				System.out.print("\n" + (i + 1) + ".-" + aux[i]);
			}
		}
	}

	/*
	 * M&eacute;todo que asigna los puntos que decida el usuario a cualquier
	 * agrupaci&oacute;m
	 */
	private static void asignarPuntos() {
		AgrupacionOficial[] aux = (AgrupacionOficial[]) coac.getAgrupaciones();
		int opc;
		opc = Util.leerInt("¿A qué agrupación vas a asignar puntos?");
		mostrarAgrup();
		Integer puntos = Util.leerInt("¿Cuantos puntos? : ");
	}

	/*
	 * M&eacute;todo para finalizar el programa
	 */
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
}
