package com.nagarro.nagp.inventory.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.nagp.inventory.constants.InventoryConstants;
import com.nagarro.nagp.inventory.dao.IInventoryDAO;
import com.nagarro.nagp.inventory.model.Flight;

/**
 * The Class UserDAOImpl.
 */
@Component
public class InventoryDAOImpl implements IInventoryDAO {

	private static List<Flight> flights = new ArrayList<>();

	static {
		flights.add(new Flight(InventoryConstants.DELHI, InventoryConstants.MUMBAI, LocalDate.now(),
				InventoryConstants.FLIGHT_NUMBER, 10));
		flights.add(new Flight(InventoryConstants.DELHI, InventoryConstants.MUMBAI, LocalDate.now().plusDays(1),
				InventoryConstants.FLIGHT_NUMBER, 10));
		flights.add(new Flight(InventoryConstants.MUMBAI, InventoryConstants.DELHI, LocalDate.now(),
				InventoryConstants.FLIGHT_NUMBER, 10));
		flights.add(new Flight(InventoryConstants.MUMBAI, InventoryConstants.DELHI, LocalDate.now(),
				InventoryConstants.FLIGHT_NUMBER, 10));
		flights.add(new Flight(InventoryConstants.MUMBAI, InventoryConstants.DELHI, LocalDate.now(),
				InventoryConstants.FLIGHT_NUMBER, 10));

	}

	@Override
	public List<Flight> getAllFlights() {
		return InventoryDAOImpl.flights;
	}

}
