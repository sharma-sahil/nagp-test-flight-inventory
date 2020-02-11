package com.nagarro.nagp.inventory.service;

import java.util.List;

import com.nagarro.nagp.inventory.dto.CheckAvailableFlightsRequest;
import com.nagarro.nagp.inventory.dto.FlightsDTO;
import com.nagarro.nagp.inventory.dto.UpdateInventoryRequest;

/**
 * The Interface IInventoryService.
 */
public interface IInventoryService {

	/**
	 * Gets the available flights.
	 *
	 * @param request
	 *            the request
	 * @return the available flights
	 */
	List<FlightsDTO> getAvailableFlights(CheckAvailableFlightsRequest request);

	/**
	 * Update inventory.
	 *
	 * @param request
	 *            the request
	 */
	void updateInventory(UpdateInventoryRequest request);

}
