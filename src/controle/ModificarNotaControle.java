package controle;

import java.util.Scanner;


public class ModificarNotaControle {
	private static Scanner entrada = new Scanner(System.in);

	public String[] modificar() {
		String titulo="";
		String data ="";
		int dia=0;
		int mes=0;
		int ano=0;
			System.out.println("digite o novo Titulo : ");
			String s = null;
			titulo = entrada.next();
			System.out.println("digite a nova data: ");
			while(dia<1 ) {
				System.out.println("digite o novo Dia DD: ");
				s = entrada.next();
				try{
					 dia=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
			}
			while(mes<1) {
				System.out.println("digite o novo Mês MM : ");
				s = entrada.next();
				try{
					 mes=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
			}
			while(ano<1) {
				System.out.println("digite o novo Ano YYYY : ");
				s = entrada.next();
				try{
					 ano=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
			}
			
			data=ano+"-"+mes+"-"+dia;
			
		
			return new String[]{titulo, data};
		
		}
}
