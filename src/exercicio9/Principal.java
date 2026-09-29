package exercicio9;

public class Principal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		
		cachorro.nome = " Bilu";
		cachorro.idade = 9;
		
		cachorro.comer();
		cachorro.dormir();
		cachorro.latir();
		
		Gato gato = new Gato();
		
		gato.nome = " eduardo";
		gato.idade = 27;
		
		gato.comer();
		gato.dormir();
		gato.miar();
		

	}

}
