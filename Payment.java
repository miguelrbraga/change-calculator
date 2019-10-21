package changecalculatorad;

import java.util.HashMap;
import java.util.Map;

public class Payment {
	
	private static final int NO_CHANGE_LEFT = 0;
	private int change;
	private Coin[] coins;
	
	public Payment(int charges, int amountIntroduced, Coin[] coins) {
		this.change = amountIntroduced - charges;
		this.coins = coins;
	}
	
	public Map<String, Integer> processChange() {
		
		int changeLeft = change;
		Map<String, Integer> amountCoins = new HashMap<>();
		
		while (changeLeft > NO_CHANGE_LEFT) {
			
			Coin adequateCoin = null;
			int maxVal = 0;
		
			for (Coin coin: coins) {
				if (coin.getValue() <= changeLeft && coin.getValue() > maxVal) {
					maxVal = coin.getValue();
					adequateCoin = coin;
				}
			}			
			
			adequateCoin.calculateAmount(changeLeft);
			amountCoins.put(adequateCoin.getDescription(), adequateCoin.getAmount());

			changeLeft -= (adequateCoin.getAmount() * adequateCoin.getValue());
		}
		
		return amountCoins;			
	}
	
}
