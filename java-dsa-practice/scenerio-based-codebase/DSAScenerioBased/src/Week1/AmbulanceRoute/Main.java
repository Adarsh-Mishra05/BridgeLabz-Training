package Week1.AmbulanceRoute;

	public class Main {
	    public static void main(String[] args) {

	    	Ambulanceroute route = new Ambulanceroute();

	        route.addUnit("Emergency");
	        route.addUnit("Radiology");
	        route.addUnit("Surgery");
	        route.addUnit("ICU");

	        route.setAvailability("Emergency", false);
	        route.setAvailability("Radiology", false);

	        route.sendPatient();   

	        route.removeUnit("ICU");

	        route.sendPatient();   
	    }
	

}
