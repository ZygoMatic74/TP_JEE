package entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehicles
 *
 */
@Entity

public class Vehicles implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String marque;
	
	private static final long serialVersionUID = 1L;

	public Vehicles() {
		super();
	}
	
	public Vehicles(String marque) {
		super();
		this.setMarque(marque);
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
   
}
