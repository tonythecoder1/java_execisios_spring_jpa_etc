package streams;

public class media_teste {
	
	public static void main(String[] args) {
		
		
		media m1 = new media().adicionar(2.5).adicionar(2.4).adicionar(4.5).adicionar(10.4);
		media m2 = new media().adicionar(3.5).adicionar(1.4).adicionar(3.5).adicionar(5.4);
		
		System.out.println(m1.get_valor());
		System.out.println(m2.get_valor());
		
		System.out.println(media.combinar(m1, m2).get_valor());
		
		
	}

}
