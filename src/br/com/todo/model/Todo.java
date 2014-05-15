/**
 * 
 */
package br.com.todo.model;

/**
 * @author VictorSampaio
 * 
 */
public class Todo {

	private String tarefa;
	private String prioridade;
	private String prazo;

	public Todo() {
		this.tarefa = null;
		this.prioridade = null;
		this.prazo = null;
	}

	public Todo(String tarefa, String prioridade, String prazo) {
		this.tarefa = tarefa;
		this.prioridade = prioridade;
		this.prazo = prazo;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

}
