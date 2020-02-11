package com.nagarro.nagp.inventory.validator;

import org.springframework.util.StringUtils;

import com.nagarro.nagp.inventory.dto.CheckAvailableFlightsRequest;
import com.nagarro.nagp.inventory.dto.UpdateInventoryRequest;
import com.nagarro.nagp.inventory.exception.InvalidParameterException;

/**
 * The Class InputValidator.
 */
public class InputValidator {

	private InputValidator() {
		// to prevent initialization
	}

	/**
	 * Validatecheck availability request.
	 *
	 * @param request
	 *            the request
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	public static void validatecheckAvailabilityRequest(CheckAvailableFlightsRequest request)
			throws InvalidParameterException {
		if (null == request) {
			throw new InvalidParameterException("Input Request must not be null", "invalid.request");
		}
		if (!StringUtils.hasText(request.getOrigin())) {
			throw new InvalidParameterException("Origin must not be null in request", "invalid.request.origin");
		}
		if (!StringUtils.hasText(request.getDestination())) {
			throw new InvalidParameterException("Destination must not be null in request",
					"invalid.request.destination");
		}
		if (null != request.getTravelDate()) {
			throw new InvalidParameterException("Travel Date not be null in request", "invalid.request.travelDate");
		}
	}

	/**
	 * Validate update inventory request.
	 *
	 * @param request
	 *            the request
	 * @throws InvalidParameterException
	 *             the invalid parameter exception
	 */
	public static void validateUpdateInventoryRequest(UpdateInventoryRequest request) throws InvalidParameterException {
		if (null == request) {
			throw new InvalidParameterException("Input Request must not be null", "invalid.request");
		}
		if (!StringUtils.hasText(request.getFlightNumber())) {
			throw new InvalidParameterException("Flight Number not be null in request", "invalid.request.flightNumber");
		}
		if (null == request.getAction()) {
			throw new InvalidParameterException("Action must not be null in request", "invalid.request.action");
		}
		if (null != request.getFlightDate()) {
			throw new InvalidParameterException("Flight Date not be null in request", "invalid.request.flightDate");
		}
		if (request.getSeats() < 1) {
			throw new InvalidParameterException("Seats must be greater than 0", "invalid.request.seats");
		}
	}

}
