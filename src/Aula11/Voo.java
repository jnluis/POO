package Aula11;

import java.util.Map;

public class Voo {
    private String hora;
	private String codigo;
	private String origem;
	private String atraso;
	private String previsto;
	private static Map<String,String> Companhia;


	public Voo (String h, String c, String o) {
		hora = h;
		codigo = c;
		origem = o;
		atraso = "";
		previsto = "";
	}
	
	public Voo (String h, String c, String o, String a) {
		hora = h;
		codigo = c;
		origem = o;
		atraso = a;
		previsto = horaPrevista(hora,atraso);
	}

	private String horaPrevista(String h, String a) { // Passar para int a hora que vinha no .txt
		String[] h_hm = h.split(":");
		int h_m = 60 * Integer.parseInt(h_hm[0]) + Integer.parseInt(h_hm[1]);
		String[] a_hm = a.split(":");
		int a_m = 60 * Integer.parseInt(a_hm[0]) + Integer.parseInt(a_hm[1]);
		int hp_m = h_m+a_m;
		return String.format("%02d:%02d", hp_m/60, hp_m%60);
	}

	public static int stringToMinutes (String s) { //converte para inteiro o valor das horas
		String[] hm = s.split(":");
		int seconds = Integer.parseInt(hm[0]) * 60 + Integer.parseInt(hm[1]);
		return seconds;
	}
	public static String minutesToString (int m) { //converte para String os valores
		
		return String.format("%02d:%02d", (int)m/60, m%60);
	}

	public static void setCompanhias(Map<String,String> sC) {
		Companhia = sC;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAtraso(){
		return atraso;
	}

	public String getOrigem() {
		return this.origem;
	}

	public String toString() {
		if (atraso.contentEquals("")) {
			return String.format("%-15s %-15s %-20s", hora, codigo,Companhia.get(codigo.substring(0,2).trim()), origem);
		} else {
			return String.format("%-15s %-15s %-20s %-20s %-15s %-15s", hora,codigo, Companhia.get(codigo.substring(0,2).trim()), origem, atraso, "Previsto "+previsto);
		}
	}
}
