import java.util.Scanner;
import java.util.ArrayList;

public class AirportManager{
	private Scanner reader;
	private ArrayList<Airplane> planes;
	private ArrayList<Flight> flights;

	public AirportManager(Scanner reader){
		this.reader = reader;
		this.planes = new ArrayList<Airplane>();
		this.flights = new ArrayList<Flight>();
	}

	public void start(){
		airportPanel();
		flightService();
	}

	private void airportPanel(){
		while(true){
		System.out.println("Airport panel");
		System.out.println("--------------------");
		System.out.println("");
		System.out.println("Choose operation:");
		System.out.println("[1] Add Airplane");
		System.out.println("[2] Add Flight");
		System.out.println("[x] Exit");
		String input = reader.nextLine();

		if(input.equals("1")){
			addPlane();
		}else if(input.equals("2")){
			addFlight();
		}else{
			System.out.println("");
			break;
		}
	}
	}

		private void addPlane(){
			System.out.println("Give Plane ID: ");
			String planeID = reader.nextLine();
			System.out.println("Give plane capacity: ");
			int planeCapacity = Integer.parseInt(reader.nextLine());
			planes.add(new Airplane(planeID, planeCapacity));
		}

		private void addFlight(){
			System.out.println("Give plane ID");
			String planeID = reader.nextLine();
			System.out.println("Give departure airport code: ");
			String departureCode = reader.nextLine();
			System.out.println("Give destination airport code: ");
			String destinationCode = reader.nextLine();
			flights.add(new Flight(getById(planeID),departureCode,destinationCode));

		}

		private Airplane getById(String id){
			//Airplane found;
			for(Airplane plane: planes){
				if(id.equals(plane.getId())){
					return plane;
				}
			}
			return null;
		}

	private void flightService(){
		while(true){
		System.out.println("Flight Service");
		System.out.println("----------------------");
		System.out.println("");
		System.out.println("Choose operation");
		System.out.println("[1] Print Planes");
		System.out.println("[2] Print Flights");
		System.out.println("[3] Print Plane Info");
		System.out.println("[x] Quit");

		String input = reader.nextLine();

		if(input.equals("1")){
			printPlanes();
		}else if(input.equals("2")){
			printFlights();
		}else if(input.equals("3")){
			printPlaneInfo();
		}else{
			break;
		}
	}
	}

		private void printPlanes(){
			for(Airplane plane: planes){
				System.out.println(plane);
			}
		}

		private void printFlights(){
			for(Flight flight: flights){
				System.out.println(flight);
			}
		}

		private void printPlaneInfo(){
			System.out.println("Give plane ID: ");
			String planeID = reader.nextLine();
			System.out.println(getById(planeID));
		}
}

















