package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import flight.Airport;
import flight.Flight;

class SortTest {

	@Test
	void test() {
		Airport air1 = getActual();
		
		Flight fly1 = new Flight( "FRERE" , 2, 1, "24/09/2019 10:00", "24/09/2019 11:00","Natbag", "London");
		Flight fly2 = new Flight( "FRE" , 3, 2, "24/09/2019 12:00", "24/09/2019 13:00","New-York", "Natbag");
		
		StringBuffer str= new StringBuffer();
		str.append("Natbag airport \n");
		str.append("landings: \n");
		str.append("Airline Name: FRE flight number: 3 terminal: 2\n");
		str.append("departures: ");
		str.append("Airline Name: FRERE flight number: 2 terminal: 1\n");
		assertEquals(str.toString(), air1.toString() );
		
		
	}
	private Airport getActual () {
		
		Airport air = new Airport("Natbag ");
		air.addDeparture("FRERE" , 2, 1, "24/09/2019 10:00", "24/09/2019 11:00","Natbag", "London");
		air.addLanding("FRE" , 3, 2, "24/09/2019 12:00", "24/09/2019 13:00","New-York", "Natbag");
			return air;
	}

}
