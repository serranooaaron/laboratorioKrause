package tp3;

public class Main {

	public static void main(String[] args) {
		HerramientaElectrica taladro = new HerramientaElectrica(1, "Bosch", 230);
		HerramientaManual martillo = new HerramientaManual(1, "Bosch", "Empuñadura de goma");
		
		martillo.usar();
		martillo.devolver();
		
		taladro.conectar();
		taladro.usar();
		taladro.devolver();

	}

}
