package Oblig1;

public class Board {

	private Square[] squares;
	
	public Board() {
		squares = new Square[] {
				new Square(0,0),new Square(1,38),new Square(2,2),new Square(3,3),new Square(4,14),new Square(5,5),
				new Square(6,6), new Square(7,7), new Square(8,30),new Square(9,9),new Square(10,10),new Square(11,11),
				new Square(12,12),new Square(13,13),new Square(14,14),new Square(15,15),new Square(16,16),
				new Square(17,17),new Square(18,18), new Square(19,19),new Square(20,20),new Square(21,42),
				new Square(22,22),new Square(23,23),new Square(24,24),new Square(25,25),new Square(26,26),new Square(27,27)
				,new Square(28,76),new Square(29,29),new Square(30,30),new Square(31,31),new Square(32,10), new Square(33,33)
				,new Square(34,34),new Square(35,35), new Square(36,6),new Square(37,37),new Square(38,38),new Square(39,39)
				,new Square(40,40),new Square(41,41),new Square(42,42),new Square(43,43),new Square(44,44),new Square(45,45),
				new Square(46,46),new Square(47,47),new Square(48,26),new Square(49,49),new Square(50,67),  new Square(51,51),
				new Square(52,52), new Square(53,53), new Square(54,54),new Square(55,55), new Square(56,56),new Square(57,57),
				new Square(58,58),new Square(59,59),new Square(60,60),new Square(61,61), new Square(62,18),new Square(63,63),
				new Square(64,64), new Square(65,65),new Square(66,66),new Square(67,67),new Square(68,68), new Square(69,69),
				new Square(70,70),new Square(71,92), new Square(72,72),new Square(73,73), new Square(74,74),new Square(75,75),
				new Square(76,76),new Square(77,77),new Square(78,78),new Square(79,79),new Square(80,99), new Square(81,81),
				new Square(82,82),new Square(83,83),new Square(84,84),new Square(85,85),new Square(86,86),new Square(87,87),
				new Square(88,24),new Square(89,89),new Square(90,90),new Square(91,91),new Square(92,92),new Square(93,93),
				new Square(94,94),new Square(95,56),new Square(96,96),new Square(97,78),new Square(98,98),new Square(99,99),
				new Square(100,100)
		};	
		
	}
	/*
	 * Returner verdien squaren (snake, ladder eller ingenting)
	 */
	public Square getSquare(int id) {
		return squares[id];
	}
	
}