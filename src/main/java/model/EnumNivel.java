package model;

public enum EnumNivel {
	
	// paulo.macedo: não é necessário esse inteiro valorNivel
	ADMINISTRADOR(1,"Administrador"), 
	COMUM(2,"Comum");

	private int valorNivel;
	private String label;
	
	private EnumNivel(int valorNivel, String label) {
		this.valorNivel = valorNivel;
		this.label = label;
	}

	public int getValorNivel() {
		if (valorNivel == 0) {
			return 2;
		}
		return valorNivel;
	}
	
	public String getLabel() {
		return label;
	}

	public static String value(Integer valor) {
		switch (valor) {
		case 1:
			return "Administrador";
		case 2:
			return "Comun";
		default:
			return "";
		}

	}

}