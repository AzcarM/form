package com.form.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.form.model.Preguntas;

public interface IPreguntaRepo extends JpaRepository<Preguntas, Integer>{

}
