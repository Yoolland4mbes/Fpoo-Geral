
public class Main {

	public static void main(String[] args) {
		
		LoopWhile objWhile = new LoopWhile();
		LoopWhileSentinela objWhileSentenela = new LoopWhileSentinela();
		LoopFor objLoopFor = new LoopFor();
		LoopDoWhile objDoWhile = new LoopDoWhile();
		
		//objWhile.loopWhileContador();
		objWhileSentenela.loopWhile();
		//objWhile.LoopWhileContador2(11);
		//objLoopFor.loopFor1();
		//objLoopFor.loopFor2(50);
		//objDoWhile.loopDo();
		objDoWhile.loopDoSentinela();
		
	}

}
