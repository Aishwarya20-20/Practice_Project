package com.main;

import java.sql.Date;

public class SeatBookeds {

	private Date date;
	private String source;
	private String destination;
	int seats;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date bookDate) {
		this.date = bookDate;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
}
