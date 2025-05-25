import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class PasswordServer extends SingleThreadTCPServer{


	public void handleMessage(String message, PrintWriter out) {
		String[] parts = message.trim().split("\\s+");
		if(parts.length != 3) {
			out.println("Error: debes enviar 3 parámetros (letras, numeros y caracteres especiales).");
        }
		else {
			out.println(this.generatePassword(parts[0], parts[1],parts[2]));
		}
		
		
	}
	private String generatePassword(String letras, String numeros, String especiales) {
		Random random = new Random();
        List<Character> passwordChars = new ArrayList<>();

        // Agregar obligatoriamente uno de cada tipo
        passwordChars.add(letras.charAt(random.nextInt(letras.length())));
        passwordChars.add(numeros.charAt(random.nextInt(numeros.length())));
        passwordChars.add(especiales.charAt(random.nextInt(especiales.length())));

        // Combinar letras y números para los 5 caracteres restantes
        String letrasYNumeros = letras + numeros;
        this.combinar(passwordChars, letrasYNumeros);
        // Mezclar la contraseña
        Collections.shuffle(passwordChars);
        // Construir el resultado
        StringBuilder password = new StringBuilder();
        passwordChars.stream().forEach(p -> password.append(p));

        return password.toString();
    }
	private void combinar(List<Character> passwordChars, String letrasYNumeros) {
		Random random = new Random();
        IntStream.range(0, 5)
        .mapToObj(i -> letrasYNumeros.charAt(random.nextInt(letrasYNumeros.length())))
        .forEach(passwordChars::add);
	}
	
	public static void main(String[] args) {

        new PasswordServer().startLoop(args);

    }

	

}
