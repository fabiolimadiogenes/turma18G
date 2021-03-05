package exercicioHerancaPolimorfismo;

public class Preguica extends Animal {

		private String subirArvore;

		public Preguica(String nome, int idade) {
			super(nome, idade);
			
		}

		public String getSubirArvore() {
			return subirArvore;
		}

		public void setSubirArvore(String subirArvore) {
			this.subirArvore = subirArvore;
		}
		
		public String getEmiteSom() {
			
			String som = "som da preguiça ???";
			
			return som;
				
		}
		
}
