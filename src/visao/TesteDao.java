package visao;

public class TesteDao {

	private static Visualizador rodar;

	public static void main(String[] args)  {
		rodar = new VisualizadorIterativo();
		rodar.display();
	}

		
}
