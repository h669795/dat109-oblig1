package Oblig1;

public class Piece {

	private Square square;
	private Board brett;

	public Piece(Board brett) {
		this.brett = brett;
		square = brett.getSquare(0);
	}

	/*
	 * Skjekker om vi kom lengre enn mål slik at vi ikke gjør noe eller
	 * flytte piece indexen/squaren
	 */
	public void flytt(int id) {
		if (lovlig(id)) {
			System.out.println("Gikk fra " + square.gamleId() + " til " + id);
			square = brett.getSquare(id);

			if (square.stige()) {
				System.out.println(id + " var en stige. Klatret fra " + square.gamleId() + " til " + square.update());
				square = brett.getSquare(square.update());
			} else if (square.slange()) {
				System.out.println(id + " var en slange. Ramlet fra " + square.gamleId() + " til " + square.update());
				square = brett.getSquare(square.update());
			}
		} else {
			System.out.println(id + " er hoeyere enn 100 saa blir staaende paa " + square.gamleId());
		}

	}

	public int index() {
		return square.gamleId();
	}

	private boolean lovlig(int id) {
		return id < 101;
	}
	
	public void settSquare(int ind) {
		square = brett.getSquare(ind);
	}

}
