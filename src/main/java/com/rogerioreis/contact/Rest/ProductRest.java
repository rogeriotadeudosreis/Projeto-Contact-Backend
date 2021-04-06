package com.rogerioreis.contact.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.contact.dao.ProductDao;
import com.rogerioreis.contact.entity.Product;

import io.swagger.annotations.ApiOperation;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/product") // configura a url do webservice
public class ProductRest {
	
	@Autowired // injeta uma instância de productDao aqui
	private ProductDao productDao;
	
	@GetMapping // expõe o método GET
	@ApiOperation(value = "Método consultar todos produtos")
	public List<Product> get(){
		return productDao.findAll();
	}
	
	@PostMapping // expõe o método POST
	@ApiOperation(value = "Método incluir ou salvar um produto")
	public void post(@RequestBody Product product) {
		productDao.save(product);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Método excluir um produto")
	public void delete (@PathVariable("id") Long id) {
		productDao.deleteById(id);
	}

}
