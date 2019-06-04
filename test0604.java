import java.util.*;
public class test0604 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int as=sc.nextInt();
		int []a= new int[as];
		int b=0,c=0,d=0;
        for(int i=0;i<as;i++) {
        	a[i]=sc.nextInt();
        	if(a[i]>0) 
        		b+=1;
        	
        	else 
        		if(a[i]==0) 
        			c+=1;
        		else 
        			d+=1;
        		
        }
        System.out.println("正數="+b);
        System.out.println("0="+c);
        System.out.println("負數="+d);
	}

}
