package codeforces;
import java.util.*;
import java.lang.*;

public class cd {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 int l =s.length();
		 int f=0;
		 if(s.charAt(l-1) !='a' && s.charAt(l-1) !='e' && s.charAt(l-1) !='i' && s.charAt(l-1) !='o'&&s.charAt(l-1) !='u'&&s.charAt(l-1) !='n') {
			f=1; 
		 }
		 for(int i=0;i<s.length()-1;i++) {
			 if(s.charAt(i) != 'n') {
             if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(l-1) !='u'){
			   	 if(s.charAt(i+1)=='a'||s.charAt(i+1)=='o'||s.charAt(i+1)=='i'||s.charAt(i+1)=='e'||s.charAt(i+1)=='u') {
			   		 i=i+1;
			   		
			   	 }else {
			   			 i=i+1;
			   			 f=1;
			   			 break;
			   		 }
			   	 }else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			   		 if(s.charAt(i+1)=='n') {
			   			 i=i+2;
			   		 }
			   	 }
			   	 else {
			   		 f=1;
			   	 } 
		 }else {
			 i=i+1;
		 }
	  }
		 if(f==0) {
			 System.out.println("YES");
		 }else {
			 System.out.println("NO");
		 }
	}
}
