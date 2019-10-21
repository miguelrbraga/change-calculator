package changecalculatorad;

public class ChangeCalculator {

	public static void main(String[] args) {
		
		Coin[] coins = new Coin[] {
				new OnePoundCoin(), new FiftyPencesCoin(), new TwentyPencesCoin(),
				new TenPencesCoin(), new FivePencesCoin(), new TwoPencesCoin(), new OnePenceCoin()
		};
		
		Payment parking = new Payment(267, 500, coins);
		parking.processChange();
	}
}
