package controle;

/**
 * Classe de controle de fluxo de execução, para rodar o programa sem interface grafica, apenas no proc de comandos
 * @author William
 *
 */
public class VisualizadorIterativo extends Visualizador {


	@Override
	public void display() {
		while(true) {
			this.menu();
			String s;
			int i=0;
			int j=0;
			do {
				if(j!=0) {
					System.out.println("Entrada fora do intervalo indicado");
				}
				s = entrada.nextLine();
				j=1;
				try{
					i=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
					j=0;
				}
			}while(i<1 || i>7);

			if(i==7) {
				break;
			}else {
				this.escolha(i);
			}
		}
	}




private void menu() {
	System.out.println("Agenda");
	System.out.println("1 - Adicionar nota");
	System.out.println("2 - Remover nota");
	System.out.println("3 - Atualizar nota");
	System.out.println("4 - Listar notas");
	System.out.println("5 - Listar notas proximas do prazo");
	System.out.println("6 - Listar notas que ja passaram do prazo");
	System.out.println("7 - Encerrar execução");
}

private void escolha(int i) {
	int id=0;
	String s;
	switch(i) {
		case 1:
			agenda.cadastrarNovaNota();
			break;
		case 2:
			System.out.println("Digite o ID referente a nota a ser excluida");
			do {
				s = entrada.nextLine();
				try{
					id=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
				break;
			}while(true);
			agenda.deletarNota(id);
			break;
		case 3:
			System.out.println("Digite o ID referente a nota a ser atualizada");
			do {
				s = entrada.nextLine();
				try{
					id=Integer.parseInt(s);
				}catch(Exception e) {
					System.out.println("Entrada invalida");
				}
				break;
			}while(true);
			agenda.modificar(id);
			break;
		case 4:
			agenda.visualizarTodas();
			break;
		case 5:
			agenda.visualizarProxima();;
			break;
		case 6:
			agenda.visualizarForaDoPrazo();;
			break;
	}
}



}
