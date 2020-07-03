package ljtmi.microservice;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class MyServer {
	
	private int port_number = 0;
	private Server server;
	private ServerConnector connector;
	
	public MyServer(int port_number) {
		this.port_number = port_number;
		this.server = new Server(this.port_number);
	}
	
	public int startServer() throws Exception {
        this.connector = new ServerConnector(this.server);
        connector.setPort(this.port_number);
        server.setConnectors(new Connector[] {connector});
        return 0;
	}
}