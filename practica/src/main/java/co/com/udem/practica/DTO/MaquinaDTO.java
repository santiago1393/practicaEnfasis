package co.com.udem.practica.DTO;

public class MaquinaDTO {
	
	private String nombre;
	private String descripcion;
	private boolean disponibilidad;
	private double precio;
	private double descuento;
	private String imagen;
	
	/**
	 * @param nombre
	 * @param descripcion
	 * @param disponibilidad
	 * @param precio
	 * @param descuento
	 * @param imagen
	 */
	public MaquinaDTO(String nombre, String descripcion,
			boolean disponibilidad, double precio, double descuento,
			String imagen) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.disponibilidad = disponibilidad;
		this.precio = precio;
		this.descuento = descuento;
		this.imagen = imagen;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the disponibilidad
	 */
	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	/**
	 * @param disponibilidad the disponibilidad to set
	 */
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the descuento
	 */
	public double getDescuento() {
		return descuento;
	}

	/**
	 * @param descuento the descuento to set
	 */
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}
