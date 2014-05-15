/**
 * 
 */
package br.com.todo.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import br.com.todo.model.Todo;

/**
 * @author VictorSampaio
 * 
 */
public class TodoIo {
	private static final String DELIMITADOR = ":";
	private File arquivo;

	public TodoIo(String arquivo) {
		this.arquivo = new File(arquivo);
	}

	public void gravarRegistro(Todo todo) throws IOException{
		StringBuffer registro = new StringBuffer();
		registro.append(todo.getTarefa());
		registro.append(DELIMITADOR);
		registro.append(todo.getPrioridade());
		registro.append(DELIMITADOR);
		registro.append(todo.getPrazo());
		registro.append(DELIMITADOR);
		
		PrintWriter out = new PrintWriter(new FileWriter(this.arquivo, true));
		out.println(registro.toString());
		out.close();
		
		
		
		
	}
}
