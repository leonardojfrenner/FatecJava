package entities;

public class Student {
	public String name;
	public double firstQuarter;
	public double secondQuarter;
	public double thirdQuarter;
	public double finalGrade;
	public String result;
	
	public void finalGrade() {
		finalGrade = firstQuarter + secondQuarter + thirdQuarter;
		if(finalGrade > 60.0) {
			result = "PASS";
		} else {
			double aux = 60.0 - finalGrade;
			result = "FAILED\nMISSING " + String.format("%.2f", aux) +" POINTS"; 
			
		}
			
	}
	
	public String toString() {
		return "Final Grade = "
				+ String.format("%.2f", finalGrade)+ "\n" + result;
	}
}
