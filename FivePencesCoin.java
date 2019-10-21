package changecalculatorad;

public class FivePencesCoin extends Coin {
	
	private static final int VALUE = 5;
	private static final String DESCRIPTION = "FIVE PENCES";
	
	public FivePencesCoin() {
		
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
