package Application_POO;



public class Operation_3 {
	
	//Methods
	
	
	public int getSum(int num1, int num2) {
		int Sum= num1+num2;// LOCAL
		return Sum;
	}
	
	public int getRest(int num1, int num2) {
		int rest= num1-num2;
		return rest;
	}
	
	public  int getDivide(int num1, int num2) {
		int divide= num1/num2;
		return divide;
	}
	
	public int multiplication(int num1, int num2) {
		int multiplication= num1*num2;
		return multiplication;
	}
	/*public void  getResult(int sum,int rest,int multiplication,int divide) {
		JOptionPane.showMessageDialog(null,"\nThe sum is : "+sum+"\nThe rest is : "+rest+
				"\nThe divide is : "+divide+"\nThe multiplication is : "+multiplication);
	
	}*/

}
