package com.main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

/**
 * Servlet implementation class LoginValidation
 * @param <User1>
 */
public class LoginValidation<User1> extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new user();
		user.setUsername(username);
		user.setPassword(password);
		

		HttpSession session = request.getSession();
		
		// User userFromSession = (User) request.getSession().getAttribute("user");

		DBConnection db = new DBConnection();
		Connection conn = db.getConnection();

		try {
			PreparedStatement ps = conn.prepareStatement(" SELECT * FROM login WHERE username = ? AND password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				
				if(username.equals("admin@gmail.com"))
				{
					response.sendRedirect("adminPage.jsp");
				}
				else
				{
					response.sendRedirect("home.jsp");
				}
				session.setAttribute("user", user);
			} else {
				request.getSession().setAttribute("result", "Invalid User !!");
				//request.getRequestDispatcher("index.jsp").forward(request, response);
				response.sendRedirect("index.jsp");
			}

		}	
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			db.closeConnection();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}