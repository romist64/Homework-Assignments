package javaHomework6_1_Proj;

public class Flight{
	private String name;
	private int flightNo;
	private String origin;
	private int passenger;
	private String cargo;
	public Flight(String shuttleName, String cityStateOrigin, String cargoType, int missionNumber, int numPassengers){
		name = shuttleName;
		flightNo = missionNumber;
		origin = cityStateOrigin;
		passenger = numPassengers;
		cargo = cargoType;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setOrigin(String cityState) {
		origin = cityState;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setCargo(String cargoType) {
		cargo = cargoType;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setMissions(int missions) {
		flightNo = missions;
	}
	
	public int getMissions() {
		return flightNo;
	}
	
	public void incrementMissions() {
		flightNo++;
	}
	
	public void setPassengers(int numPassengers) {
		passenger = numPassengers;
	}
	
	public int getPassengers() {
		return passenger;
	}
	
	public String getManifest() {
		return "Shuttle Name: "+name+"\nOrigin: "+origin+"\nMissions Completed: "+flightNo+"\nPassengers: "+passenger+"\nCargo: "+cargo;
	}
	
}