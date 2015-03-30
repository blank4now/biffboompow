package ca.droppings.biffboompow;

/**
 * A stupid class to start things off
 *
 */
public class App 
{
    final String CanaryString = "eYe YaM Ear";
    
	public static void main( String[] args )  {
		App bob = new App();
		System.out.println(bob.getCanaryString());
		
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
