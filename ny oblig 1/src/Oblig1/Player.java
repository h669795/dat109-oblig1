package Oblig1;

public class Player {
	private String name;
	private Piece piece;
	private boolean vunnet;
	private boolean fengsel;
	private int teller;
	
	
	public Player(String name, Piece piece) {
		this.name = name;
		this.piece = piece;
		vunnet= false;
		fengsel = false;
		teller = 0;
		
	}
	
	/*
	 * Skjekke om vi skal i fengsel hvis vi er i fengsel
	 * så skal vi sleppes fri hvis ikke. Hvis ikke fenget
	 * så beveger og skjekk hvis du vant. Kaste 6 logikk.
	 * 
	 */
	
	public void playTurn(int kast) throws InterruptedException {
		Thread.sleep(1000);
		
		
		System.out.println(name + " kastet: " + kast);
		if(fengsel && kast == 6) {
			settFriFengsel();
		}
		if(kast == 6) {
			teller++;
		}
		if(teller==3) {
			settIFengsel();
		}
		
		
		if(!fengsel) {
		piece.flytt(piece.index()+kast);
		
		if(piece.index()==100) {
			System.out.println(name + " har vunnet!");
			vunnet = true;
		}
		
		
		}else {
			System.out.println(name + " ennå i fengsel");
		}
		
		System.out.println();
	}
	public boolean vunnet() {
		return vunnet;
	}
	public void settIFengsel() {
		fengsel = true;
		piece.settSquare(0);
		System.out.println(name + " trillet 6 tre ganger og ble satt i fengsel. Flyttet til index 0");
	}
	/*Metoder for å sette folk i fengsel hvis teller var 3 også sleppe fri hvis vi trillet 6 og var i fengsel
	 * 
	 * 
	 */
	private void settFriFengsel() {
		fengsel = false;
		System.out.println(name +" er nå fri fra fengsel");
	}
	
	/*Skjekke om vi er i fengsel 
	 * settTeller setter vi teller til 0 i main for å resette kast 6 telleren. Eventuelt bare sette den rett til 0
	 * og ikke til index gitt med
	 */
	public boolean erIFengsel() {
		return fengsel;
	}
	public void settTeller(int i) {
		teller = i;
	}
	
}
