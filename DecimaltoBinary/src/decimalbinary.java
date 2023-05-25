	import java.util.Scanner;
public class decimalbinary {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner objetoscanner = new Scanner(System.in);
		
		int decimal;
		String binario;
		
		System.out.println("DIGITE O NUMERO EM DECIMAL");
		decimal = objetoscanner.nextInt();
		
		binario = Integer.toBinaryString(decimal);
		
		System.out.println("SEU NÚMERO DECIMAL: " + decimal);
		
		System.out.println("O SEU RESULTADO EM NÚMERO BINARIO : " + binario);
		
		
		
		
		
		
		
		
		
	}

}
