package unidad8.clases;

public class Password {
	private final int LONGITUD = 8;
	private String contrasena = "";
	int longi;
	private int min = 0;
	private int max = 9;

	public Password() {
		this.longi = LONGITUD;
		this.contrasena = generaPassword(longi);
	}

	public Password(int LONGITUD) {
		this.longi = LONGITUD;
		this.contrasena = generaPassword(longi);
	}

	@Override
	public String toString() {
		return "Password [longitud= " + longi + ", contrasena= " + contrasena + "]";
	}

	/**
	 * @return the longi
	 */
	public int getLongi() {
		return longi;
	}

	/**
	 * @param longi the longi to set
	 */
	public void setLongi(int longi) {
		this.longi = longi;
	}

	/**
	 * @return the lONGITUD
	 */
	public int getLONGITUD() {
		return LONGITUD;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String generaPassword(int longi) {

		for (int i = 0; i < longi; i++) {
			String aux = Integer.toString((int) ((Math.random() * ((max - min) + 1)) + min));
			contrasena += aux;
		}
		return contrasena;
	}

}
