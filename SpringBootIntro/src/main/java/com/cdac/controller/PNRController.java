package com.cdac.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.entity.Passenger;
import com.cdac.entity.Passenger.Gender;
import com.cdac.entity.Passenger.Status;
import com.cdac.entity.Pnr;

//Assume this API has been developed by IRCTC

//http://localhost:8080/pnr-status?pnrNo=123456789


//apan request param use kelay tya mule apalyala "?" nanter pnrNo lihava lagto
//here data goes into the JSON Format


@RestController
public class PNRController{
	
	@RequestMapping("pnr-status")
	public Pnr getPnrDetails(@RequestParam("pnrNo") int prnNo)
	{
		//for time being we will hard coded some data
		//as of now we are not writing any service and dao classes
		
		Pnr pnr = new Pnr();
		
		pnr.setPnrNo(prnNo);
		pnr.setTrainNo(17613);
		pnr.setTraveldate(LocalDate.of(2023, 7, 20));
		
		List<Passenger> list = new ArrayList<>();
		Passenger p1 = new Passenger();
		p1.setName("Sachin");
		p1.setGender(Gender.MALE);
		p1.setStatus(Status.CONFIRM);
		
		list.add(p1);
		
		Passenger p2 = new Passenger();
		p2.setName("Sampada");
		p2.setGender(Gender.FEMALE);
		p2.setStatus(Status.RAC);
		list.add(p2);
		
		pnr.setPassenger(list);
		return pnr;
		
	}
	

}
