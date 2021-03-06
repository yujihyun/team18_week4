package team18.week4;

public class Plan {

	double planRate;
	double additionalLineRate;
	int baseMinute;
	double excessMinuteRate ;
	int familyDiscountLine ;
	double familyDiscountLineRate;
	
	public double base_rate(){
		return this.planRate;
	}
	
	public double calcAdditionalLinesRate(int line){
		if(line < this.familyDiscountLine)
			return line * this.additionalLineRate;
		else
			return (this.familyDiscountLine-1)*this.additionalLineRate +
					(line - this.familyDiscountLine + 1) * this.familyDiscountLineRate;
	}
	
	public double calcExcessMinuteRate(int minute){
		if(minute <= this.baseMinute)
			return 0;
		else
			return (minute - this.baseMinute) * this.excessMinuteRate;
	}

}
