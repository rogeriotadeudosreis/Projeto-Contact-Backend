package com.rogerioreis.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.contact.entity.Pedido;

@Repository
public interface PedidoDao extends JpaRepository<Pedido, Long> {

}
