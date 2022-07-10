package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
			Print first number
			Iterate from 1 to the 11
			Add first and second number assign to sum
			Assign second number to the first number
			Assign sum to the second number
			Print sum  
		 *  */
		 int firstNum=0,secNum=1,sum,i,count=11;    
		 System.out.print(firstNum+" "+secNum);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 sum=firstNum+secNum;    
		  System.out.print(" "+sum);    
		  firstNum=secNum;    
		  secNum=sum;    
		 }    
		}
	}


