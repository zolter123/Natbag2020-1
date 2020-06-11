package flight;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Flight {
	private int numFlight;
	private String airlineName;
	private int terminalNum;
	private LocalDateTime departureDate;
	private LocalDateTime landTime;
	private String orgin;
	private String destanation;
	
	
	
	public Flight (String airLine , int numFlight, int terminal, String depTime, String landTime,String orgin, String destanation) {
		setAirlineName(airLine);
		setTerminalNum(terminal);
		this.numFlight = numFlight;
		setLandTime(landTime);
		setDepartureDate(depTime);
		setOrgin(orgin);
		setDestanation(destanation);
	}
	
	public Flight (Scanner scan) {
		setAirlineName(scan.next());
		setTerminalNum(scan.nextInt());
		this.numFlight = scan.nextInt();
		setLandTime(scan.nextLine());
		setDepartureDate(scan.nextLine());
		setOrgin(scan.nextLine());
		setDestanation(scan.nextLine());
	}


	public String getAirlineName() {
		return airlineName;
	}


	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public int getTerminalNum() {
		return terminalNum;
	}

	public void setTerminalNum(int terminalNum) {
		this.terminalNum = terminalNum;
	}

	public LocalDateTime getDepartureDate() {
		return departureDate;
	}
	public LocalDateTime getLandTime() {
		return landTime;
	}
	public String getOrgin() {
		return orgin;
	}
	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}
	public String getDestanation() {
		return destanation;
	}
	public void setDestanation(String destanation) {
		this.destanation = destanation;
	}
	public int getNumFlight() {
		return numFlight;
	}
	
	public void setLandTime(String landTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm"); // add exeption??
		this.landTime = LocalDateTime.parse(landTime, formatter);
	}
	public void setDepartureDate(String depTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm"); // add exeption??
		this.departureDate = LocalDateTime.parse(depTime, formatter);
	}
	
	public void save(PrintWriter pw) {
		pw.println(airlineName);
		pw.println(numFlight);
		pw.println(terminalNum);
		pw.println(departureDate);
		pw.println(landTime);
		pw.println(orgin);
		pw.println(destanation);
	}
	
	public String toString() {
		return "Airline Name: " +airlineName+" flight number: "+numFlight+" terminal: "+terminalNum;
	}

}
