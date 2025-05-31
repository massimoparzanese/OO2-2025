package tcp.server.reply;

import java.io.PrintWriter;

public class PasswordHandler implements IMessageHandler {
	
	private PasswordGenerator passwordGenerator = new PasswordGenerator();
	public void handleMessage(String message, PrintWriter out) {
		String[] parts = message.trim().split("\\s+");
		if(parts.length != 3) {
			out.println("Error: debes enviar 3 parámetros (letras, numeros y caracteres especiales).");
        }
		else {
			out.println(passwordGenerator.generatePassword(parts[0], parts[1],parts[2]));
		}
		
	}

}
