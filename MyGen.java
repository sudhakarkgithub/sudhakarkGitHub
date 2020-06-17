package project24;

import java.util.Arrays;
import java.util.List;

public class MyGen {


	   public static void main(String[] args)
	   {
	      //List of Integers
	      List<Integer> ints = Arrays.asList(1,2,3,4,5);
	      System.out.println(sum(ints));
	       
	      //List of Doubles
	      List<Double> doubles = Arrays.asList(1.5d,2d,3d);
	      System.out.println(sum(doubles));
	       
	      
	       
	   }
	    
	   //Method will accept 
	   private static Number sum (List<? extends Number> numbers){
	      double s = 0.0;
	      for (Number n : numbers) {
	         s += n.doubleValue(); // s = s+n.doubleValue()
	         
	         }
	      return s;
	   }

}

