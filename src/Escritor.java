import java.util.Random;

public class Escritor implements Ator, Runnable {

	
	// recebe um ponteiro para array modificável
	// ele chama o método escrever 100 vezes para 100 posições decididas aleatoriamente
	public void atua(String[] texto){
		
		return;
	}
	
	
	// recebe um ponteiro para o array modificável e uma posição onde escrever
	public void escrever(String[] texto, int pos){
		texto[pos] = "MODIFICADO";
		return;
	}
}
