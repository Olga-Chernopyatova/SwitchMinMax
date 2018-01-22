package MinMaxPack;

public class MinMax {

	public static void main(String[] args) {
	      int[] myNumbs = {-7, 14, 11, 0, 28, 10, -77, 101, -12, -1, 85, 3, 1, 6, 12, -43, -33, 44, 51, -2};
	 	      
	      int max = myNumbs[0];
	      int maxi = 0;
	     
	      int min = myNumbs[0];
	      int mini = 0;
	      
	      for (int i = 0; i < myNumbs.length; i++) {
	            if (myNumbs[i] > max) {
	                max = myNumbs[i];
	                maxi = i;
	            if(myNumbs[i] < min) 
	                  min = myNumbs[i];
	                  mini = i;
	      }
		        System.out.println("Максимальное число: " + maxi);
		        System.out.println("Минимальное число: " + mini);  
		        
	            int temp = myNumbs[max];
	            myNumbs[max] = myNumbs[min];
	            myNumbs[min] = temp;
	            
	        System.out.println("Максимальное число: " + maxi);
	        System.out.println("Минимальное число: " + mini);    

	}

}
	}
