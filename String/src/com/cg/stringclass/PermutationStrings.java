
package com.cg.stringclass;

public class PermutationStrings {
	
	public static void printpermunt(String str ,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans+" ");
			return ;
		}
		

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String r=str.substring(0, i)+str.substring(i+i);
			printpermunt(r,ans+ch);
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		String s="aa";
		printpermunt(s,"");
		
	}
	
	
}
