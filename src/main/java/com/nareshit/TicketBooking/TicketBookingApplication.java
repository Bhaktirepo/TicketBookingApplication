package com.nareshit.TicketBooking;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.TicketBooking.entity.Ticket;
import com.nareshit.TicketBooking.service.TicketService;

@SpringBootApplication
public class TicketBookingApplication implements CommandLineRunner{
     @Autowired
     private TicketService ticketService;
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
		
		Ticket inputObj=new Ticket();
		inputObj.setPassengerName("Bhakti");
		inputObj.setSourceStation("Hydrabad");
		inputObj.setDestinationStation("BBSR");
		inputObj.setTravelDate(new Date());
		inputObj.setEmail("bhakti@gmmail.com");
		
		ticketService.createTicket(inputObj);
	}
  
}
