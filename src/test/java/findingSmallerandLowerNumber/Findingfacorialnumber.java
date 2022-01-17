package findingSmallerandLowerNumber;

public class Findingfacorialnumber {

	public static void main(String[] args) {
		Findingfacorialnumber gf = new Findingfacorialnumber();
		System.out.println(gf.getfactorial(5));
		System.out.println(gf.getfactorial(10));
		System.out.println(gf.getfactorial(3));
		
	}

	public int getfactorial(int num) {
		int fact = 1;
		for (int i =1;i<= num;i++) {
			fact = fact * i ;
		}
		return fact;
	}
	
	
	
	
}
