package SpringAutowiring;

public class Instrument {
	private String instrument;

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	public String done() {
		return instrument;
	}
}
