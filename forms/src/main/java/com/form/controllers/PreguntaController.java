package com.form.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.form.model.Preguntas;
import com.form.repo.IPreguntaRepo;

@Controller
public class PreguntaController {

	@Autowired
	private IPreguntaRepo repo;

	@GetMapping("/load")
	public String geeting(Model model) {
		model.addAttribute("preguntas", repo.findAll());
		return "form";
	}

	@PostMapping("/save")
	public ModelAndView guardar(@Valid Preguntas preguntas, BindingResult result) {
		ModelAndView model = new ModelAndView();
        model.addObject("preguntas", preguntas);
        model.setViewName(result.hasErrors() ? "form" : "entry"); 
        return model;
	}
}
