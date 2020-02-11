package com.nagarro.nagp.inventory.dao;

import java.util.List;

import com.nagarro.nagp.inventory.dto.CheckAvailableFlightsRequest;
import com.nagarro.nagp.inventory.model.Flight;

/**
 * The Interface IInventoryDAO.
 */
public interface IInventoryDAO {

	/**
	 * Gets the all flights.
	 *
	 * @return the all flights
	 */
	public List<Flight> getAllFlights();

}
