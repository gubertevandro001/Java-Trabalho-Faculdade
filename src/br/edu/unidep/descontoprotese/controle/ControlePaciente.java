package br.edu.unidep.descontoprotese.controle;

import java.util.Scanner;

import br.edu.unidep.descontoprotese.colecoes.Pacientes;
import br.edu.unidep.descontoprotese.model.Paciente;
import br.edu.unidep.descontoprotese.model.Protese;
import br.edu.unidep.descontoprotese.repositorio.RepositorioPaciente;

public class ControlePaciente implements RepositorioPaciente{
	
	Scanner sc = new Scanner (System.in);
	Pacientes pacientes = new Pacientes();

	@Override
	public void cadastrarPaciente(Paciente paciente) {
		System.out.println("\n====CADASTRO DE PACIENTES====");
		
		System.out.print("\nNome: ");
		paciente.setNome(sc.next());
		sc.nextLine();
		
		System.out.print("Idade: ");
		paciente.setIdade(sc.nextInt());
		
		System.out.print("Renda R$: ");
		paciente.setRenda(sc.nextDouble());
		
		pacientes.adicionarPaciente(paciente);
		
		System.out.print("\nContinuar Cadastrando?\n1 - Sim\n2 - Não\nInforme: ");
		Integer resposta = sc.nextInt();
		
		if (resposta == 1) {
			cadastrarPaciente(new Paciente());
		}
		else {
			mostrarPacientes(paciente);
		}
	}

	
	public void mostrarPacientes(Paciente paciente) {
		for (Paciente pac : pacientes.getPacientes()) {
			pac.calculaDescontoProtese(Protese.VALOR_PROTESE);
			System.out.println(pac);
		}
	}
}

