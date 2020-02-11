package com.nagarro.nagp.inventory.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.inventory.dto.CheckAvailableFlightsRequest;
import com.nagarro.nagp.inventory.dto.FlightsDTO;
import com.nagarro.nagp.inventory.dto.UpdateInventoryRequest;
import com.nagarro.nagp.inventory.exception.InvalidParameterException;
import com.nagarro.nagp.inventory.service.IInventoryService;
import com.nagarro.nagp.inventory.validator.InputValidator;

/**
 * The Class InventoryController.
 */
@RestController
public class InventoryController {

	/** The inventory service. */
	@Autowired
	private IInventoryService inventoryService;

	@PostMapping(value = "/checkAvailability")
	public List<FlightsDTO> checkAvailability(@RequestBody final CheckAvailableFlightsRequest request)
			throws InvalidParameterException {
		InputValidator.validatecheckAvailabilityRequest(request);
		return this.inventoryService.getAvailableFlights(request);
	}

	@PutMapping(value = "/updateInventory")
	public void updateInventory(@RequestBody final UpdateInventoryRequest request) throws InvalidParameterException {
		InputValidator.validateUpdateInventoryRequest(request);
		this.inventoryService.updateInventory(request);
	}

}
