import java.util.Scanner;

public class LoopDoWhile {
	
	public void loopDo() {
		int contador = 11;
		do {
			System.out.println("O VALOR DO CONTADOR DO LOOP WHILE É  " + contador);
			contador++;
		}while (contador <=10);

	}
	//EXEMPLO DE LOOP DO WHILE POR SENTINELA//
	public void loopDoSentinela() {
		
		String opcao = "";
		Scanner objScanner = new Scanner(System.in);
		
		do {
			
			System.out.println("do while");
			System.out.println("DIGITE UM VALOROU SAIR");
			opcao = objScanner.next();
			System.out.println("valor digitado" + opcao);
			
		}while (!opcao.equalsIgnoreCase("SAIR"));
		
		System.out.println("OBRIGADO POR USAR O PROGRAMA");
		
	}
}

