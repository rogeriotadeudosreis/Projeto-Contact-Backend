package com.rogerioreis.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.contact.entity.Turma;

@Repository
public interface TurmaDao extends JpaRepository<Turma, Long> {

}
