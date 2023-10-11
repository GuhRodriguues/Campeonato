package CampeonatoAprimorado;

import java.util.Random;

public class Jogar {
	
	private SerieA casa;
	private SerieA fora;
	private boolean aprovado;
	private SerieA quantidadeGols;
	
	
	// ------------------------------------
	
	
	public SerieA getCasa() {
		return casa;
	}
	public void setCasa(SerieA casa) {
		this.casa = casa;
	}
	public SerieA getFora() {
		return fora;
	}
	public void setFora(SerieA fora) {
		this.fora = fora;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}		
	public SerieA getQuantidadeGols() {
		return quantidadeGols;
	}
	public void setQuantidadeGols(SerieA quantidadeGols) {
		this.quantidadeGols = quantidadeGols;
	}
	
	// ------------------------------------
	
	
		public void jogar(SerieA time1, SerieA time2) throws InterruptedException {
			if (time1.getSerie().equals(time2.getSerie()) && time1 != time2) {
				this.setAprovado(true);
				this.casa = time1;
				this.fora = time2;
			} else {
				this.setAprovado(false);
				this.casa = null;
				this.fora = null;
			}
			
			if (this.aprovado) {
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("Jogando em casa, ");
				this.casa.status();
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("E de visitante, ");
				this.fora.status();
				
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("                          ");
				Thread.sleep(3000);
				System.out.println("                                   Começa o Jogo! ");
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("----------------------------------------------------------------------------------------");
				Thread.sleep(3000);
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("                      Primeiro tempo de um jogo que promete muito! ");
				System.out.println("                          ");
				System.out.println("                          ");
				Thread.sleep(5000);
				// -----------------------------------------------------------------------------------------------
				// Lance 01
				
				Random aleatorio = new Random();
				int lances01 = aleatorio.nextInt(2);
				switch (lances01) {
					case 0: // Lance 01 - Time da Casa
						System.out.println("                          E lá vem o Primeiro ataque do jogo: ");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                 E vem chegando o time do " + this.casa.getCasa() + ", entrando na grande area ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                     Fez a finta            ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                   Diblou mais umm            ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                                  Taa na cara do gol            ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                     CHUUTOOOUUU            ");
						System.out.println("                          ");
						Thread.sleep(3000);
							Random lance01 = new Random();
							int gol01 = lance01.nextInt(2);
							switch (gol01) {
								case 0: // gol
									System.out.println("                      GOLAÇOOOOOO, Goooooolllll doooooo " + this.casa.getCasa() + "!!!");
									System.out.println("                          ");
									Thread.sleep(2000);
									System.out.println("                      Uma bela jogada trabalhada pelo time do " + this.casa.getCasa());
									System.out.println("                          ");
									Thread.sleep(2000);
									System.out.println("                           O goleiro se esticou todo mas não deu  ");
									System.out.println("                          ");
									Thread.sleep(2000);
									System.out.println("                            E ta aberto o placar no dia de hoje!  ");
									System.out.println("                          ");
									System.out.println("                          ");
									System.out.println("                          ");
									Thread.sleep(5000);
									System.out.println("----------------------------------------------------------------------------------------");
									System.out.println("                          ");
									System.out.println("                        E a bola mau saiu do meio de campo após o gol   ");
									this.casa.fazerGols();
									this.casa.fazerGolsPartida();
									this.fora.sofrerGols();
									this.fora.sofrerGolsPartida();
									System.out.println("----------------------------------------------------------------------------------------");
									break;
									
								case 1: // fora
									System.out.println("                                   PRAAA FORAAA!!!! ");
									System.out.println("                          ");
									Thread.sleep(2000);
									System.out.println("                       Que chance disperdiçada do time do " + this.casa.getCasa());
									System.out.println("                          ");
									Thread.sleep(2000);
									System.out.println("                      Teve a chance de abrir o placar e disperdiçou");
									System.out.println("                          ");
									System.out.println("----------------------------------------------------------------------------------------");
								
									break;
							}
						Thread.sleep(5000);
						break;
					case 1: // Lance 01 - Time visitante 
						System.out.println("                          E lá vem o Primeiro ataque do jogo: ");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("             E vem chegando o time do " + this.fora.getFora() + ", entrando na grande area ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                    Fez a finta            ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                  Diblou mais umm            ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                                 Taa na cara do gol            ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                    CHUUTOOOUUU            ");
						System.out.println("                          ");
						Thread.sleep(3000);
						Random lance001 = new Random();
						int gol001 = lance001.nextInt(2);
						switch (gol001) {
							case 0: // gol
								System.out.println("                    GOLAÇOOOOOO, Goooooolllll doooooo " + this.fora.getFora() + "!!!");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                   Uma bela jogada trabalhada pelo time do " + this.fora.getFora());
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                         O goleirão se esticou todo mas não deu!  ");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                           Ta aberto o placar no dia de hoje!  ");
								System.out.println("                          ");
								System.out.println("                          ");
								System.out.println("                          ");
								Thread.sleep(5000);
								System.out.println("----------------------------------------------------------------------------------------");
								System.out.println("                          ");
								System.out.println("                        E a bola mau saiu do meio de campo após o gol   ");
								System.out.println("                          ");
								this.fora.fazerGols();
								this.fora.fazerGolsPartida();
								this.casa.sofrerGols();
								this.casa.sofrerGolsPartida();
								Thread.sleep(3000);
								break;
								
							case 1: // fora
								System.out.println("                                  PRAAA FORAAA!!!! ");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                     Que chance disperdiçada do time do " + this.fora.getFora());
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                      Teve a chance de abrir o placar e disperdiçou");
								System.out.println("                          ");
								System.out.println("----------------------------------------------------------------------------------------");
								Thread.sleep(5000);
							break;
						}
						break;		
			}
				
				//---------------------------------------------------------------------------------------------
				//Lance 02
				
				//Thread.sleep(3000);
				Random aleatorio02 = new Random();
				int lances02 = aleatorio02.nextInt(2);
				switch (lances02) {
					case 0: // Lance 02 - Time da Casa
						System.out.println("                             O jogo não para, é lá e cá ");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                         E vem chegando o time do " + this.casa.getCasa());
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                          Vem carregando do meio de campo");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                            Vai arriscar de fora da área");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                                   CHUUTOOOUUU");
						System.out.println("                          ");
						Thread.sleep(3000);
							Random lance02 = new Random();
							int gol02 = lance02.nextInt(2);
							switch (gol02) {
								case 0: // gol
									System.out.println("                        GOLAÇOOOOOO, Goooooolllll doooooo " + this.casa.getCasa() + "!!!");
									System.out.println("                          ");
									System.out.println("                           Depois de um belo chute de fora da área ");
									Thread.sleep(2000);
									System.out.println("                          ");
									System.out.println("                                 Não deu para o goleirão  ");
									Thread.sleep(2000);
									System.out.println("                          ");
									System.out.println("                                 E a bola estufa a rede!  ");
									this.casa.fazerGols();
									this.casa.fazerGolsPartida();
									this.fora.sofrerGols();
									this.fora.sofrerGolsPartida();
									System.out.println("----------------------------------------------------------------------------------------");
									break;
									
								case 1: // fora
									System.out.println("                           A bola passa por cima do gol!!! ");
									System.out.println("                          ");
									System.out.println("                                  E vai pra fora! ");
									System.out.println("                          ");
									Thread.sleep(2000);
									System.out.println("                          ");
									System.out.println("                       Bonito lance do time do " + this.casa.getCasa() + "! ");
									Thread.sleep(2000);
									System.out.println("                          ");
									System.out.println("                           Uma pena ele ter errado esse gol! ");
									System.out.println("----------------------------------------------------------------------------------------");
								
									break;
							}
						Thread.sleep(3000);
						break;
					case 1: // Lance 02 - Time visitante 
						System.out.println("                               O jogo não para, é lá e cá ");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                          E vem chegando o time do " + this.fora.getFora());
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                            Vem carregando do meio de campo");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                              Vai arriscar de fora da área");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                                     CHUUTOOOUUU");
						System.out.println("                          ");
						Thread.sleep(3000);
						Random lance002 = new Random();
						int gol002 = lance002.nextInt(2);
						switch (gol002) {
							case 0: // gol
								System.out.println("                    GOLAÇOOOOOO, Goooooolllll doooooo " + this.fora.getFora() + "!!!");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                          Depois de um belo chute de fora da área ");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                                 Não deu para o goleirão  ");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                                 E a bola estufa a rede!  ");
								System.out.println("                          ");
								this.fora.fazerGols();
								this.fora.fazerGolsPartida();
								this.casa.sofrerGols();
								this.casa.sofrerGolsPartida();
								System.out.println("----------------------------------------------------------------------------------------");
								break;
								
							case 1: // fora
								System.out.println("                             A bola passa por cima do gol!!! ");
								System.out.println("                          ");
								System.out.println("                                    E vai pra fora! ");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                          ");
								System.out.println("                         Bonito lance do time do " + this.fora.getFora() + "! ");
								System.out.println("                          ");
								Thread.sleep(2000);
								System.out.println("                             Uma pena ele ter errado esse gol! ");
								System.out.println("----------------------------------------------------------------------------------------");
								break;
						}
						Thread.sleep(5000);
						 break;
						
			}
				//---------------------------------------------------------------------------------------------
				//Lance 03
				
				Thread.sleep(3000);
				Random aleatorio03 = new Random();
				int lances03 = aleatorio03.nextInt(2);
				switch (lances03) {
					case 0: // Lance 03 - Time da Casa
						System.out.println("                           Troca de passes no meio de campo ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                            LANÇAMENTO PARA A GRANDE AREA! ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                    Vai pintando mais uma oportunidade para o " + this.casa.getCasa());
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                                    PENAAALTIII ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                         E É PENAAALTIII Para o time do " + this.casa.getCasa());
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                Depois de um belo lance de troca de passes na grande área ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("              Para a infelicidade do zagueiro, a bola bate na mão e é penalti ");
						System.out.println("                          ");
						System.out.println("----------------------------------------------------------------------------------------");
						Thread.sleep(5000);
						System.out.println("                        E quem vem para a cobrança é o Goleiro ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                              Tomou distancia, preparou");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                                    CHUUTOOOUUU");
						System.out.println("                          ");
						Thread.sleep(3000);
							Random lance03 = new Random();
							int gol03 = lance03.nextInt(2);
							switch (gol03) {
								case 0: // gol
									System.out.println("                       GOLAÇOOOOOO, Goooooolllll doooooo " + this.casa.getCasa() + "!!!");
									this.casa.fazerGols();
									this.casa.fazerGolsPartida();
									this.fora.sofrerGols();
									this.fora.sofrerGolsPartida();
									System.out.println("----------------------------------------------------------------------------------------");
									break;
									
								case 1: // fora
									System.out.println("                            PEGOOOOUU, GOLEIRÃO PEGOUUU!!!! ");
									System.out.println("----------------------------------------------------------------------------------------");
								
									break;
							}
						Thread.sleep(3000);
						break;
					case 1: // Lance 03 - Time visitante 
						System.out.println("                           Troca de passes no meio de campo ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                            LANÇAMENTO PARA A GRANDE AREA! ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                    Vai pintando mais uma oportunidade para o " + this.fora.getFora());
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                                    PENAAALTIII ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                       E é Penalti Para o time do " + this.fora.getFora());
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                Depois de um belo lance de troca de passes na grande área ");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("              Para a infelicidade do zagueiro, a bola bate na mão e é penalti ");
						System.out.println("                          ");
						System.out.println("----------------------------------------------------------------------------------------");
						Thread.sleep(5000);
						System.out.println("                        E quem vem para a cobrança é o Goleiro ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                              Tomou distancia, preparou");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                                    CHUUTOOOUUU");
						System.out.println("                          ");
						Thread.sleep(3000);
						Random lance003 = new Random();
						int gol003 = lance003.nextInt(2);
						switch (gol003) {
							case 0: // gol
								System.out.println("                     GOLAÇOOOOOO, Goooooolllll doooooo " + this.fora.getFora() + "!!!");
								this.fora.fazerGols();
								this.fora.fazerGolsPartida();
								this.casa.sofrerGols();
								this.casa.sofrerGolsPartida();
								System.out.println("----------------------------------------------------------------------------------------");
								break;
								
							case 1: // fora
								System.out.println("                            PEGOOOOUU, GOLEIRÃO PEGOUUU!!!! ");
								System.out.println("----------------------------------------------------------------------------------------");
								break;
						}
						Thread.sleep(3000);
						break;		
			}
				System.out.println("                               Final do primeiro tempo! ");
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("                      Depois de um primeiro tempo de muitas emoções");
				System.out.println("                          ");
				Thread.sleep(2000);
				System.out.println("              Os times vão para o vestiario escutar o que o professor tem a dizer");				
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("                          ");
				System.out.println("                          ");
				Thread.sleep(8000);
				System.out.println("              Os times estão de volta em campo, só esperando o apito do juiz");
				Thread.sleep(3000);
				System.out.println("                          ");
				System.out.println("                                   Apitaa o Arbitro! ");
				Thread.sleep(2000);
				System.out.println("                          ");
				System.out.println("                               E começa o Segundo tempo! ");
				System.out.println("                          ");
				System.out.println("                          ");
				Thread.sleep(3000);
				System.out.println("                        Depois de um primeiro tempo eletrizante! ");
				System.out.println("                          ");
				System.out.println("                          ");
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("                          ");
				System.out.println("                          ");
				//--------------------------------------------------------------------------------
				// Segundo tempo
				
				//Lance 04
				
				Thread.sleep(5000);
				Random aleatorio04 = new Random();
				int lances04 = aleatorio04.nextInt(2);
				switch (lances04) {
					case 0: // Lance 04 - Time da Casa
						System.out.println("                        Vem trocando passes o time do " + this.casa.getCasa());
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                                  Enfiada de bola  ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                         São 03 atacantes contra 02 zagueiros ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                            EE VAI ENTRANDO NA GRANDE ÁREA");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                                    CHUUTOOOUUU");
						System.out.println("                          ");
						Thread.sleep(3000);
							Random lance04 = new Random();
							int gol04 = lance04.nextInt(2);
							switch (gol04) {
								case 0: // gol
									System.out.println("                              TAAA NA REDEEE, Gooooolllllllll  ");
									System.out.println("                                  Doooooo " + this.casa.getCasa() + "!!!");
									this.casa.fazerGols();
									this.casa.fazerGolsPartida();
									this.fora.sofrerGols();
									this.fora.sofrerGolsPartida();
									System.out.println("----------------------------------------------------------------------------------------");
									break;
									
								case 1: // fora
									System.out.println("                                   PRAAA FORAAA!!!! ");
									System.out.println("----------------------------------------------------------------------------------------");
								
									break;
							}
						Thread.sleep(3000);
						break;
					case 1: // Lance 04 - Time visitante 
						System.out.println("                        Vem trocando passes o time do " + this.fora.getFora());
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                                     Enfiada de bola");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                         São 03 atacantes contra 02 zagueiros ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                            EE VAI ENTRANDO NA GRANDE ÁREA");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                                    CHUUTOOOUUU");
						System.out.println("                          ");
						Thread.sleep(3000);
						Random lance004 = new Random();
						int gol004 = lance004.nextInt(2);
						switch (gol004) {
							case 0: // gol
								System.out.println("                              TAAA NA REDEEE, Gooooolllllllll  ");
								System.out.println("                                Doooooo " + this.fora.getFora() + "!!!");
								this.fora.fazerGols();
								this.fora.fazerGolsPartida();
								this.casa.sofrerGols();
								this.casa.sofrerGolsPartida();
								System.out.println("----------------------------------------------------------------------------------------");
								break;
								
							case 1: // fora
								System.out.println("                                   PRAAA FORAAA!!!! ");
								System.out.println("----------------------------------------------------------------------------------------");
								break;
						}
						Thread.sleep(3000);
						break;		
			}
				
				//---------------------------------------------------------------------------------------------
				//Lance 05
				
				Thread.sleep(5000);
				Random aleatorio05 = new Random();
				int lances05 = aleatorio05.nextInt(2);
				switch (lances05) {
					case 0: // Lance 05 - Time da Casa
						System.out.println("                        E tem escanteio para o time do " + this.casa.getCasa());
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                           Pode pintar o cruzamento na area!  ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                  Cruzamento na area ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                              VEM O ZAGUEIRO DE CABEÇAAA");
						Thread.sleep(3000);
						System.out.println("                          ");
						Thread.sleep(3000);
							Random lance05 = new Random();
							int gol05 = lance05.nextInt(2);
							switch (gol05) {
								case 0: // gol
									System.out.println("                                      NO CANTINHOOOO  ");
									System.out.println("                          ");
									Thread.sleep(1500);
									System.out.println("                                      Gooooolllllllll  ");
									System.out.println("                          ");
									Thread.sleep(1500);
									System.out.println("                                  Doooooo " + this.casa.getCasa() + "!!!");
									this.casa.fazerGols();
									this.casa.fazerGolsPartida();
									this.fora.sofrerGols();
									this.fora.sofrerGolsPartida();
									System.out.println("----------------------------------------------------------------------------------------");
									break;
									
								case 1: // fora

									System.out.println("                                   NA TRAVEEEEE!!!! ");
									System.out.println("                          ");
									Thread.sleep(1500);
									System.out.println("                         A BOLA BATE NA TRAVE E VAI PRA FORAAA!!!! ");
									System.out.println("----------------------------------------------------------------------------------------");
								
									break;
							}
						Thread.sleep(3000);
						break;
					case 1: // Lance 05 - Time visitante 
						System.out.println("                        E tem escanteio para o time do " + this.fora.getFora());
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                           Pode pintar o cruzamento na area!  ");
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                                  Cruzamento na area ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                              VEM O ZAGUEIRO DE CABEÇAAA");
						Thread.sleep(3000);
						System.out.println("                          ");
						Thread.sleep(3000);;
						Random lance005 = new Random();
						int gol005 = lance005.nextInt(2);
						switch (gol005) {
							case 0: // gol
								System.out.println("                                      NO CANTINHOOOO  ");
								System.out.println("                          ");
								Thread.sleep(1500);
								System.out.println("                                      Gooooolllllllll  ");
								System.out.println("                          ");
								Thread.sleep(1500);
								System.out.println("                                Doooooo " + this.fora.getFora() + "!!!");
								this.fora.fazerGols();
								this.fora.fazerGolsPartida();
								this.casa.sofrerGols();
								this.casa.sofrerGolsPartida();
								System.out.println("----------------------------------------------------------------------------------------");
								break;
								
							case 1: // fora
								System.out.println("                                   NA TRAVEEEEE!!!! ");
								System.out.println("                          ");
								Thread.sleep(1500);
								System.out.println("                         A BOLA BATE NA TRAVE E VAI PRA FORAAA!!!! ");
								System.out.println("----------------------------------------------------------------------------------------");
								break;
						}
						Thread.sleep(3000);
						break;		
			}
				
				//---------------------------------------------------------------------------------------------
				//Lance 06
				
				Thread.sleep(5000);
				Random aleatorio06 = new Random();
				int lances06 = aleatorio06.nextInt(2);
				switch (lances06) {
					case 0: // Lance 06 - Time da Casa
						System.out.println("                              E pode ser o último lance do jogo");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                            Vem chegando o time do " + this.casa.getCasa());
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                             E Vem cortando a zaga na grande área ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                                       Ajeitoooo");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                                       Bateeeeu");
						System.out.println("                          ");
						Thread.sleep(3000);
							Random lance06 = new Random();
							int gol06 = lance06.nextInt(2);
							switch (gol06) {
								case 0: // gol

									System.out.println("                               GOLAÇO GOLAÇO GOLAÇOOOOO ");
									System.out.println("                                  Doooooo " + this.casa.getCasa() + "!!!");
									this.casa.fazerGols();
									this.casa.fazerGolsPartida();
									this.fora.sofrerGols();
									this.fora.sofrerGolsPartida();
									System.out.println("----------------------------------------------------------------------------------------");
									break;
									
								case 1: // fora
									System.out.println("                          Passa pelo Lado do gol e vai pra fora ");
									System.out.println("----------------------------------------------------------------------------------------");
								
									break;
							}
						Thread.sleep(3000);
						break;
					case 1: // Lance 06 - Time visitante 
						System.out.println("                              E pode ser o último lance do jogo");
						Thread.sleep(2000);
						System.out.println("                          ");
						System.out.println("                          ");
						System.out.println("                        Vem chegando o time do " + this.fora.getFora());
						System.out.println("                          ");
						Thread.sleep(2000);
						System.out.println("                         E Vem cortando a zaga na grande área ");
						System.out.println("                          ");
						Thread.sleep(3000);
						System.out.println("                                      Ajeitoooo");
						Thread.sleep(3000);
						System.out.println("                          ");
						System.out.println("                                      Bateeeeu");
						System.out.println("                          ");
						Thread.sleep(3000);
						Random lance006 = new Random();
						int gol006 = lance006.nextInt(2);
						switch (gol006) {
							case 0: // gol
								System.out.println("                                  GOLAÇO GOLAÇO GOLAÇOOOOO ");
								System.out.println("                                Doooooo " + this.fora.getFora() + "!!!");
								this.fora.fazerGols();
								this.fora.fazerGolsPartida();
								this.casa.sofrerGols();
								this.casa.sofrerGolsPartida();
								System.out.println("----------------------------------------------------------------------------------------");
								break;
								
							case 1: // fora
								System.out.println("                          Passa pelo Lado do gol e vai pra fora! ");
								System.out.println("----------------------------------------------------------------------------------------");
								break;
						}
						Thread.sleep(3000);
						break;		
			}
				
				
				
				//--------------------------------------------------------------------------------
				// Final do jogo - Resultado;
				
				if (this.casa.getGolsPartida() == this.fora.getGolsPartida()) {
					System.out.println("E hoje, um ponto pra cada, no empate do jogo!");
					System.out.println("----------------------------------------------------------------------------------------");
					this.casa.empatarPartida();
					this.fora.empatarPartida();
				} else if (this.casa.getGolsPartida() < this.fora.getGolsPartida()) {
					System.out.println("E hoje quem saiu com a vitória foi o " + this.fora.getFora() + ", jogando longe da sua torcida, fez valer a pena a viagem.");
					System.out.println("----------------------------------------------------------------------------------------");
					this.fora.ganharPartida();
					this.casa.perderPartida();
				} else {
					System.out.println("E hoje quem saiu com a vitória foi o " + this.casa.getCasa() + ", com o apoio da torcida!");
					System.out.println("----------------------------------------------------------------------------------------");
					this.casa.ganharPartida();
					this.fora.perderPartida();
			}
		}
	}
}

