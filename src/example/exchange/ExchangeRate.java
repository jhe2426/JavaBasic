package example.exchange;

//환율
public class ExchangeRate {
	
	//외부에서 보이지 않게 하기 위해(정보 은닉) private접근 제어자를 사용
	//해당 멤버 변수를 초기화 해주기 위해 변수를 매겨변수로 받는 public 생성자를 이용한다.
	//멤버 변수를 가져와 사용하거나 가져와서 값을 바꿀 때는 접근제어자가 public인 setter메서드와 getter메서드를 호출하여 각 각의 작업을 한다. 
	private String exchangingCurrency; //들어온 화폐  (ex. 원화, 달러, 엔화, 위완화...)
	private String exchangedCurrency; //바꿀 화폐 (ex. 원화, 달러, 엔화, 위완화...)
	private double exchangeRate; // 환율 ( 1000 / 1316.30)

	ExchangeRate(){}
	
	public ExchangeRate(String exchangingCurrency, String exchangedCurrency, double exchangeRate) {
		this.exchangingCurrency = exchangingCurrency;
		this.exchangedCurrency = exchangedCurrency;
		this.exchangeRate = exchangeRate;
	}
	
	//get메서드
	//인스턴스가 가지고 있는 특정 인스턴스 변수의 값을 반환해주기 위한 메서드
	//해당 인스턴스의 특정 인스턴스 변수를 반환해주는 메서드
	public String getExchangingCurrency() {
		return exchangingCurrency;
	}

	public void setExchangingCurrency(String exchangingCurrency) {
		this.exchangingCurrency = exchangingCurrency;
	}

	public String getExchangedCurrency() {
		return exchangedCurrency;
	}

	//set메서드
	//인스턴스가 가지고 있는 특정 인스턴스 변수를 변경할 때 사용하는 메서드
	public void setExchangedCurrency(String exchangedCurrency) {
		this.exchangedCurrency = exchangedCurrency;
	}

	public double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@Override
	public String toString() {
		return "ExchangeRate [exchangingCurrency=" + exchangingCurrency + ", exchangedCurrency=" + exchangedCurrency
				+ ", exchangeRate=" + exchangeRate + "]";
	}

}
