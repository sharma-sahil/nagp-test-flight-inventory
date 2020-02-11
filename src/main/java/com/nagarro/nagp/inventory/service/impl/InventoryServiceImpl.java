package com.nagarro.nagp.inventory.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.inventory.dao.IInventoryDAO;
import com.nagarro.nagp.inventory.dto.CheckAvailableFlightsRequest;
import com.nagarro.nagp.inventory.dto.FlightsDTO;
import com.nagarro.nagp.inventory.dto.UpdateInventoryRequest;
import com.nagarro.nagp.inventory.model.Flight;
import com.nagarro.nagp.inventory.service.IInventoryService;

/**
 */
@Service
public class InventoryServiceImpl implements IInventoryService {

	private static final Logger LOGGER = LoggerFactory.getLogger(InventoryServiceImpl.class);

	@Autowired
	private IInventoryDAO inventoryDAO;

	@Override
	public List<FlightsDTO> getAvailableFlights(CheckAvailableFlightsRequest request) {
		LOGGER.info("Getting flights for request : {}", request);
		List<FlightsDTO> flights = new ArrayList<>();
		List<Flight> flightsFromDB = this.inventoryDAO.getAllFlights();
		flightsFromDB.forEach(f -> {
			FlightsDTO flightDTO = new FlightsDTO();
			BeanUtils.copyProperties(f, flightDTO);
			flights.add(flightDTO);
		});
		return flights;
	}

	@Override
	public void updateInventory(final UpdateInventoryRequest request) {
		LOGGER.info("Updating inventory for request: {}", request);
		// not doing any database operation
		LOGGER.info("Updated Inventory");
	}

}
