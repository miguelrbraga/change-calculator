package changecalculatorad;

public class TenPencesCoin extends Coin {
	
	private static final int VALUE = 10;
	private static final String DESCRIPTION = "TEN PENCES";
	
	public TenPencesCoin() {
		
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
