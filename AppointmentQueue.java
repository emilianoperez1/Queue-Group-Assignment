package assignmentcs131;
import java.util.Arrays;

public class AppointmentQueue {
	private Appointment[] appointments;
    private int size;
    private int capacity;
    
    public AppointmentQueue() {
        capacity = 5;
        appointments = new Appointment[capacity];
        size = 0;
    }

    public void push(Appointment appointment) {
    	if (size == appointments.length) {
            appointments = Arrays.copyOf(appointments, size * 2);
        }
        appointments[size++] = appointment;
    }

    public Appointment pop() {
        if (size == 0) {
            return null;
        }
        Appointment earliest = appointments[0];
        for (int i = 1; i < size; i++) {
            appointments[i - 1] = appointments[i];
        }
        size--;
        return earliest;
    }
	
	public boolean isEmpty() {
        return size == 0;
	}

}
