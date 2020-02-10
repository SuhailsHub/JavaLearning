package design_pattern.factory_pattern;

public class Plans {
	Eb getPlan(String plan ) {
		if(plan == null) {
			return null;
		}
		if(plan.equalsIgnoreCase("commercial")) {
			return new Commercial();
		}
		else if(plan.equalsIgnoreCase("Domastic")) {
			return new Domastic();
		}
		else if(plan.equalsIgnoreCase("Institution")) {
			return new Institution();
		}
		return null;
	}
}
