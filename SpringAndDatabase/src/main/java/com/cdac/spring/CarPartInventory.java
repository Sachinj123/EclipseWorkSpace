package com.cdac.spring;

import java.util.List;

public interface CarPartInventory {
	
	public void addNewPart(CarPart carPart) throws ClassNotFoundException;
	
	public List<CarPart> getAvailableParts();

}
