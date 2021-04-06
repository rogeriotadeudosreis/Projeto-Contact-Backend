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

import com.rogerioreis.contact.dao.PedidoDao;
import com.rogerioreis.contact.entity.Pedido;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/pedido")
public class PedidoRest {

	@Autowired
	private PedidoDao pedidoDao;

	@GetMapping
	@ApiOperation(value = "Método consultar todos os pedidos")
	public List<Pedido> get() {
		return pedidoDao.findAll();
	}

	@PostMapping
	@ApiOperation(value = "Método incluir ou alterar um registro de pedido")
	public void post(@RequestBody Pedido pedido) {
		pedidoDao.save(pedido);
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Método excluir um registro de pedido")
	public void delete(@PathVariable("id") Long id) {
		pedidoDao.deleteById(id);
	}

}
