package com.rogerioreis.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.contact.entity.Aluno;

@Repository
public interface AlunoDao extends JpaRepository<Aluno, Long> {

}
