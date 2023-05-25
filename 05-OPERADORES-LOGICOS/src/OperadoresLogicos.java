
public class OperadoresLogicos {
	
	public void testesLogicos() {
		/*
		 OPERADORES LOGICOS 
		 && --> and --> e 
		 || --> or --> ou
		 ! --> not --> não
		 */
		int idadeInicio = 18;
		int idadeFim = 90;
		boolean resultado;
		
		 idadeInicio = 18;
		 resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		 System.out.println(resultado);
		 
		 idadeInicio = 17;
		 resultado = (idadeInicio >= 18) && (idadeFim <= 90);
		 System.out.println(resultado);
		 
		 
		 
		 idadeInicio = 18;
		 resultado = (idadeInicio >= 18) || (idadeFim <= 90);
		 System.out.println(resultado);
		 
		 idadeInicio = 17;
		 resultado = (idadeInicio >= 18) || (idadeFim <= 90);
		 System.out.println(resultado);
	}
}
