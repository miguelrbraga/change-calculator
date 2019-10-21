package changecalculatorad;

public abstract class Coin {
	
	private int value;
	private int amount;
	private String description;
	
	public abstract int calculateAmount(int changeLeft);
	
	public int getValue() {
		return value;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	protected void setValue(int value) {
		this.value = value;
	}
	
	protected void setAmount(int amount) {
		this.amount = amount;
	}

	protected void setDescription(String description) {
		this.description = description;
	}
}
