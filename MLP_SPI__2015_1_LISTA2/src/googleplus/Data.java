package googleplus;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String toString() {
		if(this.dia <= 0 && this.mes <= 0 && this.ano <= 0) {
			throw new IllegalArgumentException("Valores inv‡lidos");
		}
		
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
