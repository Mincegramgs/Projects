package Radio;


public class GenerateRadioStations {
	public static void RadioMain(String[] args) {
		 FMRadioStation[] radioSt = new FMRadioStation[8];

	        try {
	            radioSt[0] = new FMRadioStation("Good", 32.5f);
	            radioSt[1] = new FMRadioStation("MORN", 98.7f);
	            radioSt[2] = new FMRadioStation("WXYZ", 107.3f);
	            radioSt[3] = new FMRadioStation("ABC", 104.9f);
	            radioSt[4] = new FMRadioStation("WLMN", 90.2f);
	            radioSt[5] = new FMRadioStation("DIFP", 86.1f);
	            radioSt[6] = new FMRadioStation("FINE", 548.5f);
	            radioSt[7] = new FMRadioStation("WXYZ", 125.0f);
	        } catch (FMRadioStationException frse) {
	            System.out.println(frse.getMessage());
	        }
	        System.out.println("	Radio Station List	");
	        for(FMRadioStation rs: radioSt)
			{
				System.out.println(rs.toString());
			}
	      
	}
}
