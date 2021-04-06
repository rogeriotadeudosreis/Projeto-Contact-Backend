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

import com.rogerioreis.contact.dao.DisciplinaDao;
import com.rogerioreis.contact.entity.Disciplina;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaRest {
	
	@Autowired
	private DisciplinaDao discDao;
	
	@GetMapping
	@ApiOperation(value = "Retorna uma lista de disciplinas")
	public List<Disciplina> get(){
		return discDao.findAll();
	}
	
	@PostMapping
	@ApiOperation(value = "Salva ou atualiza uma disciplina")
	public void post(@RequestBody Disciplina disciplina) {
		discDao.save(disciplina);		
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta uma disciplina")
	public void delete(@PathVariable("id") Long id) {
		discDao.deleteById(id);
	}

}
