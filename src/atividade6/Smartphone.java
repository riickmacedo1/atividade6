package atividade6;

public class Smartphone implements Processador, Aparelho, Bateria {

	private boolean carregado;
	private int porcentagem;
	private String marca; 
	
	
	
	public Smartphone(String marca) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setPorcentagem(0);
	}
	
	
	
	@Override
	public int getMAH() {
		return 530;
	}

	@Override
	public void carregar() {
		System.out.println("Smartphone carregado!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "LCD";
	}

	@Override
	public String getTipoAparelho() {
		return "Smartphone";
	}

	@Override
	public String getModeloProcessador() {
		return "Qualcomm Snapdragon";
	}

	@Override
	public String getPotencia() {
		return "2,84 GHz";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}



	@Override
	public String toString() {
		return "Smartphone [carregado=" + carregado + ", porcentagem=" + porcentagem + ", marca=" + marca
				+ "]";
	}
	
}
