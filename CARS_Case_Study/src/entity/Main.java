package entity;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IncidentDAO incidentDAO = new IncidentDAO();
        Scanner scanner = new Scanner(System.in);
        
        // Gather input from the user
        System.out.print("Enter incident type: ");
        String incidentType = scanner.nextLine();
        
        System.out.print("Enter location: ");
        String location = scanner.nextLine();
        
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        
        System.out.print("Enter victim ID: ");
        int victimID = scanner.nextInt();
        
        System.out.print("Enter suspect ID: ");
        int suspectID = scanner.nextInt();
        
        // Create a new incident with the user input
        Incident newIncident = new Incident(0, incidentType, new Date(), location, description, "Open", victimID, suspectID);
        
        // Insert the incident
        if (incidentDAO.insertIncident(newIncident)) {
            System.out.println("Incident inserted successfully!");
        } else {
            System.out.println("Failed to insert incident.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
