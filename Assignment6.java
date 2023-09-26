package assignmentcs131;
import java.io.File;
import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		// Step 1
        AppointmentQueue appointmentQueue = new AppointmentQueue();
		
		// Read in appointments and add each Appointment to AppointmentQueue
		try {
			File file = new File("DMV_Appointments.txt");
			Scanner scnr = new Scanner(file);
			
			while (scnr.hasNextLine()) {
				String line = scnr.nextLine();
				String[] tokens = line.split(",");
				
				String name = tokens[0].trim();
                String reason = tokens[1].trim();
                String time = tokens[2].trim();
                
                Appointment appointment = new Appointment(name, reason, time);
                appointmentQueue.push(appointment);
			}

			scnr.close();
		}
		
		catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}

		// Steps 2-4
		Scanner scanner = new Scanner(System.in);
		
		while (!appointmentQueue.isEmpty()) {
			// Implement the logic to prompt the user and process appointments here
        }

        scanner.close();

		
	}

}
