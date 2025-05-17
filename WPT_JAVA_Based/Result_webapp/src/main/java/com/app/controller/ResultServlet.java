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
 * Servlet implementation class ResultServlet
 */

public class ResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResultServlet() {
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
		
		int prn = Integer.parseInt(request.getParameter("prn"));
		
		try {
			Student s  = StudentDAO.getStudentByPrn(prn);
			pw.write("<html><body><table border='1'>");
			pw.write("<tr><th>PRN</th><th>Name</th><th>Marks1</th><th>Marks2</th><th>Marks3</th></tr>");
			pw.write("<tr><td>"+s.getPrn()+"</td></td>"+s.getName()+"</td><td>"+s.getS1()+"</td><td>"+s.getS2()+"</td><td>"+s.getS3()+"</td");
			pw.write("</tr></table></body></html>");
			
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
