package com.sda;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String nameToDisplay = StringUtils.isEmpty(name) ? "Annonymous" : name;

//        if(StringUtils.isEmpty(name)){
//            nameToDisplay = "Annonymous";
//        }else{
//            nameToDisplay = name;
//        }

        PrintWriter writer = resp.getWriter();
        writer.print("<h1>Hello "  + name+ "</h1>");
    }
}
