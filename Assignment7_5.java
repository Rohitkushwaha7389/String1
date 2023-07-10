import java.util.*;

public class Assignment7_5 {
    public static void main(String[] args) {
Scanner  sc=new Scanner(System.in);
String s=sc.next();

  char a[]=s.toCharArray(); 
  int i=0;int j=(sc.nextInt()-1)%(a.length-1);
  while(i<=j){
     char t=a[i];
        a[i]=a[j];
        a[j]=t;
    i++;
    j--;
  }
 String k=new String(a);
  System.out.println(k);
  sc.close();
        
    } 
}
