package streams;

public class media {
	
	double total;
	int quantidade;
	
	public media adicionar(double valor) {
		
		total = total + valor;
		quantidade ++;
		
		return this;
	}
	
	public double get_valor() {
		
		return total / quantidade;
	}
	
	public static media combinar(media m1, media m2) {
		
		media media_final = new media();
		media_final.total = m1.total + m2.total;
		media_final.quantidade = m1.quantidade + m2.quantidade;
		
		return media_final;
	}

}
