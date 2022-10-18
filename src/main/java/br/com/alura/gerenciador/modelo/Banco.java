package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa1 = new Empresa();
		empresa1.setId(chaveSequencial++);
		empresa1.setNome("Alura");

		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		
		empresas.add(empresa1);
		empresas.add(empresa2);
		
		Usuario usuario1 = new Usuario();
		usuario1.setLogin("rodson");
		usuario1.setSenha("12345");
		
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("dani");
		usuario2.setSenha("12345");
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
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
		return empresas.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
	}

	public void editaEmpresa(Empresa empresa) {
		Empresa empresaAtual = buscaEmpresa(empresa.getId());
		empresaAtual.setNome(empresa.getNome());
		empresaAtual.setDataAbertura(empresa.getDataAbertura());
	}

	public Usuario existeUsuario(String login, String senha) {		
		return usuarios.stream().filter(u -> u.ehIgual(login, senha)).findFirst().orElse(null);
	}
}
