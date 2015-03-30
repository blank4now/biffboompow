package ca.droppings.biffboompow;

import org.junit.Assert;

import org.junit.Test;

public class AppTest {

   @Test
   public void testApp1() {
      App appObject = new App();
      Assert.assertEquals(appObject.getCanaryString(), "eYe YaM Ear");
   }
   @Test
   public void testAppl2() {
	   App appObject = new App();
	   Assert.assertEquals(appObject.getCanaryStringUpperCase(), "EYE YAM EAR");
   }
   @Test
   public void testAppl3() {
	   App appObject = new App();
	   Assert.assertEquals(appObject.getCanaryStringLowerCase(), "eye yam ear");
   }
   @Test
   public void testAppl4() {
	   App appObject = new App();
	   Assert.assertEquals(appObject.getCanaryStringReverse(), "raE MaY eYe");
   }
}