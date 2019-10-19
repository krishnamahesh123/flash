package org.jsp.appp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
		urlPatterns = { "/test7" }, 
		initParams = { 
				@WebInitParam(name = "access", value = "80")
		})
public class test7 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
    public test7() {
        super();
        // TODO Auto-generated constructor stub
    }


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	ServletConfig conn = getServletConfig();
	String ac=conn.getInitParameter("access");
	System.out.println(ac);
	PrintWriter pw = response.getWriter();
	pw.println(ac);
	}

}
