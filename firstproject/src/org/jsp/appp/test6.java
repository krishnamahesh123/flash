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
		urlPatterns = { "/test6" }, 
		initParams = { 
				@WebInitParam(name = "mobile", value = "70")
		})
public class test6 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   
    public test6() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		ServletConfig conn = getServletConfig();
		String mob =conn.getInitParameter("mobile");
		System.out.println(mob);
		PrintWriter pw = response.getWriter();
		pw.println(mob);
	}

}
