package br.edu.unidep.descontoprotese.colecoes;

import java.util.ArrayList;
import java.util.List;

import br.edu.unidep.descontoprotese.model.Paciente;

public class Pacientes {
	
	private List<Paciente> pacientes = new ArrayList<>();

	public List<Paciente> getPacientes() {
		return pacientes;
	}
	
	public void adicionarPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}
}
