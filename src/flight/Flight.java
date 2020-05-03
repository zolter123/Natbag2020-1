package flight;

import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Flight {
	protected int numFlight;
	protected String airlineName;
	protected int terminalNum;
	protected int flightDurationHour;
	protected int flightDurationMin;
	
	
	public Flight (String airLine , int numFlight, int terminal, int flightDurationHour,int flightDurationMin) {
		setAirlineName(airLine);
		setTerminalNum(terminal);
		this.numFlight = numFlight;
		setFlightDurationHour(flightDurationHour);
		setFlightDurationMin(flightDurationMin);
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
	


	public int getFlightDurationHour() {
		return flightDurationHour;
	}


	public void setFlightDurationHour(int flightDurationHour) {
		this.flightDurationHour = flightDurationHour;
	}


	public int getFlightDurationMin() {
		return flightDurationMin;
	}


	public void setFlightDurationMin(int flightDurationMin) {
		this.flightDurationMin = flightDurationMin;
	}


	public void setTerminalNum(int terminalNum) {
		this.terminalNum = terminalNum;
	}


	public int getNumFlight() {
		return numFlight;
	}
	public void save(PrintWriter pw) {
		pw.println(airlineName);
		pw.println(numFlight);
		pw.println(terminalNum);
		pw.println(flightDurationHour);
		pw.println(flightDurationMin);
	}
	
	public String toString() {
		return "Airline Name: " +airlineName+" flight number: "+numFlight+" terminal: "+terminalNum;
	}

}
