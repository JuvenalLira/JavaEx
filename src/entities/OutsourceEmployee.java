package entities;

public class OutsourceEmployee extends Employees{
	private String name;
	private Integer hours;
	private Double valuePerHour;
	private Double additionalCharge;
	
	public OutsourceEmployee(String name, Integer hours, Double ValuePerHour, Double additionalCharge) {	
		super(name, hours, ValuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment()+(additionalCharge*1.1);
	}
}
