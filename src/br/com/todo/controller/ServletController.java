package br.com.todo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.todo.io.TodoIo;
import br.com.todo.model.Todo;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processaRequisicao(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.processaRequisicao(request, response);
	}
	
	private void processaRequisicao(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		String tarefa = request.getParameter("tarefa");
		String prioridade = request.getParameter("prioridade");
		String prazo = request.getParameter("prazo");
		
		Todo todo = new Todo();
		todo.setTarefa(tarefa);
		todo.setPrioridade(prioridade);
		todo.setPrazo(prazo);
		
		String arquivo = this.getServletContext().getRealPath("/WEB-INF/todo.txt");
		TodoIo io = new TodoIo(arquivo);
		io.gravarRegistro(todo);
		
		request.setAttribute("TodoBean", todo);
		
		RequestDispatcher view = request.getRequestDispatcher("sucesso.jsp");
		view.forward(request, response);
		
		
	}

}
