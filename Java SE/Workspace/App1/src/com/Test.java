package com;

class Dept{
	static String deptName="Accounts";
	
	static void display() {
		System.out.println("Dept name: "+deptName);
	}
	
}
public class Test {
	
	// class contains
	/*
	 * 1. instance data
	 * 2. non instance or static data
	 * 3. constructor -> instance
	 * 
	 * static data
	 * ------------
	 * -> sharable to all the objects
	 * ex: managerName, projectName, companyName
	 * 
	 * -> static data can be accessble from every methods in in the 
	 *    same class.
	 *    if static data is available in another class, then we 
	 *    should access it with class name.static method or variable
	 *    
	 *    Ex: 
	 *    class Dept{
	 *    static String deptName="HR";
	 *    static void test(){
	 *      System.out.println(deptName);
	 *    }
	 *    
	 *    void display(){
	 *    System.out.println(deptName);
	 *    
	 *    }
	 *    
	 *    class Use{
	 *    System.out.println( Dept.deptName);
	 *    System.out.println( Dept.test() );
	 *    Dept.display();
	 *    
	 *    }
	 * 
	 * non static / instance data
	 * -----------------------------
	 * -> data available to individual objects. can not share
	 *    common data
	 *  -> instance data can be accessed directly only from
	 *     non static methods/ instance methods
	 *  -> static method can  not access instance data directly
	 *  
	 *  
	 *  What context should we create object?
	 *  ---------------------------------------
	 *  -> To access non static data from a static methods,
	 *  -> To access non static data from nothwr classes
	 *  
	 *  
	 */
	
	static String managerName="James";
	String empName="Praveen"; // non static -> intance data
	
	static int a=98;
	static void f1() {
		// f1 need Test class object to access b varaible
		Test t=new Test();
		System.out.println("Static Data: A: "+a);
		System.out.println(t.b);
	}
	
	int b=98;
	void f2() {
		System.out.println(managerName);
		System.out.println(b);
	}
	

	public static void main(String[] args) { // main -> CTRL + space
		
		Test t=new Test();
		t.b=1999;
		Test t2=new Test();
		t2.b=2999;
		t.f2(); // 1999
		t2.f2(); // 2999
		
		System.out.println("-----------");
		f1(); // calling static data with object not recamended. 
		a=78;
		f1();
		
		
		System.out.println(Dept.deptName);
		Dept.display();
		
		System.out.println("--- Welcome"); // syso -> CTRL + space
		System.out.println(managerName);
	}

}
