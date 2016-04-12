package team18.week4;

import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest {
	Display display1 = new Display("Gold", 800,3);
	Display display2 = new Display();
	
	private static final double DELTA = 1e-15;
	
	@Test
    public void testCalculator() {
    	
    	Plan planGold = new GoldPlan();
    	Plan planSilver = new SilverPlan();
    	
    	assertEquals(planGold.calcAdditionalLinesRate(4), 4 * 14.5, DELTA);
    	assertEquals(planGold.calcAdditionalLinesRate(6), (4 * 14.5)+(2 * 5), DELTA);
    	
    	assertEquals(planGold.calcExcessMinuteRate(1100), 100*0.45,DELTA);
    	assertEquals(planGold.calcExcessMinuteRate(1010), 10*0.45,DELTA);
    	assertEquals(planGold.calcExcessMinuteRate(999), 0,DELTA);
    	
    	assertEquals(planSilver.calcAdditionalLinesRate(4), 4 * 21.5, DELTA);
    	assertEquals(planSilver.calcAdditionalLinesRate(6), (4 * 21.5)+(2 * 5), DELTA);
    	
    	assertEquals(planSilver.calcExcessMinuteRate(600), 100*0.54,DELTA);
    	assertEquals(planSilver.calcExcessMinuteRate(510), 10*0.54,DELTA);
    	assertEquals(planSilver.calcExcessMinuteRate(499), 0,DELTA);
    }
	

	@Test
	public void testSetLineNum(){
		System.out.println("Test SetLineNum()");
		display2.setLineNum(4);
	}
	@Test
	public void testSetMinUsed(){
		System.out.println("Test SetMinUsed()");
		display2.setMinUsed(900);
	}
	@Test
	public void testSetPlan(){
		System.out.println("Test setPlan()");
		display2.setPlan("Silver");
	}
	@Test
	public void testGetMinUsed(){
		System.out.println("Test GetMinUsed()");
		display1.getMinUsed();
	}
	@Test
	public void testGetPlan(){
		System.out.println("Test GetPlan()");
		display1.getPlan();
	}
	@Test
	public void testGetResultBill(){
		System.out.println("Test GetResultBill()");
		display1.getResultBill();
	}
	@Test
	public void testDisplayResult(){
		System.out.println("Test displayResult()");
		display1.displayResult();
	}
}
