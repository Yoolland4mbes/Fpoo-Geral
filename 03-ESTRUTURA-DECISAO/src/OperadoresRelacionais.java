
public class OperadoresRelacionais {

	
	int valor1, valor2;
	
	public void testesLogicos() {
		
		this.valor1 = 10;
		this.valor2 = 5;
		boolean resultado;
		
		System.out.println("teste lógico: " + this.valor1 + " < " + this.valor2);
		resultado = valor1 < valor2;
		System.out.println("RESULTADO: " + resultado);
		
		
		System.out.println("teste lógico: " + this.valor1 + " <= " + this.valor2);
		resultado = valor1 <= valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("teste lógico: " + this.valor1 + " == " + this.valor2);
		resultado = valor1 == valor2;
		System.out.println("RESULTADO: " + resultado);
		
		
		System.out.println("teste lógico: " + this.valor1 + " != " + this.valor2);
		resultado = valor1 != valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("teste lógico: " + this.valor1 + " > " + this.valor2);
		resultado = valor1 > valor2;
		System.out.println("RESULTADO: " + resultado);
		
		System.out.println("teste lógico: " + this.valor1 + " >= " + this.valor2);
		resultado = valor1 >= valor2;
		System.out.println("RESULTADO: " + resultado);
		
		
	}
}
