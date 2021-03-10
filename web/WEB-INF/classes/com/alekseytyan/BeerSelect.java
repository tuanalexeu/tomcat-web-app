package com.alekseytyan;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class BeerSelect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException, ServletException {

        String c = request.getParameter("color");
        BeerExpert be = new BeerExpert();
        List<String> result = be.getBrands(c);

        request.setAttribute("styles", result);
        RequestDispatcher view =
                request.getRequestDispatcher("result/result.jsp");
        view.forward(request, response);
    }
}
