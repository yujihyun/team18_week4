package Team_18.Homework;

public class Display {
	// 회선수, 통화량, 등급
		private int _LineNum, _MinUsed;
		private String _Plan;
		private Double _ResultBill;
		
		// 등급, 통화량, 회선수 순으로 입력
		public Display(String InputPlan, int InputMinUsed, int InputLineNum) {
			this._LineNum = InputLineNum;
			this._MinUsed = InputMinUsed;
			this._Plan = InputPlan;
		}
		
		//setter
		public void setLineNum(int input){ this._LineNum = input; }
		public void setMinUsed(int input){ this._MinUsed = input; }
		public void setPlan(String input){ this._Plan = input; }
		public void setResultBill(Double input){ this._ResultBill = input; }
		//getter
		public int getLineNum(){ return this._LineNum; }
		public int getMinUsed(){ return this._MinUsed; }
		public String getPlan(){ return this._Plan; }
		public Double getResultBill(){ return this._ResultBill; }
		

		public void DisplayResult(){
			Calculator cal = new Calculator(this._Plan, this._MinUsed, this._LineNum);
			setResultBill(cal.calculate());
			
			System.out.println("Plan : " + getPlan());
			System.out.println("Minutes Used : " + getMinUsed());
			System.out.println("Number Of Lines : " + getLineNum());
			System.out.println("Expected Bill : " + getResultBill());
		}
		

		
		
		
}
