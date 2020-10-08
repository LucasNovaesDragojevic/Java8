import static java.util.Comparator.comparing;
import java.util.ArrayList;
import java.util.List;

public class TesteMetodoForeach {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		palavras.sort(comparing(String::length));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

		palavras.forEach(System.out::println);
	}
}