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
		urlPatterns = { "/test4" }, 
		initParams = { 
				@WebInitParam(name = "cloth", value = "60")
		})
public class test4 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    
    public test4() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		
		ServletConfig coff = getServletConfig();
		String dis = coff.getInitParameter("cloth");
		System.out.println(dis);
		PrintWriter pw = response.getWriter();
		pw.println(dis);
		
		
	}

}
