package findingSmallerandLowerNumber;

public class IsPalindromeNumber {

	public static void main(String[] args) {
   	isPalindrome(151);
   	isPalindrome(152);
	}
	
	public static int isPalindrome(int number) {
		System.out.println("given number is " + number);
		
		int r;
		int n;
		n = number;
		int sum = 0;
		while (number>0) {
			 r = number%10;
			 sum = (sum*10)+ r;
			 number = number/10;
		
		}
		
		
		if(n == sum) {
			System.out.println("palindrome number");
		}else {
			System.out.println("not palindrome number");
		}
		return sum;
	
}
}
