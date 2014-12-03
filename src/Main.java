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
		// define quantos leitores e escritores serão usados no teste em execução
		int leitores = 50;
		
		// variáveis de suporte para gerar números aletórios e verificar se uma posição válida foi encontrada e populada com um novo ator
		int randomNum;
		boolean objOK;
		
		// popula as posições de atores
		for(int i=0; i<100; i++){
			
			// se ainda não foi encontrada uma posição válida para um ator, tenta encontrar novamente
			while(!objOK){
				// gera um número entre 0 e 100
				randomNum = rand.nextInt(100);
				
				// se a posição escolhida ainda não foi ocupada, realiza a instanciação 
				if(!((atores[randomNum] instanceof Leitor) || (atores[randomNum] instanceof Escritor))){
					// se ainda há leitores para ocupar o array, coloca um leitor na posição escolhida
					if(leitores > 0){
						atores[randomNum] = new Leitor();
						leitores--;
						
						// confirma que uma nova posição foi populada e pode-se passar para o próximo ator
						objOK = true;
					}
					// se todos os leitores desejados já foram colocados, então coloca um escritor
					else{
						atores[randomNum] = new Escritor();
						
						// confirma que uma nova posição foi populada e pode-se passar para o próximo ator
						objOK = true;
					}
				}
			}
		}
		
	}
	
}
