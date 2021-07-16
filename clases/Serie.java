
package unidad8.clases;

public class Serie {
	// Atributos
	protected String tituloSerie;
	protected int numTemporada;
	protected boolean entregado;
	protected String generoSerie;
	protected String creador;

	// Constructor por defecto
	public Serie() {
		this.tituloSerie = "";
		this.numTemporada = 3;
		this.entregado = false;
		this.generoSerie = "";
		this.creador = "";
	}

	// Constructor con título y creador
	public Serie(String tituloSerie, String creador) {
		this.numTemporada = 3;
		this.entregado = false;
		this.generoSerie = "";
		this.tituloSerie = tituloSerie;
		this.creador = creador;
	}
	// Constructor con todos los atributos excepto entregado
	public Serie(String tituloSerie, int numTemporada, String generoSerie, String creador) {
		this.tituloSerie = tituloSerie;
		this.numTemporada = numTemporada;
		this.generoSerie = generoSerie;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [tituloSerie=" + tituloSerie + ", numTemporada=" + numTemporada + ", entregado=" + entregado
				+ ", generoSerie=" + generoSerie + ", creador=" + creador + "]";
	}

}
