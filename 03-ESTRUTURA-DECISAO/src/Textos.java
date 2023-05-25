
public class Textos {
	
	public void textosLogicos() {
	String nome1 = "EMILLY";
	String nome2 = "";
	String nome3 = "emilly";
	String nome4 = "emilly rodrigues dos anjos";
	
	System.out.println("É VAZIO? " + nome1.isEmpty());
	System.out.println("É VAZIO? " + nome2.isEmpty());
	
	System.out.println("É IGUAL? " + nome1.equals(nome2));
	System.out.println("É IGUAL? " + nome1.equals(nome3));
	System.out.println("É IGUAL? " + nome1.equalsIgnoreCase(nome3));
	
	System.out.println("TAMANHO " + nome1.length());
	System.out.println("TAMANHO " + nome2.length());
	System.out.println("TAMANHO " + nome3.length());
	System.out.println("TAMANHO " + nome4.length());
	
	
		}
	

}
