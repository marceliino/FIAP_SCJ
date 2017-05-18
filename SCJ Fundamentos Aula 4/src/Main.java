import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
	
	public static void main(String[]args) {
		Grupo<String> grupo = new Grupo<String>();
		Grupo<Integer> grupo2 = new Grupo<Integer>();
		
		grupo2.add(1);
		
		Stack<String> pilha = new Stack<>();
		pilha.push("1");
		pilha.push("2");
		pilha.push("3");
		
		System.out.println(pilha.size());
		System.out.println(pilha.pop());
		System.out.println(pilha.size());
		System.out.println(pilha.peek());
		System.out.println(pilha.size());
		
		Queue<String> fila = new PriorityQueue<>();
		fila.add("a");
		fila.add("b");
		fila.add("c");
		fila.add("d");
		
		System.out.println(System.getProperties());
		//http://stackoverflow.com/questions/8153332/how-can-i-decrypt-a-password-that-is-in-the-jboss-login-config-xml
		
	}

}
