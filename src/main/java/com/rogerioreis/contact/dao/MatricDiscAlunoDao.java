package com.rogerioreis.contact.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rogerioreis.contact.entity.Matric_Disc_Aluno;

@Repository
public interface MatricDiscAlunoDao extends JpaRepository<Matric_Disc_Aluno, Long> {

}
