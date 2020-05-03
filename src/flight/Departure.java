package flight;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Departure extends Flight{
	
	private String destination;
	private LocalDateTime departureDate;
	private LocalDateTime landTime;
	
	
	public Departure(String airLine , int numFlight, int terminal, int flightDurationHour,int flightDurationMin,String depTime,String destination) {
	super(airLine, numFlight, terminal,flightDurationHour,flightDurationMin);
	setDepTime(depTime);
	setDestination(destination);
	setLandTime();
	
	}
	public Departure(Scanner scan) {
		super(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		setDepTime(scan.next());
		setDestination(scan.next());
		setLandTime();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getDepTime() {
		return departureDate;
	}

	public void setDepTime(String depTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm"); // add exeption??
		this.departureDate = LocalDateTime.parse(depTime, formatter);
	}

	public LocalDateTime getLandTime() {
		return landTime;
	}

	private void setLandTime() {
		landTime = departureDate;
		landTime = landTime.plusHours(flightDurationHour);
		landTime = landTime.plusMinutes(flightDurationMin);
	}
	public void save(PrintWriter pw) {
		super.save(pw);
		pw.println(departureDate.toString());
		pw.println(destination);
	}
	
	public String toString () {
		return " Departure at: "+departureDate+" to: "+ destination + " and should land at: "+landTime;
	}

	
	
	
}
