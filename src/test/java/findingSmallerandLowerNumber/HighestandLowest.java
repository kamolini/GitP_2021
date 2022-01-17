package findingSmallerandLowerNumber;

public class HighestandLowest {

	public static void main(String[] args) {
    int a []= {-3,34,24,52,3,5,87,2};
    int lowest = a[0];
    int highest = a[0];
    
    for(int i = 1;i <a.length;i++) {
    	if(a[i]<lowest) {
    		lowest=a[i];
    	}else if(a[i]>highest) {
    		highest=a[i];
    	}
    }
    	System.out.println("lowest number is: " + lowest);
    	System.out.println("highest number is: " + highest);
    
		
		
		
		
		
	}

}
