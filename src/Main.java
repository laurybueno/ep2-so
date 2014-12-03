import java.util.Random;


public class Main {
	public static void main (String[] args){
		IO leArquivo = new IO();
		leArquivo.arquivoToRAM();
		
		
		//apenas para debugar
		for(int i=0;i<leArquivo.texto.length;i++){
			System.out.println(leArquivo.texto[i]);
		}
		
		
		// proposta para ppular o array de threads
		
		Ator[] atores = new Ator[100];
		Random rand = new Random();
		// define quantos leitores e escritores ser�o usados no teste em execu��o
		int leitores = 50;
		
		// vari�veis de suporte para gerar n�meros alet�rios e verificar se uma posi��o v�lida foi encontrada e populada com um novo ator
		int randomNum;
		boolean objOK;
		
		// popula as posi��es de atores
		for(int i=0; i<100; i++){
			
			// se ainda n�o foi encontrada uma posi��o v�lida para um ator, tenta encontrar novamente
			while(!objOK){
				// gera um n�mero entre 0 e 100
				randomNum = rand.nextInt(100);
				
				// se a posi��o escolhida ainda n�o foi ocupada, realiza a instancia��o 
				if(!((atores[randomNum] instanceof Leitor) || (atores[randomNum] instanceof Escritor))){
					// se ainda h� leitores para ocupar o array, coloca um leitor na posi��o escolhida
					if(leitores > 0){
						atores[randomNum] = new Leitor();
						leitores--;
						
						// confirma que uma nova posi��o foi populada e pode-se passar para o pr�ximo ator
						objOK = true;
					}
					// se todos os leitores desejados j� foram colocados, ent�o coloca um escritor
					else{
						atores[randomNum] = new Escritor();
						
						// confirma que uma nova posi��o foi populada e pode-se passar para o pr�ximo ator
						objOK = true;
					}
				}
			}
		}
		
	}
	
}
