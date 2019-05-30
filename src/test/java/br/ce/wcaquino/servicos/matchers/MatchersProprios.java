package br.ce.wcaquino.servicos.matchers;

import java.util.Calendar;

public class MatchersProprios {
	
	public static DiaSemanaMatcher cairEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
		
	}
	
	public static DiaSemanaMatcher cairEmUmSegunda() {
		return new DiaSemanaMatcher(Calendar.MONDAY);
		
	}
	
	public static DataDiferencaDiasMatcher ehHojeComDiferencaDias(Integer qtdDias) {
		return new DataDiferencaDiasMatcher(qtdDias);
	}
	
	public static DataDiferencaDiasMatcher ehHoje() {
		return new DataDiferencaDiasMatcher(0);
	}
}
