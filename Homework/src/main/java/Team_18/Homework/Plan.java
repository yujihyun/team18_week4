package Team_18.Homework;

public class Plan {

	double plan_rate;
	double additional_line_rate;
	int base_minute;
	double excess_minute_rate ;
	int family_discount_line ;
	double family_discount_line_rate;
	
	public double base_rate(){
		return this.plan_rate;
	}
	
	public double calc_additional_lines_rate(int line){
		if(line < this.family_discount_line)
			return line * this.additional_line_rate;
		else
			return (this.family_discount_line-1)*this.additional_line_rate +
					(line - this.family_discount_line + 1) * this.family_discount_line_rate;
	}
	
	public double calc_excess_minute(int minute){
		if(minute <= this.base_minute)
			return 0;
		else
			return (minute - this.base_minute) * this.excess_minute_rate;
	}

}
