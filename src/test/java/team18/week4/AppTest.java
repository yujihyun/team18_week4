package team18.week4;

import org.junit.Test;

/**
 * Created by tchi on 2016. 4. 4..
 */
public class AppTest {
    @Test
    public void testCalculator() {
    	
    	Calculator testGoldPlan = new Calculator("gold", 1010, 3);
    	Calculator testSilverPlan = new Calculator("silver", 999, 6);
    	
    	testGoldPlan.calculate();
    	testSilverPlan.calculate();
    	
    }
}
