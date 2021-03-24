package com.rogerioreis.contact.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rogerioreis.contact.dao.ContactDao;
import com.rogerioreis.contact.entity.Contact;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/contact")
@Api(value = "API REST Contact")
@CrossOrigin("*")
public class ContactRest {
	
	@Autowired
	private ContactDao contactDao;
	
	@GetMapping
	@ApiOperation(value ="Método que retorna uma lista de todos os contatos")
	public List<Contact> get(){
		return contactDao.findAll();
	}
	
	@PostMapping
	@ApiOperation(value ="Método salva um contato")
	public void post(@RequestBody Contact contact) {
		contactDao.save(contact);
	}
	
	@PutMapping
	@ApiOperation(value ="Método salva um contato")
	public void put(@RequestBody Contact contact) {
		contactDao.save(contact);
	}
	
	@DeleteMapping("/{id}")
	@ApiOperation(value ="Método que deleta um contato")
	public void delete(@PathVariable("id") Integer id) {
		contactDao.deleteById(id);
	}

}
