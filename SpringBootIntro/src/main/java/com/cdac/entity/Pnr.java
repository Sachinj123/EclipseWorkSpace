package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

public class Pnr {
	
	private int pnrNo;
	private int trainNo;
	private LocalDate traveldate;
	
	private List<Passenger> passenger;

	public int getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(int pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public LocalDate getTraveldate() {
		return traveldate;
	}

	public void setTraveldate(LocalDate traveldate) {
		this.traveldate = traveldate;
	}

	public List<Passenger> getPassenger() {
		return passenger;
	}

	public void setPassenger(List<Passenger> passenger) {
		this.passenger = passenger;
	}
	
	
}
