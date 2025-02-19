package math;

public class Arithmetic {
	
	public static int add(int i, int j) { 
		//can be accessed without instantiation
		return i + j;
	}
	
	public int sub(int i, int j) {
		//cannot be access without instantiation
		return i - j;
	}
	
	static void main(String[] args) {

	}
	/* 
	 * ANATOMY: 
	 methodAccessModifier methodType returnType methodName(parameters) {}
	 
	 accessMod (controls where you can access methods, variables and classes) 
	 
	 accessMod for class (2), 
		 default(accessed within the same package) 
		 public
	  
	  
	 accessMod Variables and methods
	 	default (int num)
	 	public 
	 	private (access within own classes)
	 	protected (for OOP later) (same package and subClasses)
	 */
}
