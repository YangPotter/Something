package com.JavaMail_Learning.servlet;

import com.JavaMail_Learning.domain.User;
import com.JavaMail_Learning.service.UserService;
import com.JavaMail_Learning.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        try {
            String delmail = request.getParameter("delmail");

            User user = new User();
            user.setEmail(delmail);

            UserService userService = new UserServiceImpl();
            userService.delete(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("delete operation");
        }
    }
}
