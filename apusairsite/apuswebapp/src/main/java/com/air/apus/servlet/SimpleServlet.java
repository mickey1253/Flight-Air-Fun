package com.air.apus.servlet;

import com.air.apus.service.SimpleService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 505007855 on 2/10/2017.
 */
public class SimpleServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String serviceDesc = SimpleService.getServiceDescription();
        out.println(serviceDesc);
        out.flush();
        out.close();

    }

}
