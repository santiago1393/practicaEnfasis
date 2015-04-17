/**
 * 
 */
package co.com.udem.practica.DTO;

import java.util.List;

/**
 * @author YO
 *
 */
public class EstadoRespuesta {
	private String status;
	private List<MaquinaDTO> response;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the response
	 */
	public List<MaquinaDTO> getResponse() {
		return response;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(List<MaquinaDTO> response) {
		this.response = response;
	}
	public EstadoRespuesta(String status, List<MaquinaDTO> response) {
		super();
		this.status = status;
		this.response = response;
	}

	
	public EstadoRespuesta(){
		super();
	}
	
	
}
