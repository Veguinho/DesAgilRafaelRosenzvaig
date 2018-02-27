package br.pro.hashi.ensino.desagil.tequilada;
import java.io.*; 

public class Main {
	public static void main(String[] args)throws Exception {
		System.out.println("Projeto 1");
		
		FileReader fr= new FileReader("/Users/Veguinho/Desktop/Insper/Comp 3 semestre/Desenvolvimento Colaborativo Ágil/Projeto1/RafaelRosenzvaig_Projeto1/src/main/java/br/pro/hashi/ensino/desagil/text.txt");    
        BufferedReader br = new BufferedReader(fr);    
        
        int letra;
        int i;   
        int counter = 0;
        
        while((i = br.read())!=-1){
        		letra = (char)i;
	        	if(letra == 35) {
	        		letra = 88;
	        	}
	        	if(counter > 4) {
	        		
	        		System.out.print((char)letra);
	        	}
	        	counter += 1;
		
        }
	}
}