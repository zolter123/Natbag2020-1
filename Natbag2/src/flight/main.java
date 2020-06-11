package flight;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 1;
		System.out.println("making new airport please enter a name:");
		Airport port = new Airport(scan.nextLine());
		while (choice != 0) {
			showMenu();
			choice = scan.nextInt();
			if(choice != 0 && options(port, choice, scan))
				System.out.println("action has been preformed");
			
		
		}
		System.out.println("have a good day");
		scan.close();
		
		

	}

public static void showMenu() {
	System.out.println("1:  add flight");
    System.out.println("2:  show departure in date");
    System.out.println("3:  show Landings in date");
    System.out.println("4:  show airport ");
    System.out.println("5:  show flights between two dates (dd/mm/yyyy)");
    System.out.println("6:  show by airline");
    System.out.println("7:  show departures by destanation");
    System.out.println("8:  show landings by destanation");
    System.out.println("9:  show departures by orgin");
    System.out.println("10: show landings by orgin");
    System.out.println("11: show flights in days");//not working yet
    
	
	System.out.println("0: to exit");
}
	
	
public static boolean addFlight (Airport port,Scanner scan) {
	System.out.println("press:\n 1 to add a departure flight \n2 to add landing flight");
	int kindOfFlight = scan.nextInt(); 
	switch (kindOfFlight) {
	case 1:
		System.out.println("name of airline");
		String airLine = scan.next();
		System.out.println("flight number:");
		int numFlight = scan.nextInt();
		System.out.println("terminal number:");
		int terminal = scan.nextInt();
		scan.nextLine();
		System.out.println("departure time: (dd/MM/uuuu HH:mm)");
		String depTime = scan.nextLine();
		System.out.println("landing time: (dd/MM/uuuu HH:mm)");
		String landTime = scan.nextLine();
		System.out.println("orgine of flight: ");
		String orgin= scan.nextLine();
		System.out.println("destanation of flight: ");
		String destination = scan.nextLine();
		port.addDeparture(airLine, numFlight, terminal, depTime, landTime, orgin, destination);
		return true;
	case 2:
		System.out.println("name of airline");
		String airLineL = scan.next();
		System.out.println("flight number:");
		int numFlightL = scan.nextInt();
		System.out.println("terminal number:");
		int terminalL = scan.nextInt();
		scan.nextLine();
		System.out.println("departure time: (dd/MM/uuuu HH:mm)");
		String depTimeL = scan.nextLine();
		System.out.println("landing time: (dd/MM/uuuu HH:mm)");
		String landTimeL = scan.nextLine();
		System.out.println("orgine of flight: ");
		String orginL = scan.next();
		System.out.println("destanation of flight: ");
		String destinationL = scan.next();
		port.addDeparture(airLineL, numFlightL, terminalL, depTimeL, landTimeL, orginL, destinationL);
		return true;

	default:
		System.out.println("you presed a wrong key try agine");
		return false;
	}
		

	}

public static boolean options(Airport port,int action, Scanner scan) {
	
	String temp1;
	String temp2;
	switch (action) {
	case 1:
		return addFlight(port, scan);
		
	case 2:
		System.out.println("please enter date: ");
		temp1 = scan.nextLine();
		System.out.println(port.toStringDeparturesByDepTime(temp1));
		return true;
	case 3: 
		System.out.println("please enter date: ");
		temp1 = scan.nextLine();
		System.out.println(port.toStringLandingsByDepTime(temp1));
		return true;
	case 4:
		System.out.println(port.toString());
		return true;
	case 5:
		System.out.println("please enter date from: ");
		temp1 = scan.nextLine();
		System.out.println("please enter date to: ");
		temp2 = scan.nextLine();
		System.out.println(port.toStringFromDateToDate(temp1, temp2));
		return true;
	case 6:
		System.out.println("please enterairline name: ");
		String airline = scan.nextLine();
		System.out.println(port.toStringByAirline(airline));
		return true;
	case 7:
		System.out.println("please enter destanation: ");
		temp1 = scan.next();
		System.out.println(port.toStringDeparturesByDest(temp1));
		return true;
	case 8:
		System.out.println("please enter destanation: ");
		temp1 = scan.next();
		System.out.println(port.toStringLandingsByDest(temp1));
		return true;
	case 9:
		System.out.println("please enter orgin: ");
		temp1 = scan.next();
		System.out.println(port.toStringDeparturesByOrgine(temp1));
		return true;
	case 10:
		System.out.println("please enter orgin: ");
		temp1 = scan.next();
		System.out.println(port.toStringLandingsByOrgine(temp1));
		return true;
	case 11:
	

	default:
		return false;
	}
}
	
}
