

public class Won2Dollar extends Converter {
	
	Won2Dollar(double ratio){
		this.ratio = ratio;
	}
	
	@Override
	double convert(double src) {
		
		return src/ratio;
	}

	@Override
	public String getSrcString() {
		
		return "원";
	}

	@Override
	public String getDestString() {
		
		return "달러";
	}
	
	

}
