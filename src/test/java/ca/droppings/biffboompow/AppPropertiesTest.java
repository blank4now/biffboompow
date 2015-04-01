package ca.droppings.biffboompow;

import java.util.Properties;

import org.junit.Assert;
import org.junit.Test;

import ca.droppings.biffboompow.utils.AppProperties;

public class AppPropertiesTest {


	@Test
	public void testAddProperties1() {
		AppProperties appObject = new AppProperties("src/main/resources/config/default.properties");
		Assert.assertEquals(System.getProperty("biffboompow.config.canary"), "EarEyeYam");
		Assert.assertEquals(System.getProperty("biffboompow.config.vandals"), "tookTheHandle");
	}
}