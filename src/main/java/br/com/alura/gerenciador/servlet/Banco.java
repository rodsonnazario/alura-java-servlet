package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Alura");
		empresas.add(empresa1);

		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		empresas.add(empresa2);
	}

	public List<Empresa> getEmpresas() {
		return Banco.empresas;
	}

	public void adicionaEmpresa(Empresa empresa) {
		empresa.setId(chaveSequencial++);
		empresas.add(empresa);
	}

	public void removeEmpresa(Integer id) {
		Empresa empresa = buscaEmpresa(id);
		empresas.remove(empresa);
	}

	public Empresa buscaEmpresa(Integer id) {
		return empresas.stream().filter(e -> e.getId().equals(id)).findFirst().get();
	}

	public void editaEmpresa(Empresa empresa) {
		Empresa empresaAtual = buscaEmpresa(empresa.getId());
		empresaAtual.setNome(empresa.getNome());
		empresaAtual.setDataAbertura(empresa.getDataAbertura());
	}
}
