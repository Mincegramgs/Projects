package Radio;

public class FMRadioStation{
	private String callsign;
	private float frequency;
	
	public FMRadioStation(String callsign, float frequency) throws FMRadioStationException {
		if(callsign.length()==4 && (callsign.startsWith("A") || callsign.startsWith("K") || callsign.startsWith("N") || callsign.startsWith("W")))
		{
			for (int i=0; i<callsign.length(); i++)
			{
				if (Character.isLowerCase(callsign.charAt(i)))
				{
					throw new FMRadioStationException(callsign, frequency);
				}
			}
		}
		if(frequency < 88.0 || frequency > 108.0)
			throw new FMRadioStationException(callsign, frequency);
	}

	public String getCallsign() {
		return callsign;
	}

	public float getFrequency() {
		return frequency;
	}
	public void setCallsign(String callsign) {
		this.callsign= callsign;
	}
	public void getFrequency(float frequency) {
		this.frequency= frequency;
		
	}
	@Override
	public String toString() {
		return "FMRadioStation [callSign=" + callsign + ", frequency=" + frequency + "]";
	}
}
