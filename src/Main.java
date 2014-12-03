
public class Main {
	public static void main (String[] args){
		IO leArquivo = new IO();
		leArquivo.arquivoToRAM();
		
		
		//apenas para debugar
		for(int i=0;i<leArquivo.texto.length;i++){
			System.out.println(leArquivo.texto[i]);
		}
	}
	
}
