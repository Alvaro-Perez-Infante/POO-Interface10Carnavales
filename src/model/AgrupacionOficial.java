package model;

public abstract class AgrupacionOficial extends Agrupacion{

	private Integer puntosObtenidos;
	
	public AgrupacionOficial() {
		super();
	}
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntosObtenidos2) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		setPuntosObtenidos(puntosObtenidos);
	}
	
	public Integer getPuntosObtenidos() {
		return puntosObtenidos;
	}

	public void setPuntosObtenidos(Integer puntosObtenidos) {
		this.puntosObtenidos = puntosObtenidos;
	}
	
//	public boolean insertarIntegrante() {
//		setTotalIntegrantes(Cuarteto.numMiembros);
//		return false;
//	}
	public abstract String caminitoDelFalla();
}
