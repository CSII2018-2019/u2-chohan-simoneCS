import javax.swing.JOptionPane;

public class ChoHan {

	public static <roll, loadedDice> void main(String[] args) {
		int points1 = 0; 
		int points2 = 0; 
		
		int rolls = 0; 
		int rolls1 = 0; 
		
		for (int i = 0; i < 5; i++) { 
			int evenvsOdd = (int)(Math.random()* 2) + 1; 
			if (evenvsOdd == 1) { 
				Dice regular = new Dice (); 
				rolls1 = regular.roll(); 
			}
			else { 
				LoadedDice load02 = new LoadedDice(); 
				rolls1 = load02.roll(); 
			}
			String choorhan; if ((rolls + rolls1)%2 ==0) { 
				choorhan = "Cho"; 
			}
			else {
				choorhan = "Han"; 
			}
		String player1 = JOptionPane.showInputDialog(" Player 1: Pick Cho or Han "); 
		String player2 = JOptionPane.showInputDialog(" Player 2: Pick Cho or Han ");
			if (player1.equals(choorhan)) {
				points1 ++; 
				 JOptionPane.showMessageDialog(null, " Yay Player 1 you got it right! ");
			}
			else { 
				JOptionPane.showMessageDialog(null, " Sorry Player 1 you're wrong ");
			}
			if (player2.equals(choorhan)) { 
				points2 ++; 
				JOptionPane.showMessageDialog(null, " Yay Player 2 got it right! ");
			}
			else { 
				JOptionPane.showMessageDialog(null, " Sorry player 2 wrong guess ");
			}
		}

	}

}
