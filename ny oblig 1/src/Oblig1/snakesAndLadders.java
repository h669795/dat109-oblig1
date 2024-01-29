package Oblig1;

public class snakesAndLadders {

	public static void main(String[] args) throws InterruptedException {
		Dice die = new Dice();
		Board brett = new Board();
		Player[] spillere = { new Player("Nikolai", new Piece(brett)), new Player("Maxwell", new Piece(brett)) };
		boolean ferdig = false;
		while (!ferdig) {

			for (int i = 0; i < spillere.length; i++) {
				int trill = 0;
				do {
					trill = die.roll();
					spillere[i].playTurn(trill);
					if (spillere[i].vunnet()) {
						ferdig = true;
						break;
					}
				}while(trill==6 && !spillere[i].erIFengsel());
				if(spillere[i].vunnet()) {
					break;
				}
				spillere[i].settTeller(0);
				
				
				//if(trill==6) {
//					trill = die.roll();
//					spillere[i].playTurn(trill);
//					if (spillere[i].vunnet()) {
//						ferdig = true;
//						break;
//					}
//				}if(trill==6) {
//					trill = die.roll();
//					spillere[i].playTurn(trill);
//					if (spillere[i].vunnet()) {
//						ferdig = true;
//						break;
//					}
//				}
//				
//				if(trill==6) {
//					
//					spillere[i].settIFengsel();
//				
//					
//				}
//					
					
				System.out.println();
				
			}//for

		}//while

	}//class

}
