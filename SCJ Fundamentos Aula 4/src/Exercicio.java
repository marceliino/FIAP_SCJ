import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio {
	
	public static void main(String[]args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		int tamanho = 1_000_000;
		
		LocalDateTime inicio = LocalDateTime.now();
		for(int i=0; i<= tamanho; i++) {
			list1.add(i);
		}
		LocalDateTime fim = LocalDateTime.now();
		list1.get(tamanho/2);
		System.out.println("Tempo de insercao ArrayList: " + ChronoUnit.MILLIS.between(inicio, fim));
		
		//*********
		inicio = LocalDateTime.now();
		for(int i=0; i<= tamanho; i++) {
			list2.add(i);
		}
		fim = LocalDateTime.now();
		list2.get(tamanho/2);
		System.out.println("Tempo de insercao LinkedList: " + ChronoUnit.MILLIS.between(inicio, fim));
	}
}