package com.hand.Exam3;

import java.util.Scanner;
import java.lang.String;

public class date02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0,year=0,month=0,day=0;
		Scanner input=new Scanner(System.in);
	    System.out.println("请输入日期:");
	    
	    String gz=input.next();
	    String gg="2015-01-01";
	    System.out.println(gg);
	    String chai[]=gg.split("-");
	    for(int i=0;i<gg.length();i++)
	    	System.out.print(chai[i]+",");
	    char cut[]=gz.toCharArray();
	    year=cut[0];
	    String y,m,d;
	    char ys[]={cut[0],cut[1],cut[2],cut[3]},ms[]={cut[5],cut[6]},ds[]={cut[8],cut[9]};
	    y=ys.toString();
	    m=ms.toString();
	    d=ds.toString();
	    System.out.println("你输入的日期为当年的第 "+year+" 天");
	}

}
