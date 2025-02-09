package funcoes_l;

@FunctionalInterface
public interface calculo {

	public double executar(double a, double b);
	
	default String legal() {
		
		return "Legal";
	}
	
	static String muitolegal() {
		
		return "Muito Legal";
	}
	
	
	
}
