package br.edu.insper.joaoz.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.insper.joaoz.model.DAO;
import br.edu.insper.joaoz.model.User;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String name = request.getParameter("nome");
		String password = request.getParameter("passwd");
		
		DAO dao = new DAO();
		List<User> users = dao.getUsers();
				
		boolean isUser = false;
		User newUser = null;
		
		for (User user : users) {
			if (user.getName().contentEquals(name) && user.getPasswd().contentEquals(password)) {
				isUser = true;
				newUser = user;
				
				break;
			}
		}
		
		if(isUser) {
			request.setAttribute("user", newUser);
			request.setAttribute("imp", 0);
			request.setAttribute("action", "ordena");
			request.getRequestDispatcher("view/main.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("view/index.jsp").forward(request, response);
		}
	}

}
