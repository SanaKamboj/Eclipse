package Solutions;

public enum Suit {
	Club(0), Diamond(1), Heart(3), Spade(4);
	private int value;
	private Suit(int v){
		value = v;
	}
	public int getValue(){return value;}
	public static Suit getSuitfromValue(int value){return null;}
}
