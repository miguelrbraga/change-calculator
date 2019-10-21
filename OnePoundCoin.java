package changecalculatorad;

public class OnePoundCoin extends Coin {
	
	private static final int VALUE = 100;
	private static final String DESCRIPTION = "ONE POUND";
	
	public OnePoundCoin() {
		
		super();
		this.setValue(VALUE);
		this.setDescription(DESCRIPTION);
		
	}

	@Override
	public int calculateAmount(int changeLeft) {
		
		int amountCoins = changeLeft/VALUE;
		this.setAmount(amountCoins);
		
		return amountCoins;	
	}
}
