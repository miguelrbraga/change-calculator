package changecalculatorad;

public class FiftyPencesCoin extends Coin {

	private static final int VALUE = 50;
	private static final String DESCRIPTION = "FIFTY PENCES";
	
	public FiftyPencesCoin() {
		
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
