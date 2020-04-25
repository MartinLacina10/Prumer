import java.util.Scanner;
class prumer{
   public static void main(String arg[]){
	
       int n;
       double res=0;
	
       Scanner sc=new Scanner(System.in);
 
       System.out.println("Napis z kolika cisel chces prumer");
	   
       n=sc.nextInt();
 
       int a[]=new int[n];
 
       System.out.println("napis "+n+" cisla");
 
       for(int i=0;i<n;i++)
	   a[i]=sc.nextInt();
 
       for(int i=0;i<n;i++)
	   res =res+a[i];
 	 	    
        System.out.println("prumer="+res/n);
 
    }
 
}