package math;

public class FixedValue {
	//cannot be access without instantiation
	public float PI = 3.14f;
	public float E = 2.718f;
	
	//can be accessed without instantiation
	public static final float PIe = 3.14f; 		
	
	
	/*
	 * 	 NON accessMod (used for security)
	 * 		(constant methods and variables) 
	 * 		final (variable cannot be assigned/changed anymore) SHOULD BE CAPITALIZED
	 * 		static (to enable access of a method or variable without instantiation)
	 * 				for methods and variables only
	 * 
	 * 		(for Classes)
	 * 		abstract
	 * 
	 * 		transient
	 * 		synchronized
	 * 		volatile
	 */
}
