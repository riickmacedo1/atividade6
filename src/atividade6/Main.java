package atividade6;

public class Main {
	
	public static void main(String[] args) {

		Smartphone smartphone = new Smartphone ("Samsung");
	
		System.out.println(smartphone.getTipoAparelho());
		smartphone.carregar();
		System.out.println(smartphone.toString());
		System.out.println("Bateria: GranDuos" + smartphone.getMAH());
		System.out.println(smartphone.getModeloProcessador());
		System.out.println("Potencia: " + smartphone.getPotencia());
		System.out.println("Tela: " + smartphone.getTipoTela());

}
	
}
