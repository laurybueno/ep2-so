import java.util.Random;

public class Escritor implements Ator, Runnable {

	
	public void run(){
		atua
	}
	
	// recebe um ponteiro para array modific�vel
	// ele chama o m�todo escrever 100 vezes para 100 posi��es decididas aleatoriamente
	public void atua(String[] texto){
		
		Random rand = new Random();
		
		
		// roda 100 vezes para realizar 100 escritas no array
		for(int i=0; i<100; i++){
			// escolhe um n�mero entre 0 e 100
		    int randomNum = rand.nextInt(100);
		    escrever(texto, randomNum);
		}
		
		return;
	}
	
	
	// recebe um ponteiro para o array modific�vel e uma posi��o onde escrever
	public void escrever(String[] texto, int pos){
		texto[pos] = "MODIFICADO";
		return;
	}
}
