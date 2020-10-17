package com.sample;

import com.sample.model.FlowerType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectflowerservlet",
        urlPatterns = "/SelectFlower"
)
public class SelectFlowerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String flowerType = req.getParameter("Type");

        FlowerService flowerService = new FlowerService();
        FlowerType l = FlowerType.valueOf(flowerType);

        List flowerBrands = flowerService.getAvailableFlowers(l);

        req.setAttribute("brands", flowerBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
