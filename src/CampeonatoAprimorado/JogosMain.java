package CampeonatoAprimorado;

public class JogosMain {
	
	public static void main(String[] args) throws InterruptedException {
		
			
			SerieA times [] = new SerieA [20];
			
			times [0] = new SerieA("Coritiba", "Couto Pereira", "Curitiba/PR", "Vovô Coxa", 1909, 0, 0, 0, 0, 0, "Serie A", 0);
			times [1] = new SerieA("Athletico PR", "Arena da Baixada", "Curitiba/PR", "Furacão", 1924, 0, 0, 0, 0, 0, "Serie A", 0);
			times [2] = new SerieA("Botafogo", "Nilton Santos", "Rio de Janeiro/RJ", "Cachorro", 1894, 0, 0, 0, 0, 0, "Serie A", 0);
			times [3] = new SerieA("Palmeiras", "Allianz Parque", "São Paulo/SP", "Porco", 1914, 0, 0, 0, 0, 0, "Serie A", 0);
			times [4] = new SerieA("Gremio", "Arena do Gremio", "Porto Alegre/RS", "Mosqueteiro", 1903, 0, 0, 0, 0, 0, "Serie A", 0);
			times [5] = new SerieA("Flamengo", "Maracana", "Rio de Janeiro/RJ", "Urubu", 1895, 0, 0, 0, 0, 0, "Serie A", 0);
			times [6] = new SerieA("Fluminense", "Maracana", "Rio de Janeiro/RJ", "Guerreirinho", 1902, 0, 0, 0, 0, 0, "Serie A", 0);
			times [7] = new SerieA("Bragantino", "Arena RedBull", "Bragança Paulista/SP", "Toro Loko", 1928, 0, 0, 0, 0, 0, "Serie A", 0);
			times [8] = new SerieA("Fortaleza", "Castelao", "Fortaleza/CE", "Leão", 1918, 0, 0, 0, 0, 0, "Serie A", 0);
			times [9] = new SerieA("Atletico MG", "Arena MRV", "Belo Horizonte/MG", "Galo", 1908, 0, 0, 0, 0, 0, "Serie A", 0);
			times [10] = new SerieA("Cuiaba", "Arena Pantanal", "Cuiaba/MT", "Dourado", 2001, 0, 0, 0, 0, 0, "Serie A", 0);
			times [11] = new SerieA("Sao Paulo", "Morumbi", "São Paulo/SP", "Santo Paulo", 1930, 0, 0, 0, 0, 0, "Serie A", 0);
			times [12] = new SerieA("Cruzeiro", "Mineirao", "Belo Horizonte/MG", "Raposa", 1921, 0, 0, 0, 0, 0, "Serie A", 0);
			times [13] = new SerieA("Corinthians", "Neo Quimica Arena", "São Paulo/SP", "Mosqueteiro", 1910, 0, 0, 0, 0, 0, "Serie A", 0);
			times [14] = new SerieA("Internacional", "Beira Rio", "Porto Alegre/RS", "Saci", 1909, 0, 0, 0, 0, 0, "Serie A", 0);
			times [15] = new SerieA("Goias", "Haile Pinheiro - Serrinha", "Goiania/GO", "Periquito", 1943, 0, 0, 0, 0, 0, "Serie A", 0);
			times [16] = new SerieA("Bahia", "Itaipava Arena Fonte Nova", "Salvador/BA", "Super-Homem Tricolor", 1931, 0, 0, 0, 0, 0, "Serie A", 0);
			times [17] = new SerieA("Santos", "Vila Belmiro", "Santos/SP", "Peixe", 1912, 0, 0, 0, 0, 0, "Serie A", 0);
			times [18] = new SerieA("Vasco", "São Januario", "Rio de Janeiro/RJ", "Almirante", 1898, 0, 0, 0, 0, 0, "Serie A", 0);
			times [19] = new SerieA("America MG", "Arena Independencia", "Belo Horizonte/MG", "Coelho", 1912, 0, 0, 0, 0, 0, "Serie A", 0);
			

			Jogar jogo1 = new Jogar();
			jogo1.jogar(times[0], times[1]);
			times[0].atualizado();
			times[1].atualizado();
	}
}
