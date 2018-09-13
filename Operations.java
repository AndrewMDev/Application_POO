package Application_POO;

import javax.swing.JOptionPane;

public class Operations {
		//ATRIBUTES VARIBALE GLOABL
		int number1;
		int number2;
		int sum;
		int rest;
		int divide ;
		int multiplication;
	
		
		//Methods
		public void request(){
		number1=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		number2=Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
		}	
		
		public void getSum() {
			sum= number1+number2;// LOCAL
		}
		
		public void getRest() {
			rest= number1-number2;
		}
		
		public void getDivide() {
			divide= number1/number2;
		}
		
		public void multiplication() {
			multiplication= number1*number2;
		}
		public void getResult() {
			JOptionPane.showMessageDialog(null,"\nThe sum is : "+sum+"\nThe rest is : "+rest+
					"\nThe divide is : "+divide+"\nThe multiplication is : "+multiplication);
		
		}
}

	
