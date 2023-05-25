import java.util.Scanner;

public class LoopWhileSentinela {
	
	public void loopWhile() {
		
		String sentinela = "";
		 Scanner objScanner = new Scanner (System.in);
		 while (!sentinela.equalsIgnoreCase("SAIR")){
			 
			 System.out.println("while");
			 System.out.println("DIGITE UM VALOR OU SAIR");
			 sentinela = objScanner.next();
			 System.out.println("valor digitado" + sentinela);
		 }
		 System.out.println("OBRIGADO POR USAR O PROGRAMA");
	}
	
}
