import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer{

	@Override
	public void handleMessage(String message, PrintWriter out) {
		String[] parts = message.trim().split(",");
		if(parts.length != 3 && parts.length != 2) {
			out.println("Error: debes enviar al menos dos parametros(cadena a repetir y numero de veces)");
        }
		else {
			String delim = parts.length == 2 ? this.getDelimeter() : parts[2];
			out.println(this.generateString(parts[0], parts[1],delim));
		}
		
	}
	
	private String generateString(String succession, String number, String delimeter) {
		if(!checkSuccession(succession))
			return "Debe proporcionarse una cadena de texto como primer parámetro";
		if(!isValidInteger(number))
			return "El segundo parámetro debe ser un numero entero > 0";
		succession+=delimeter;
		return succession.repeat(Integer.parseInt(number));
	}
	private boolean checkSuccession(String succession) {
		return (succession != null && !succession.isEmpty());
	}
	 private boolean isValidInteger(String input) {
	        try {
	            int number = Integer.parseInt(input);
	            return number > 0; // ejemplo de validación adicional
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	private String getDelimeter() {
		return " ";
	}
	public static void main(String[] args) {

        new RepeatServer().startLoop(args);

    }

}
