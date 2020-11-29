package controle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.Nota;
import modelo.NotaEvento;
import modelo.NotaFamiliar;
import modelo.NotaLazer;
import modelo.NotaProfissional;

public class CriarNotaControle {
	
	private static Scanner entrada = new Scanner(System.in);
	/**
	 * está classe pede para o usuario selecionar o tipo de nota a ser criado
	 * 
	 * @return o tipo de nota instanciado, pois Nota é abstrato e não pode ser gerada uma instancia da mesma.
	 * @throws ParseException 
	 */
	public Nota criar() throws ParseException {
			System.out.println("Escolha o tipo de nota a ser criado");
			System.out.println("1 - Familiar");
			System.out.println("2 - Lazer");
			System.out.println("3 - Profissional");
			System.out.println("4 - Evento");
			Nota n = null;
			String s;
			int i=0;
			int j=0;
			do {
				if(j!=0) {
					System.out.println("Entrada fora do intervalo indicado");
				}
				s = entrada.next();
				j=1;
				try{
					 i=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
					j=0;
				}
			}while(i<1 || i>4);
			
			switch(i) {
				case 1:
					n = new NotaFamiliar();
					break;
				case 2:
					n = new NotaLazer();
					break;
				case 3:
					n = new NotaProfissional();
					break;
				case 4:
					n = new NotaEvento();
					break;
				
			}
			
			
			System.out.println("digite o Titulo : ");
			s = entrada.next();
			n.setTitulo(s);
			int dia=0,mes=0,ano=0;
			System.out.println("Para data digite valores positivos maiores que 0 ");
			System.out.println("Em caso de digitar um dia que passe o numero limite do mês");
			System.out.println("a quantia restante ira passar adiante adiando assim o mês escolhido");
			System.out.println("igualmente para o mês, caso ultrapasse 12, ira incrementar o ano");
			
			while(dia<1 ) {
				System.out.println("digite o Dia DD: ");
				s = entrada.next();
				try{
					 dia=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
			}
			while(mes<1) {
				System.out.println("digite o Mês MM : ");
				s = entrada.next();
				try{
					 mes=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
			}
			while(ano<1) {
				System.out.println("digite o Ano YYYY : ");
				s = entrada.next();
				try{
					 ano=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
			}
			
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date data= new Date();
			s=ano+"-"+mes+"-"+dia;
			data = format.parse(s);
			n.setData(data);

			return n;
	}
		
		
	
	

}
