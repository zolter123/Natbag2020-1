package flight;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Landings extends Flight{
	
	private String orgine;
	private LocalDateTime depTime;
	private LocalDateTime landTime;

	
	
	public Landings(String airLine , int numFlight, int terminal, int flightDurationHour,int flightDurationMin,String landTime,String orgin) {
		super(airLine, numFlight, terminal,flightDurationHour,flightDurationMin);
		setLandTime(landTime);
		setOrgine(orgin);
		setDepTime(); 
		
		}
	public Landings (Scanner scan) {
		super(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		setLandTime(scan.next());
		setOrgine(scan.next());
		setDepTime();
	}



	public String getOrgine() {
		return orgine;
	}



	private void setOrgine(String orgine) {
		this.orgine = orgine;
	}



	public LocalDateTime getDepTime() {
		return depTime;
	}



	private void setDepTime() {
		this.depTime = landTime;
		depTime = depTime.plusHours(flightDurationHour);
		depTime = depTime.plusMinutes(flightDurationMin);
	}



	public LocalDateTime getLandTime() {
		return landTime;
	}



	public void setLandTime(String landTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm"); // add exeption??
		this.landTime = LocalDateTime.parse(landTime, formatter);
	}
	public void save(PrintWriter pw) {
		super.save(pw);
		pw.println(landTime.toString());
		pw.println(orgine);
	}
	
	
	
}
