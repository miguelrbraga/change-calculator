package changecalculatorad;

public class TwoPencesCoin extends Coin {

	private static final int VALUE = 2;
	private static final String DESCRIPTION = "TWO PENCES";
	
	public TwoPencesCoin() {
		
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
