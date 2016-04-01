package team18.week4;

public class Calculator {

	private String plan;
	private int minute;
	private int numberOfLine;
	
	/**
	 * 
	 * @param String plan
	 * @param int minute
	 * @param int lines
	 */
	public Calculator(String plan, int minute, int lines){
		this.plan = plan;
		this.minute = minute;
		this.numberOfLine = lines;
	}
	
	public double calculate(){
		Plan plan;
		
		if("gold".equals(this.plan)||"Gold".equals(this.plan)){
			plan = new GoldPlan();
			return plan.base_rate() + plan.calcAdditionalLinesRate(numberOfLine) + plan.calcExcessMinute(minute);
		}
		if("silver".equals(this.plan)||"Silver".equals(this.plan)){
			plan = new SilverPlan();
			return plan.base_rate() + plan.calcAdditionalLinesRate(numberOfLine) + plan.calcExcessMinute(minute);
		}
		
		return -1;
	}
}
