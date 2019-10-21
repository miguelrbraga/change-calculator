package changecalculatorad;

public class OnePenceCoin extends Coin {

	private static final int VALUE = 1;
	private static final String DESCRIPTION = "ONE PENCE";
	
	public OnePenceCoin() {
		
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
