import java.util.Random;

public class Escritor implements Ator, Runnable {

	
	// recebe um ponteiro para array modific�vel
	// ele chama o m�todo escrever 100 vezes para 100 posi��es decididas aleatoriamente
	public void atua(String[] texto){
		
		return;
	}
	
	
	// recebe um ponteiro para o array modific�vel e uma posi��o onde escrever
	public void escrever(String[] texto, int pos){
		texto[pos] = "MODIFICADO";
		return;
	}
}
