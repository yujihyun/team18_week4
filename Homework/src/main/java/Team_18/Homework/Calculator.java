package Team_18.Homework;

public class Calculator {

	private String _plan;
	private int _minute;
	private int _number_of_line;
	
	/**
	 * 
	 * @param String plan
	 * @param int minute
	 * @param int lines
	 */
	public Calculator(String plan, int minute, int lines){
		this._plan = plan;
		this._minute = minute;
		this._number_of_line = lines;
	}
	
	public double calculate(){
		if(this._plan != null){
			if(this._plan.equals("gold")||this._plan.equals("Gold")){
				Gold_Plan plan = new Gold_Plan();
				return plan.base_rate() + plan.calc_additional_lines_rate(_number_of_line) + plan.calc_excess_minute(_minute);
			}
			if(this._plan.equals("silver")||this._plan.equals("Silver")){
				Silver_Plan plan = new Silver_Plan();
				return plan.base_rate() + plan.calc_additional_lines_rate(_number_of_line) + plan.calc_excess_minute(_minute);
			}
		}
		return -1;
	}
}
