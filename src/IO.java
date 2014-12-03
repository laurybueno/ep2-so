import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//classe para manipular o arquivo "bd.txt"
public class IO {
	String[] texto = new String[36242];
	
	//metodo para ler o arquivo bd.txt e salvar na RAM
	void arquivoToRAM (){
		
		try{
			File arquivo = new File("bd.txt");
			FileReader fr = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(fr);
			
			int cont=0; //contado para andar no arranjo
			while(br.ready() ){ //enquanto tem coisa para ler
				texto[cont]= br.readLine(); //salva a linha no elemtno do arranjo atual
				cont++;//anda uma posicao
			}
			br.close();
			fr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}

		
	}
}
