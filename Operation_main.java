package Application_POO;

import javax.swing.JOptionPane;

public class Operation_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*Operations op=new Operations();
		
		op.request();
		op.getSum();
		op.getRest();
		op.multiplication();
		op.getDivide();
		op.getResult();
		
		*EXERCISE NUMBER 1 : YOUR CLASS OPERATIONS HAS A METHODS IN THE CLASS AND YOU CALL IT
		*THE CLASS WHEN YOU CREATE THE OBJECT OP AND PUT . TO CREATE BUT IT DOESN´T HAVE A ARGUMENTS
		*/
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number "));
		
		/*Opertation_2 op_2=new Opertation_2();
		op_2.getSum(num1, num2);
		op_2.getRest(num1, num2);
		op_2.multiplication(num1, num2);
		op_2.getDivide(num1, num2);
		
		op_2.getResult();
		
		*EXERCISE NUMBER 2 : YOUR CLASS OPERATION_2 HAS ATRIBUTTE AND METHODS. YOU CALL THE
		*CLASS WHEN YOU CREATE THE OBJECT OP_2 AND PUT . FOR CALL IT BUT IN THIS CASE
		*YOUR ARGUMENTS HAS A NUMBERS TO NEED OPERATE 
		*/
		
		/*Operation_3 op_3=new Operation_3();
		
		int sum= op_3.getSum(num1, num2);
		int rest=op_3.getRest(num1, num2);
		int mul=op_3.multiplication(num1, num2);
		int div=op_3.getDivide(num1, num2);
		
		
		op_3.getResult(sum, rest, mul, div);*/
		
		Operation_3 op_3=new Operation_3();
		
		JOptionPane.showMessageDialog(null,"\nThe sum is : "+op_3.getSum(num1, num2)+
				"\nThe res is : "+op_3.getRest(num1, num2)+"\nThe multiplication is : "+op_3.multiplication(num1, num2)+
				"\nThe divide is : "+	op_3.getDivide(num1, num2));
		
				
	}

}
