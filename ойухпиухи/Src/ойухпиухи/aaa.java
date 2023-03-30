package oiuhpiuhi;
import java.util.*;
public class aaa {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[][] array = new int[3][3];
	int[][] prover = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int [] dlam = {1, 2, 3, 4, 5, 6, 7, 8, 9};  
	   for (int i = 0; i < array.length; i++) {
		     for (int j = 0; j < array[i].length; j++) {
		        array[i][j] = 0;
		     }
		   }
	  
	   for (int s = 0; s < 10; s++) { 
	     if (s % 2 == 0) {
	    	 System.out.println("Ходят крестики");
	    	 System.out.println("Введите номер поля");
	    	 int m = 0;
	    	 int t = 0;
			while ( t != 1) {	
	    	  m = sc.nextInt();
	    	  for (int c = 0; c < dlam.length; c++) { 
	    		 if(m == dlam[c]) {
	    			t = t + 1;
	    		 }
	    	  }
	    	  if (t != 1) {
    			 System.out.println("Поле занято. Введите номер поля заново");
    			 m = 0;
	    	  }
	    	}
	    	 for (int i = 0; i < array.length; i++) {
			     for (int j = 0; j < array[i].length; j++) {
			    	 if(m == prover[i][j] && array[i][j] == 0){
			    		array[i][j] = 1;
			    		for (int c = 0; c < dlam.length; c++) {
			    			if(prover[i][j] == dlam[c]) {
			    					 dlam[c] = 0;
			    			}
			    		}
			    	 } 
			     }
			   }
	    	 }
	  
	     if (s % 2 == 1) { System.out.println("Ходят нолики");
	     System.out.println("Введите номер поля");
	    	 int m = 0;
	    	 int t = 0;
	    	 while ( t != 1) {	
		    	  m = sc.nextInt();
		    	 for (int c = 0; c < dlam.length; c++) { 
		    		 if(m == dlam[c]) {
		    			t = t + 1;
		    		 }
		    	}
		    	 if (t != 1) {
	    			 System.out.println("Поле занято. Введите номер поля заново");
	    			 m = 0;
		    	 }
		    }
	    	 
	    	 for (int i = 0; i < array.length; i++) {
			     for (int j = 0; j < array[i].length; j++) {
			    	 if(m == prover[i][j] && array[i][j] == 0){
			    			 array[i][j] = 5;
			    			 for (int c = 0; c < dlam.length; c++) {
			    				 if(prover[i][j] == dlam[c]) {
			    					 dlam[c] = 0;
			    			 }
			    		 }
			    	 }
			     }
			   }
	    	 
	     }
	     for (int i = 0; i < array.length; i++) {  //j = 0; 
	    	      if (array[i][0] + array[i][1] + array[i][2] == 3)      
	    	           System.out.println("Победили крестики");
	    	      
	    	      if (array[i][0] + array[i][1] + array[i][2] == 15)      
	    	           System.out.println("Победили нолики");
	        }
	     
	    	    for (int j = 0; j < array.length; j++) {   //i = 0;
	    	      if (array[0][j] + array[1][j] + array[2][j] == 3)      
	    	           System.out.println("Победили крестики");
	    	      if (array[0][j] + array[1][j] + array[2][j] == 15)
	    	    	  System.out.println("Победили нолики");
	    	        }
	 
	    	      if (array[0][0] + array[1][1] + array[2][2] == 3)           //i = 0; //j = 0;    
	    	           System.out.println("Победили крестики"); 
	    	      if (array[2][0] + array[1][1] + array[0][2] == 3)      
	    	           System.out.println("Победили крестики");
	    	      if (array[0][0] + array[1][1] + array[2][2] == 15)      
	    	           System.out.println("Победили нолики"); 
	    	      if (array[2][0] + array[1][1] + array[0][2] == 15)      
	    	           System.out.println("Победили нолики");
	        
	    	      
		   for (int i = 0; i < array.length; i++) {  //System.out.println('Проверка');
			for (int j = 0; j < array[i].length; j++) { //1 2 3 4 5 6 7 8 9
			   	if(array[i][j] == 0) {
					System.out.print("_" + "\t");
				}
				if(array[i][j] == 1) {
					System.out.print("X" + "\t");
				}
				if(array[i][j] == 5) {
					System.out.print("0" + "\t");
				}
				}
				System.out.println();
			}
	   }
	        

	      for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) { //1 2 3 4 5 6 7 8 9
					System.out.print(array[i][j] + "\t");
				}
				System.out.println();
			}

		}
}
