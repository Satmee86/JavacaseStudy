package junitTest;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import autoquote.Coverage;

public class Testquotepremium {
	
	@Test
	public void test() {
		
		Coverage p = new Coverage();
		p.setCoveragetype("Liability");
		p.setVehusageType("Personal");
		p.setLiabilitycoverage("5000");
		assertEquals("10",p.quotedPrem());
				
	}
}
