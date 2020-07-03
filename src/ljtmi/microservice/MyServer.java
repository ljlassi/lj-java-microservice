package ljtmi.microservice;
import org.eclipse.jetty.server.Server;

public class MyServer {
	
	private int port_number = 0;
	private Server server;
	
	public MyServer(int port_number) {
		this.port_number = port_number;
		this.server = new Server(this.port_number);
	}
}