package team18.week4;

public class Display {
	// 회선수, 통화량, 등급
		private int lineNum;
		private int minUsed;
		private String plan;
		private Double resultBill;
		
		// 등급, 통화량, 회선수 순으로 입력
		public Display(String inputPlan, int inputMinUsed, int inputLineNum) {
			this.lineNum = inputLineNum;
			this.minUsed = inputMinUsed;
			this.plan = inputPlan;
		}
		
		//setter
		public void setLineNum(int input){ this.lineNum = input; }
		public void setMinUsed(int input){ this.minUsed = input; }
		public void setPlan(String input){ this.plan = input; }
		public void setResultBill(Double input){ this.resultBill = input; }
		//getter
		public int getLineNum(){ return this.lineNum; }
		public int getMinUsed(){ return this.minUsed; }
		public String getPlan(){ return this.plan; }
		public Double getResultBill(){ return this.resultBill; }
		

		public void displayResult(){
			Calculator cal = new Calculator(this.plan, this.minUsed, this.lineNum);
			setResultBill(cal.calculate());
			
			System.out.println("Plan : " + getPlan());
			System.out.println("Minutes Used : " + getMinUsed());
			System.out.println("Number Of Lines : " + getLineNum());
			System.out.println("Expected Bill : " + getResultBill());
		}
		

		
		
		
}
