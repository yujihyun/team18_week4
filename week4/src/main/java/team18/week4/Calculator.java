package team18.week4;

public class Calculator {

	private String plan;
	private int minute;
	private int number_of_line;
	
	/**
	 * 
	 * @param String plan
	 * @param int minute
	 * @param int lines
	 */
	public Calculator(String plan, int minute, int lines){
		this.plan = plan;
		this.minute = minute;
		this.number_of_line = lines;
	}
	
	public double calculate(){
		
		if("gold".equals(this.plan)||"Gold".equals(this.plan)){
			GoldPlan plan = new GoldPlan();
			return plan.base_rate() + plan.calc_additional_lines_rate(number_of_line) + plan.calc_excess_minute(minute);
		}
		if("silver".equals(this.plan)||"Silver".equals(this.plan)){
			SilverPlan plan = new SilverPlan();
			return plan.base_rate() + plan.calc_additional_lines_rate(number_of_line) + plan.calc_excess_minute(minute);
		}
		
		return -1;
	}
}
