package phonerate;

public class Gold {
	private double goldrateperadditionalminute = 0.45;
	private int goldincludedminutes = 1000;
	private double goldrateperadditionalline = 14.50;
	private double goldplanrate = 49.95;
	
	public double rateperadditionalminute() {
		return goldrateperadditionalminute;
	}
	public int includedminutes() {
		return goldincludedminutes;
	}
	public double rateperadditionalline() {
		return goldrateperadditionalline;
	}
	public double planrate() {
		return goldplanrate;
	}
}
