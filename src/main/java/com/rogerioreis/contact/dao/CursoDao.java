package com.rogerioreis.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.contact.entity.Curso;

@Repository
public interface CursoDao extends JpaRepository<Curso, Long> {

}
