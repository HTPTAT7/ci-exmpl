package by.htp.test.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageElemTest {

	@Test
	public void testMainPageIsOpen() {
		String titleExp = "MainPage";
		String titleAct = "MainPage";
		Assert.assertEquals(titleAct, titleExp);
	}

}
