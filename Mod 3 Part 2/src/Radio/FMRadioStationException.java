package Radio;

@SuppressWarnings("serial")
public class FMRadioStationException extends Exception {
	
	public FMRadioStationException(String callsign, float frequency) {
		super("\nInvalid Call sign and/or exception");
		
	}
	
}
