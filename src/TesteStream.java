import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class TesteStream {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		/* Usa filtro e foreach */
		cursos.stream()
				.filter(curso -> curso.getAlunos() >= 50)
				.forEach(System.out::println);
		
		/* Coleta primeiro da lista */
		Optional<Curso> optionalCurso = cursos.stream()
				.filter(curso -> curso.getAlunos() >= 50)
				.findFirst();
		
		if (optionalCurso.isPresent())
			System.out.println(optionalCurso.get());

		/* Mapea proprieade de cada objeto das listas */
		cursos.stream()
				.map(Curso::getNome)
				.forEach(System.out::println);
		
		/* Calcula média */
		OptionalDouble average = cursos.stream()
				.mapToInt(Curso::getAlunos)
				.average();
		
		if (average.isPresent())
			System.out.println(average.getAsDouble());
		
		/* Ordena */
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		
		/* Imprime */
		cursos.forEach(System.out::println);
		
		/* Coleta filtro */
		List<Curso> collect = cursos.stream()
				.filter(curso -> curso.getAlunos() <= 50)
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
