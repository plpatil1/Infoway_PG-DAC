package com.app.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import com.app.bean.Student;
import com.app.dao.StudentDAO;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/regservlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Student s = new Student();
		
		int prn =Integer.parseInt(request.getParameter("txtPrn"));
		
		String name = request.getParameter("txtName");
		
		Float m1 = Float.parseFloat(request.getParameter("txtMarks1"));
		Float m2 = Float.parseFloat(request.getParameter("txtMarks2"));
		Float m3 = Float.parseFloat(request.getParameter("txtMarks3"));
		
		s.setPrn(prn);
		s.setName(name);
		s.setS1(m1);
		s.setS2(m2);
		s.setS3(m3);
		
	try {
		int status = StudentDAO.registerStudent(s);
		if(status==1) {
			response.sendRedirect("Details.html");
		}else {
			pw.write("Wrong Credentails");
			request.getRequestDispatcher("details.html").include(request, response);
			
		}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			
		
	}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
