package campo.minado.modelo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.lang.model.util.ElementKindVisitorPreview;

import org.junit.jupiter.api.Test;

import pt.coder.projeto.excecao.ExplosaoException;
import pt.coder.projeto.modelo.campo;

public class campo_teste {
	
	campo c1Campo = new campo(3, 3);
	
	@Test
	void teste_vizinho() {
		
		campo vizinho = new campo(3, 2);
		boolean verifica_add_vizinho = c1Campo.adicionar_vizinho(vizinho);
		assertTrue(verifica_add_vizinho);
		
	}
	
	@Test
	void teste_nao_vizinho() {
		
		campo vizinhoCampo = new campo(1, 1);
		boolean verifica_add = c1Campo.adicionar_vizinho(vizinhoCampo);
		assertFalse(verifica_add);
	}
	
	@Test
	void teste_valor_marcado() {
		
		assertFalse(c1Campo.ismarcado());
	}
	
	@Test
	void teste_alterar_marcado() {
		c1Campo.mudar_marcacao();
		assertTrue(c1Campo.ismarcado());
	}
	
	@Test
	void abrir_teste_nao_minado_nao_marcado() {
		assertTrue(c1Campo.abrir());
	}
	
	@Test
	void abrir_teste_nao_minado_marcado() {
		c1Campo.mudar_marcacao();
		assertFalse(c1Campo.abrir());
	}
	
	@Test
	void abrir_minado_nao_marcado() {
		c1Campo.minar_campo();
		
		assertThrows(ExplosaoException.class, () -> {
			c1Campo.abrir();	
		});
		
	}
	
	@Test
	void abrir_com_vizinhos() {
		
		campo vizinho1 = new campo(2, 2);
		
		campo vizinho_minado = new campo(1, 1);
		vizinho_minado.minar_campo();
		
		campo vizinho_do_vizinho1 = new campo(1, 1);
		vizinho1.adicionar_vizinho(vizinho_do_vizinho1);
		vizinho1.adicionar_vizinho(vizinho_minado);
		
		
		c1Campo.adicionar_vizinho(vizinho1);
		c1Campo.abrir();
		
		
		assertTrue(vizinho1.is_aberto() && !vizinho_do_vizinho1.is_aberto());
		
	}
	
	
	

}
