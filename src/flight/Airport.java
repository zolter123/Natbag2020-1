package flight;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airport {
	List<Flight> flightArr; 
	String airportName;
	int numOfDeparture, numOFLandings;
	
	public Airport (String name) {
		flightArr = new ArrayList<Flight>();
		airportName = name;
	}
	public Airport (Scanner scan) {
		flightArr = new ArrayList<Flight>();
		numOfDeparture = scan.nextInt();
		for (int i = 0; i < numOfDeparture; i++) {
			flightArr.add(new Departure(scan));
		}
		numOFLandings = scan.nextInt();
		for (int i = 0; i < numOFLandings; i++) {
			flightArr.add(new Landings(scan));
		}
	}
	public void save(PrintWriter pw) {
		pw.println(airportName);
		pw.println(numOfDeparture);
		d//need to sort by departure first
		for (int i = 0; i < numOfDeparture; i++) {
			flightArr.get(i).save(pw); // how to go to object in position i???
		}
		pw.println(numOFLandings);
		for (int j = (numOfDeparture - 1); j < (numOFLandings + numOfDeparture); j++) {
			flightArr.get(j).save(pw);
		}
		
	}
	public boolean addDeparture(String airLine , int numFlight, int terminal, int flightDurationHour,int flightDurationMin,String depTime,String destination) {
		flightArr.add(new Departure(airLine, numFlight, terminal, flightDurationHour, flightDurationMin, depTime, destination));
		numOfDeparture++;
		return true;
	}
	public boolean addLanding(String airLine , int numFlight, int terminal, int flightDurationHour,int flightDurationMin,String landTime,String orgin) {
		flightArr.add(new Landings(airLine, numFlight, terminal, flightDurationHour, flightDurationMin, landTime, orgin));
		numOFLandings++;
		return true;
	}
	

}
