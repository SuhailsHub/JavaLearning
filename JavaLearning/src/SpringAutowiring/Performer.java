package SpringAutowiring;

public class Performer {

	private Instrument instrument;
	
	public Performer(Instrument ins) {
		this.instrument=ins;
	}
	public void play() {
		System.out.println(instrument.done());
	}
}
