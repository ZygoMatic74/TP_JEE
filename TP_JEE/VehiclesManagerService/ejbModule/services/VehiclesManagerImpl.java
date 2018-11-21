package services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Vehicles;

@Stateless
public class VehiclesManagerImpl implements VehiclesManager {
	@PersistenceContext(name = "VehiclesService")
	EntityManager em;
	
	public VehiclesManagerImpl() {
		
	}
	
	public VehiclesManagerImpl(EntityManager em) {
		this.em = em;
	}
	
	public Vehicles createVehicles(String marque) {	
		Vehicles vehicles = new Vehicles(marque);
		em.persist(vehicles);
		return vehicles;
	}
	
	public Vehicles findVehicles(String marque) {
		return em.find(Vehicles.class, marque);
	}
}
