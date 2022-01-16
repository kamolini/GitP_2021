package aBc;

public abstract class B {

	public static void main(String[] args) {
		
		
		A a=new A() {
		
			public void sum() {
				System.out.println("overriden");
				
			}
			
		};
		
		
		

		a.sum();//from class B. After making object of class A.
		a.sum1();//print from A abstract class
		}
	}

