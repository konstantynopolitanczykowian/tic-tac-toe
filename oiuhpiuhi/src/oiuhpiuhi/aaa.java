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
	    	 
	    	 int m = 10;
			while ( m != 0) {
	    	  m = sc.nextInt();
	    	 for (int c = 0; c < dlam.length; c++) {
	    		 int t = 9;
	    		 if(m != dlam[c]) {
	    			t = t - 1;
	    		 }
	    		 if (t == 0) {
	    			 m = 0;
	    			 System.out.println("Поле занято. Введите номер поля заново");
	    		 }  
	    	 }
	    	}
	    	 for (int i = 0; i < array.length; i++) {
			     for (int j = 0; j < array[i].length; j++) {
			    	 if(m == prover[i][j]){
			    		 if(array[i][j] == 0){
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
	    	 }
	    	 else { System.out.println("Ходят нолики");
	    	 System.out.println("Введите номер поля");
	    	 
	    	 int m = 10;
				while ( m != 0) {
		    	  m = sc.nextInt();
		    	 for (int c = 0; c < dlam.length; c++) {
		    		 int t = 9;
		    		 if(m != dlam[c]) {
		    			t = t - 1;
		    		 }
		    		 if (t == 0) {
		    			 m = 0;
		    			 System.out.println("Поле занято. Введите номер поля заново");
		    		 }  
		    	 }
		    	}
	    	 
	    	 for (int i = 0; i < array.length; i++) {
			     for (int j = 0; j < array[i].length; j++) {
			    	 if(m == prover[i][j]){
			    		 if(array[i][j] == 0){
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
	    	 
	     }
	     for (int i = 0; i < array.length; i++) {
	            int j = 0; 
	    	      if (array[i][j] + array[i][j + 1] + array[i][j + 2] == 3)      
	    	           System.out.println("Победили крестики");
	    	      if (array[i][j] + array[i][j + 1] + array[i][j + 2] == 15)      
	    	           System.out.println("Победили нолики");
	        }
	    	    for (int j = 0; j < array.length; j++) {
	    	    	int i = 0;
	    	      if (array[i][j] + array[i + 1][j] + array[i + 2][j] == 3)      
	    	           System.out.println("Победили крестики");
	    	      if (array[i][j] + array[i + 1][j] + array[i + 2][j] == 15)
	    	    	  System.out.println("Победили нолики");
	    	        }
	        for (int i = 0; i < array.length; ) {
	    	    int j = 0;  
	    	      if (array[i][j] + array[i + 1][j + 1] + array[i + 2][j + 2] == 3)      
	    	           System.out.println("Победили крестики"); 
	    	      if (array[i + 2][j] + array[i + 1][j + 1] + array[i][j + 2] == 3)      
	    	           System.out.println("Победили крестики");
	    	      if (array[i][j] + array[i + 1][j + 1] + array[i + 2][j + 2] == 15)      
	    	           System.out.println("Победили нолики"); 
	    	      if (array[i + 2][j] + array[i + 1][j + 1] + array[i][j + 2] == 15)      
	    	           System.out.println("Победили нолики");
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
