package Application_POO;

import javax.swing.JOptionPane;

public class Operation_2 {
	
	//ATRIBUTES VARIBALE GLOABL
			int sum;
			int rest;
			int divide ;
			int multiplication;
		
			
			//Methods
		
			
			public void getSum(int num1, int num2) {
				sum= num1+num2;// LOCAL
			}
			
			public void getRest(int num1, int num2) {
				rest= num1-num2;
			}
			
			public void getDivide(int num1, int num2) {
				divide= num1/num2;
			}
			
			public void multiplication(int num1, int num2) {
				multiplication= num1*num2;
			}
			public void getResult() {
				JOptionPane.showMessageDialog(null,"\nThe sum is : "+sum+"\nThe rest is : "+rest+
						"\nThe divide is : "+divide+"\nThe multiplication is : "+multiplication);
			
			}
}
