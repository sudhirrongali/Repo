package sdr.demo.MavenRepo;

public class ReverseBeta {

	public ReverseBeta() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "hello";
		String rev ="";
		
		for(int i= str.length()-1;i>=0; i--) {
			char revch = str.charAt(i);
			System.out.println("element string"+revch);
			rev= rev+revch;
			System.out.println("element str"+rev);

		}
		System.out.println("reverse string : "+rev);

	}

}
