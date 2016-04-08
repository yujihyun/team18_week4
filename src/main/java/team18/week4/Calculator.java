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
		Plan userPlan;
		
		if("gold".equals(this.plan)||"Gold".equals(this.plan)){
			userPlan = new GoldPlan();
			return userPlan.base_rate() + userPlan.calcAdditionalLinesRate(numberOfLine) + userPlan.calcExcessMinuteRate(minute);
		}
		if("silver".equals(this.plan)||"Silver".equals(this.plan)){
			userPlan = new SilverPlan();
			return userPlan.base_rate() + userPlan.calcAdditionalLinesRate(numberOfLine) + userPlan.calcExcessMinuteRate(minute);
		}
		
		return -1;
	}
}
