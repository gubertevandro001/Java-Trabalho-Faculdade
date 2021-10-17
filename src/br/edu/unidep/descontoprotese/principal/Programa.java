package br.edu.unidep.descontoprotese.principal;

import br.edu.unidep.descontoprotese.controle.ControlePaciente;
import br.edu.unidep.descontoprotese.model.Paciente;

public class Programa {

	public static void main (String[] args) {
	
	ControlePaciente controlePaciente = new ControlePaciente();
	Paciente paciente = new Paciente();
	
	controlePaciente.cadastrarPaciente(paciente);
	
	}

}
