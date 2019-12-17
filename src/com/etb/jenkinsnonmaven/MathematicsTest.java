package com.etb.jenkinsnonmaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathematicsTest {

	@Test
	void test() {
		assertEquals(8,Mathematics.add(3, 5));
	}

}
