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

/*
 * 用于用户激活的servlet
 */
@WebServlet("/ActiveServlet")
public class ActiveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        try {
            //接受激活码
            String code = request.getParameter("code");
            //根据激活码查询用户
            UserService userService = new UserServiceImpl();
            User user = userService.findByCode(code);
            if (user != null) {
                //查询到，修改用户状态
                user.setCode("");
                userService.update(user);

            } else {
                //未查询到
                request.setAttribute("msg", "您的激活码有误，请重新激活！");
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            request.setAttribute("msg", "您已激活成功！");
            request.getRequestDispatcher("/msg.jsp").forward(request, response);
        }
    }
}
