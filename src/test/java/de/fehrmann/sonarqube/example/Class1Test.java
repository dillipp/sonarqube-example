/**
 * 
 */
package de.fehrmann.sonarqube.example;

import junit.framework.TestCase;

/**
 * @author phili
 *
 */
public class Class1Test extends TestCase {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test method for {@link de.fehrmann.sonarqube.example.Class1#main(java.lang.String[])}.
	 */
	public void testMain() {
		String args[] = {"C:\\password.txt", "18"};
		Class1.main(args);
	}

}
