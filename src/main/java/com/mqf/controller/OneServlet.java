package com.mqf.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //{"str":"aaa","str2":"bbb"}
        //response.setContentType("application/json;charset=utf-8");
        String json = "{\"str\":\"aaa\",\"str2\":\"bbb\"}";
        out.print(json);
        out.close();
    }
}
