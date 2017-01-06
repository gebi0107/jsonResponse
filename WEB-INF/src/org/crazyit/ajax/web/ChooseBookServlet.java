package org.crazyit.ajax.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.*;
import org.json.*;

import org.crazyit.ajax.domain.*;
import org.crazyit.ajax.service.*;

@WebServlet(urlPatterns = {"/chooseBook"})

public class ChooseBookServlet extends HttpServlet {
	
		public void service(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException
		{
			
				String idStr = (String)request.getParameter("id");
				int id = idStr == null ? 1 : Integer.parseInt(idStr);
				List<Book> books = new BookService().getBookByCategory(id);
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out = response.getWriter();
				out.println(new JSONArray(books));
			}
	}