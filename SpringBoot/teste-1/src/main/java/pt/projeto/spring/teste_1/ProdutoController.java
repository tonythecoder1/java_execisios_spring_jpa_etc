package pt.projeto.spring.teste_1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository_gestor;

    @PostMapping
    public ResponseEntity<Object> novoProduto(@RequestParam(defaultValue = "Produto Padrão") String nome, @RequestParam Double preco) {
    	
    	try {
    		Produto produto = new Produto(nome, preco);
            produtoRepository_gestor.save(produto);
            return ResponseEntity.ok(produto);
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("Erro ao salvar o produto: " + e.getMessage());
		}
    	
    	
    	
        
    }
}