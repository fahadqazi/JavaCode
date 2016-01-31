import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);

		AirportManager manager = new AirportManager(reader);
		manager.start();
	}
}