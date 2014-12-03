import java.util.Random;

public class Leitor implements Ator, Runnable {
	
	
	String recebido;
	
	// recebe um ponteiro para o array modificável
	// esse método chama ler 100 vezes para 100 posições decididas aleatoriamente
	public void atua(String[] texto){
		
		Random rand = new Random();
	    
		// roda 100 vezes para realizar 100 leituras no array
		for(int i=0; i<100; i++){
			// escolhe um número entre 0 e 100
		    int randomNum = rand.nextInt(100);
		    ler(texto, randomNum);
		}

		Thread.sleep(1);
		
		
	}
	
	
	public void ler(String[] texto, int pos){
		recebido =texto[pos];
		return;
	}

}
