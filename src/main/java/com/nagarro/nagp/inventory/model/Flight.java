package com.nagarro.nagp.inventory.model;

import java.time.LocalDate;

/**
 * The Class Flight.
 */
public class Flight {

	/** The origin. */
	private String origin;

	/** The destination. */
	private String destination;

	/** The travel date. */
	private LocalDate travelDate;

	/** The flight number. */
	private String flightNumber;

	/** The available seats. */
	private int availableSeats;

	/**
	 * Instantiates a new flight.
	 */
	public Flight() {
		// default constructor
	}

	/**
	 * Instantiates a new flight.
	 *
	 * @param origin
	 *            the origin
	 * @param destination
	 *            the destination
	 * @param travelDate
	 *            the travel date
	 * @param flightNumber
	 *            the flight number
	 * @param availableSeats
	 *            the available seats
	 */
	public Flight(String origin, String destination, LocalDate travelDate, String flightNumber, int availableSeats) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.travelDate = travelDate;
		this.flightNumber = flightNumber;
		this.availableSeats = availableSeats;
	}

	/**
	 * Gets the origin.
	 *
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param origin
	 *            the new origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination
	 *            the new destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * Gets the travel date.
	 *
	 * @return the travel date
	 */
	public LocalDate getTravelDate() {
		return travelDate;
	}

	/**
	 * Sets the travel date.
	 *
	 * @param travelDate
	 *            the new travel date
	 */
	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	/**
	 * Gets the flight number.
	 *
	 * @return the flight number
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * Sets the flight number.
	 *
	 * @param flightNumber
	 *            the new flight number
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * Gets the available seats.
	 *
	 * @return the available seats
	 */
	public int getAvailableSeats() {
		return availableSeats;
	}

	/**
	 * Sets the available seats.
	 *
	 * @param availableSeats
	 *            the new available seats
	 */
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

}
