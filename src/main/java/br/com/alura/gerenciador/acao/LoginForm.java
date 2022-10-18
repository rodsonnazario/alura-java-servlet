package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class LoginForm implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		System.out.println("Formulário de login");

		return "forward:formLogin.jsp";
	}
}
