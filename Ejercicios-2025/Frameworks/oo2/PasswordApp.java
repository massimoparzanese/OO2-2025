
import tcp.server.reply.PasswordHandler;
import tcp.server.reply.SingleConnectionHandler;
import tcp.server.reply.TCPControlLoop;

public class PasswordApp {

	
	public static void main (String []args) {
		new TCPControlLoop(new SingleConnectionHandler(new PasswordHandler())).startLoop(args);
	}
}
