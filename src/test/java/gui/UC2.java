package gui;

import static org.junit.Assert.*;

import org.junit.Test;

public class UC2 {

	@Test
	public void exclusionListCheck() {
		boolean expected = false;
		boolean actual = AnalysisFacade.passExclusionCheck("Afghanistan");
		assertEquals(expected, actual);
	}

}
