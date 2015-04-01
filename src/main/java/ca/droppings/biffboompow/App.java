package ca.droppings.biffboompow;



import ca.droppings.biffboompow.utils.*;
/**
 * A stupid class to start things off
 *
 */
public class App 
{
    final String CanaryString = "eYe YaM Ear";
    
	public static void main( String[] args )  {
		App bob = new App();
		AppProperties bobProperties = new AppProperties();
		System.out.println(bob.getCanaryString());
		System.out.println(System.getProperty("biffboompow.config.canary"));
    }
    public String getCanaryStringReverse() {
    	String reverseCanaryString = new StringBuffer(CanaryString).reverse().toString();
    	return reverseCanaryString;
    }
    public String getCanaryString() {
    	return CanaryString;
    }
    public String getCanaryStringUpperCase() {
    	return CanaryString.toUpperCase();
    }
    public String getCanaryStringLowerCase() {
    	return CanaryString.toLowerCase();
    }
}
