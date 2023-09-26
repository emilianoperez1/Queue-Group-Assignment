package assignmentcs131;

public class Appointment {
	private String customerName;
	private String appointmentReason;
	private String time;
	
	public Appointment(String customerName, String appointmentReason, String time) {
		this.customerName = customerName;
		this.appointmentReason = appointmentReason;
		this.time = time;
	}
	
	public String getName() {
        return customerName;
    }
	
	public String getReason() {
        return appointmentReason;
    }
	
	public String getTime() {
	    return time;
	}
	
	 @Override
	    public String toString() {
	        return String.format("Name: %s, Reason: %s, Time: %s", customerName, appointmentReason, time);
	    }

}
