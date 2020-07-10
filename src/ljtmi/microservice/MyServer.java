package ljtmi.microservice;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.http.HttpParser.RequestHandler;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;

public class MyServer {
	
	private int port_number = 0;
	private Server server;
	private ServerConnector connector;
	private RequestHandler handler;
	private String body;
	
	public MyServer(int port_number) {
		this.port_number = port_number;
		this.server = new Server(this.port_number);
	}
	
	public int startServer() throws Exception {
        this.connector = new ServerConnector(this.server);
        connector.setPort(this.port_number);
        server.setConnectors(new Connector[] {connector});
        Server server = new Server(this.port_number);
        server.setHandler(new MyHandler());
        server.start();
        server.join();
        return 0;
	}


}  
