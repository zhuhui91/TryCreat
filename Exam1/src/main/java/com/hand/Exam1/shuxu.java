package com.hand.Exam1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class shuxu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int ct,i,j,m,n;
	       List<Integer> lists=new ArrayList<Integer>();
	       m=101;n=200;  ct = 0;
	       boolean f = true;
	          for (i = m; i <= n; i++)
	          {
	               f = true;
	               for (j = 2; j <= i / 2; j++)
	               { if (i % j == 0)
	               { f = false; break; }
	               }
	               if (f == true)
	               { ct++;
	                 lists.add(i);
	               }
	          }
	          System.out.print("101-200之间总共有"+ ct+"个素数；分别是");
	          Iterator<Integer> iter=lists.iterator();
	          while(iter.hasNext()){
	        	   int str=iter.next();
	        	
	        	   System.out.print(str);
	        	   if(iter.hasNext()){
	        		   System.out.print(",");
	        	   }else{
	        		   System.out.println();
	        	   }
	        	   
	        	   }
	}
}
