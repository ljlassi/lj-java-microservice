package ljtmi.microservice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class MyHandler extends AbstractHandler {
	
	private String body;

    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println(request.getMethod());
        System.out.println(request.getParameter("id"));
    	response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("Got the API call.");
        System.out.println("Got the API call.");
        if (this.body != null) response.getWriter().println(this.body);
    }
	
}
