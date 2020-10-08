import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteDateTimeApi {

	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		LocalDate amanha = LocalDate.of(2020, Month.OCTOBER, 9);
		System.out.println(amanha);
		
		LocalDate passado = LocalDate.of(1, Month.JANUARY, 1);
		LocalDate futuro = LocalDate.of(3000, Month.JULY, 25);
		Period periodo = Period.between(passado, futuro);
		System.out.println(periodo);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = agora.format(formatador);
		System.out.println(dataFormatada);
		
	}

}
