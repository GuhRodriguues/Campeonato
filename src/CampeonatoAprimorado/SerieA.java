package CampeonatoAprimorado;

import java.util.Random;

public class SerieA {
	
	private String time, estadio, cidadeEstado, mascote, serie;
	private int anoFundacao, vitorias, derrotas, empates, pontos, quantidadeJogos;
	private int quantidadeGols;
	private int golsPartida;
	private boolean lance;
	
	
	// ------------------------------------
	
	
	public SerieA (String ti, String esta, String cidEst, String masc, int ano, int vi, int de, int em, int pon, int jo, String se, int gol) {
		this.setTime(ti);
		this.setEstadio(esta);
		this.setCidadeEstado(cidEst);
		this.setMascote(masc);
		this.setAnoFundacao(ano);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
		this.setPontos(pon);
		this.setQuantidadeJogos(jo);
		this.setSerie(se);
		this.setQuantidadeGols(gol);
	}
	
	
	// ------------------------------------
	
	
	public void status() throws InterruptedException {
		Random aleatorio = new Random();
		int apresentacao = aleatorio.nextInt(3);
		switch (apresentacao) {
			case 0: // Apresentação 1 
				System.out.println("Vem ai o " + this.getTime() + "!");
				System.out.println("Time fundado na cidade de " + this.getCidadeEstado());
				System.out.println("Fundado em " + this.getAnoFundacao() + " e tem como Mascote o " + this.getMascote());
				System.out.println("Após " + this.getQuantidadeJogos() + " jogos na temporada, conta com " 
				+ this.getVitorias() + " vitorias, " 
				+ this.getEmpates() + " empates e " 
				+ this.getDerrotas() + " derrotas!");
				System.out.println("Somando o total de " + this.getPontos() + " pontos na temporada!");
				System.out.println("Somando o total de " + this.getQuantidadeGols() + " saldos de gols na temporada!");
				System.out.println("--------------------------------------------");
				Thread.sleep(2000);
				break;
				
			case 1: // Apresentação 2
				System.out.println("Jogando hoje, temos o " + this.getTime() + "!");
				System.out.println("Com " + this.getQuantidadeJogos() + " jogos esse ano, tem " 
				+ this.getVitorias() + " vitorias, " 
				+ this.getEmpates() + " empates e " 
				+ this.getDerrotas() + " derrotas!");
				System.out.println("Conta com " + this.getMascote() + " de mascote, fazendo a alegria da torcida");
				System.out.println("Hoje o " + this.getTime() + " tem o total de " + this.getPontos() + " na temporada!");
				System.out.println("Somando o total de " + this.getQuantidadeGols() + " saldo de gols na temporada!");
				System.out.println("--------------------------------------------");
				Thread.sleep(2000);
				break;
				
			case 2: // Apresentação 3
				System.out.println("Entrando em campo, temos o " + this.getTime() + "!");
				System.out.println("Time lá da cidade de " + this.getCidadeEstado() + ", que hoje está fazendo um calor, né Casagrande?!");
				System.out.println("Esse ano o " + this.getTime() + " já jogou "+ this.getQuantidadeJogos() + " jogos esse ano, e conta com " 
				+ this.getVitorias() + " vitorias, " 
				+ this.getEmpates() + " empates e " 
				+ this.getDerrotas() + " derrotas!");
				System.out.println("Com o total de " + this.getPontos() + " pontos na temporada!");
				System.out.println("Somando o total de " + this.getQuantidadeGols() + " saldo de gols na temporada!");
				System.out.println("--------------------------------------------");
				Thread.sleep(2000);
				break;
		}
		
	}

	
	public void fazerGols() {
		this.setQuantidadeGols(this.getQuantidadeGols() + 1);
	}
	
	public void sofrerGols() {
	this.setQuantidadeGols(this.getQuantidadeGols() - 1);
	}
	
	public void fazerGolsPartida() {
		this.setGolsPartida(this.getGolsPartida() + 1);
		
	}
	
	public void sofrerGolsPartida() {
		this.setGolsPartida(this.getGolsPartida() - 1);
		
	}
	
	public void ganharPartida() {
		this.setVitorias(this.getVitorias() + 1);
		this.setPontos(this.getPontos() + 3);
		this.setQuantidadeJogos(this.getQuantidadeJogos() + 1);
	}
	
	public void perderPartida() {
		this.setDerrotas(this.getDerrotas() + 1);
		this.setQuantidadeJogos(this.getQuantidadeJogos() + 1);
	}
	
	public void empatarPartida() {
		this.setEmpates(this.getEmpates() + 1);
		this.setPontos(this.getPontos() + 1);
		this.setQuantidadeJogos(this.getQuantidadeJogos() + 1);
	}
	
	public void atualizado() throws InterruptedException {
		System.out.println("Após o último jogo, o " + this.getTime() + " ficou assim: ");
		System.out.println(this.getVitorias() + " Vitórias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
		System.out.println("Somando o total de " + this.getPontos() + " pontos, " + this.getQuantidadeJogos() + " jogos e " + this.getQuantidadeGols() + " gols na temporada!");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		Thread.sleep(5000);
	}
	
	
	// ------------------------------------
	
	

	public String getTime() {
		return time;
	}

	public void setTime(String ti) {
		this.time = ti;
	}
	
	

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String esta) {
		this.estadio = esta;
	}
	
	

	public String getCidadeEstado() {
		return cidadeEstado;
	}

	public void setCidadeEstado(String cidEst) {
		this.cidadeEstado = cidEst;
	}
	
	

	public String getMascote() {
		return mascote;
	}

	public void setMascote(String masc) {
		this.mascote = masc;
	}
	
	

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int ano) {
		this.anoFundacao = ano;
	}
	
	

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vi) {
		this.vitorias = vi;
	}
	
	

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int de) {
		this.derrotas = de;
	}
	
	

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int em) {
		this.empates = em;
	}
	
	

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pon) {
		this.pontos = pon;
	}
	
	

	public int getQuantidadeJogos() {
		return quantidadeJogos;
	}

	public void setQuantidadeJogos(int jo) {
		this.quantidadeJogos = jo;
	}


	public String getSerie() {
		return serie;
	}
	
	public void setSerie(String se) {

		this.serie = se;
	}


	public int getQuantidadeGols() {
		return quantidadeGols;
	}

	public void setQuantidadeGols(int quantidadeGols) {
		this.quantidadeGols = quantidadeGols;
	}
	
	
	public String getCasa() {
		return time;
	}
	
	public String getFora() {
		return time;
	}


	public boolean isLance() {
		return lance;
	}


	public void setLance(boolean lance) {
		this.lance = lance;
	}


	public int getGolsPartida() {
		return golsPartida;
	}


	public void setGolsPartida(int golsPartida) {
		this.golsPartida = golsPartida;
	}
	
	
}

