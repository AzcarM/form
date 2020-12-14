package com.form.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Entity
public class Preguntas {
	@Id
	private int idPregunta;
	
	@Column(name= "Pregunta", length = 250)
	private String Pregunta;
	
	@NotNull(message="La respuesta es obligatoria")
    @Max(value=250, message="Máximo es 250 caracteres")
	private String respuesta;

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(int idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getPregunta() {
		return Pregunta;
	}

	public void setPregunta(String pregunta) {
		Pregunta = pregunta;
	}
	
}
