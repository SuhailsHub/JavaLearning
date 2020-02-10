package design_pattern.factory_pattern;

public abstract class Eb {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int unit) {
		System.out.println(unit*rate);
	}
}
