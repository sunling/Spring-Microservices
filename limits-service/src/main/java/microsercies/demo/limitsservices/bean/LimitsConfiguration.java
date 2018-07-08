package microsercies.demo.limitsservices.bean;

public class LimitsConfiguration {
	
	private int maximum;
	private int minimum;
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public LimitsConfiguration() {
		
	}
	
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
	

}
