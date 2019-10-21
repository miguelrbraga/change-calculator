package changecalculatorad;

public class TwentyPencesCoin extends Coin {
	
	private static final int VALUE = 20;
	private static final String DESCRIPTION = "TWENTY PENCES";
	
	public TwentyPencesCoin() {
		
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
