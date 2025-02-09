package Logica;

import java.awt.color.ICC_ColorSpace;
import java.lang.classfile.instruction.ReturnInstruction;
import java.util.ArrayList;
import java.util.List;

public class Memoria {
    
	private enum TipoComando{
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
	};
   
    private static final Memoria instancia = new Memoria();
    
    private List<MemoriaObserver> lista_obeservadores = new ArrayList<MemoriaObserver>();

    private TipoComando ultimaOperacao = null;
    private boolean susbtituir = false;
    private String texto_atual = "";
    private String texto_buffer = "";
    private Double resultado;
  
    private Memoria() {}

   
    public static Memoria getInstancia() {
        return instancia;
    }

    public String getTexto_atual() {
        return texto_atual.isEmpty() ? "0" : texto_atual;
    }

    public void setTexto_atual(String novoTexto) {
        this.texto_atual = novoTexto;
    }
    
    public void add_obeservador(MemoriaObserver mo) {
    	lista_obeservadores.add(mo);
    }
    
    public void processar_comando_observador(String valor) {
    	
    	TipoComando tipoc = detetarTipoComando(valor);
    	System.out.println(tipoc);
    	
    	if(tipoc == null) {
    		return;
    	} else if(tipoc == TipoComando.ZERAR) {
    		texto_atual = "";
    		texto_buffer = "";
    		susbtituir = false;
    		ultimaOperacao = null;
    	} else if(tipoc == TipoComando.NUMERO || tipoc == TipoComando.VIRGULA) {
    		
    		texto_atual = susbtituir ? valor : texto_atual + valor;
    		susbtituir = false;
    	} else {
			
    		susbtituir = true;
    		texto_atual = obter_resultado();
    		texto_buffer = texto_atual;
    		ultimaOperacao = tipoc;
    		
		}
    	
    
    	lista_obeservadores.forEach(o -> o.valorAlterado(getTexto_atual()));
    }


	private String obter_resultado() {
		
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return texto_atual;
		}
		
		double numeroBuffer = Double.parseDouble(texto_buffer.replace(",", ".")); 
		double numeroAtual = Double.parseDouble(texto_atual.replace(",", ".")); 
		
		if (ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroAtual + numeroBuffer;
		} else if (ultimaOperacao == TipoComando.SUB) {
			resultado = numeroAtual - numeroBuffer;
		} else if (ultimaOperacao == TipoComando.MULT) {
			resultado = numeroAtual * numeroBuffer;
		} else if (ultimaOperacao == TipoComando.DIV) {
			resultado = numeroAtual / numeroBuffer;
		} 
		
		String resultadoString = resultado.toString().replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		
		return inteiro ? resultadoString.replace(",0", "") : resultadoString;
		
	}


	private TipoComando detetarTipoComando(String valor) {

		if(texto_atual.isEmpty() && texto_atual == "0"){
			return null;
		}
		
		try {
			Integer.parseInt(valor);
			return TipoComando.NUMERO;
		} catch (Exception e) {
			if (valor.equals("AC")) {
				return TipoComando.ZERAR;
			} else if(valor.equals("-")) {
				return TipoComando.SUB;
			} else if(valor.equals("+")) {
				return TipoComando.SOMA;
			} else if(valor.equals("*")) {
				return TipoComando.MULT;
			} else if(valor.equals("/")) {
				return TipoComando.DIV;
			} else if(valor.equals(",") && !texto_atual.contains(",")) {
				return TipoComando.VIRGULA;
			} else if(valor.equals("+")) {
				return TipoComando.IGUAL;
			} else if(valor.equals("=")) {
				return TipoComando.IGUAL;
			}
			
		}
		
		
		
		return null;
	}

}
