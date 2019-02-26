package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	public static void main(String[] args) {
		Zodiac artin = Zodiac.GEMINI;
		displayhoroscope(artin);
	}
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void displayhoroscope(Zodiac z) {
		switch(z) {
		case ARIES:
			JOptionPane.showMessageDialog(null,"The Ram");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null,"The Bull");
			break;
		case GEMINI: 
			JOptionPane.showMessageDialog(null,"The Twins");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null,"The Crab");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null,"The Lion");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null,"The Maiden");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null,"The Scales");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null,"The Scorpion");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null,"The Archer");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null,"The Mountain Sea-goat");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null,"The Water-bearer");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null,"The fish");
			break;
		}
	}
	// 3. Make a main method to test your method
	
}
