package epam_calculator;

public class callogic {
 
 double calculate(cali obj)
  { 
	 double res=0;
	  switch(obj.operator)
	  {
	  case '+':
		  res=(double)obj.op1+obj.op2;
		  break;
	  case '-':
		  res=(double)obj.op1-obj.op2;
		  break;
	  case '*':
		  res=(double)obj.op1*obj.op2;
		  break;
	  case '/':
		  res=(double)obj.op1/obj.op2;
		  break;
	  }
	  return res;
  }
}
