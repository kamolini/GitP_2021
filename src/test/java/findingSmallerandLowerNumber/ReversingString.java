package findingSmallerandLowerNumber;

public class ReversingString {

	public static void main(String[] args) {
    String st = "HEY HOW R U";
   String s []	= st.split(" ");
    	String sum = "";	
		
	for(int i = s.length-1; i>=0; i--) {
		sum = sum + s[i];
	}
	System.out.println("reverse value is: " + sum);
	}

}
