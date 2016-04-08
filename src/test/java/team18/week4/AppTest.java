package team18.week4;

import static org.junit.Assert.*;

import org.junit.Test;



public class AppTest {
	
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
}
