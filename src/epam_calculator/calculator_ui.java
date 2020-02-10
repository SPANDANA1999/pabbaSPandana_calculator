package epam_calculator;
import java.util.*;

public class calculator_ui {
      public static void main(String args[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("enter operands");
    	  int a=sc.nextInt();
    	  int b=sc.nextInt();
    	  System.out.println("enter operands");
    	  char op=sc.next().charAt(0);
    	  cali ob=new cali(a,b,op);
    	  callogic c=new callogic();
    	  double result=c.calculate(ob);
    	  System.out.println("the result is : "+result);
      }
}
