import java.util.Random;

public class Escritor implements Ator, Runnable {

	
	public void run(){
		atua
	}
	
	// recebe um ponteiro para array modificável
	// ele chama o método escrever 100 vezes para 100 posições decididas aleatoriamente
	public void atua(String[] texto){
		
		Random rand = new Random();
		
		
		// roda 100 vezes para realizar 100 escritas no array
		for(int i=0; i<100; i++){
			// escolhe um número entre 0 e 100
		    int randomNum = rand.nextInt(100);
		    escrever(texto, randomNum);
		}
		
		return;
	}
	
	
	// recebe um ponteiro para o array modificável e uma posição onde escrever
	public void escrever(String[] texto, int pos){
		texto[pos] = "MODIFICADO";
		return;
	}
}
