package com.hand.Exam3;

import java.util.Scanner;

public class Datetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ct=0,year=0,month=0,day=0;
		Scanner input=new Scanner(System.in);
	    System.out.println("请输入日期:");
	    String gz=input.next();
	    char cut[]=gz.toCharArray();
	    String y,m,d;
	    char ys[]={cut[0],cut[1],cut[2],cut[3]},ms[]={cut[5],cut[6]},ds[]={cut[8],cut[9]};
	    y=ys.toString();
	    m=ms.toString();
	    d=ds.toString();
	    System.out.println("你输入的日期为当年的第 "+ct+" 天");
	}

}
