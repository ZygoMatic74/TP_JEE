package services;

import javax.ejb.Remote;

import entities.Vehicles;

@Remote
public interface VehiclesManager {
	public Vehicles createVehicles(String marque);
	public Vehicles findVehicles(String marque);
}
