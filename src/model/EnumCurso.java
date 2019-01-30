package model;

public enum EnumCurso {

	CIENCIADACOMPUTACAO(1), ENGENHARIACIVIL(2), ENGENHARIADEPRODUCAO(3), ENGENHARIADESOFTWARE(4), ENGENHARIAMECANINCA(5);

	public int valorCurso;

	EnumCurso(int valor) {
		valorCurso = valor;
	}

	public int getValorCurso() {
		return valorCurso;
	}
	
	
	public static String value(Integer valor){
		switch(valor){
		case 1:
			return "CIENCIA DA COMPUTACAO";
		case 2:
			return "ENGENHARIA CIVIL";
		case 3:
			return "ENGENHARIA DE PRODUCAO";
		case 4:
			return "ENGENHARIA DE SOFTWARE";
		case 5:
			return "ENGENHARIA MECANICA";
		default:
			return "";
		}
	
	}
	
	
	
}
