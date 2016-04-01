package Team_18.Homework;

public class Gold_Plan {

	private double _plan_rate = 49.95;
	private double _additional_line_rate = 14.5;
	private int _base_minute = 1000;
	private double _excess_minute_rate = 0.45;
	private int _family_discount_line = 5;
	private double _family_discount_line_rate = 5;
	
	public double base_rate(){
		return this._plan_rate;
	}
	
	public double calc_additional_lines_rate(int line){
		if(line < this._family_discount_line)
			return line * this._additional_line_rate;
		else
			return (this._family_discount_line-1)*this._additional_line_rate +
					(line - this._family_discount_line + 1) * this._family_discount_line_rate;
	}
	
	public double calc_excess_minute(int minute){
		if(minute <= this._base_minute)
			return 0;
		else
			return (minute - this._base_minute) * this._excess_minute_rate;
	}
	
	
	
}