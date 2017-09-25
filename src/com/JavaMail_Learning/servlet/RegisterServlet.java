package com.JavaMail_Learning.servlet;

import com.JavaMail_Learning.domain.User;
import com.JavaMail_Learning.service.UserService;
import com.JavaMail_Learning.service.impl.UserServiceImpl;
import com.JavaMail_Learning.utils.UUIDUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        UserService userService = new UserServiceImpl();

        try {
            //接受数据
            String usermail = request.getParameter("usermail");
            //封装数据
            User user = new User();
            user.setEmail(usermail);
            user.setState(0);    //0 未激活，1 激活
            String code = UUIDUtils.getUUID() + UUIDUtils.getUUID();
            user.setCode(code);
            //调用业务层处理数据
            if (userService.isExist(user)) {
                request.setAttribute("msg", "您注册的用户已存在！");
                request.getRequestDispatcher("/msg.jsp").forward(request, response);
            } else {
                userService.regist(user);
            }

            //页面跳转
            request.setAttribute("msg", "您已注册成功，请前往邮箱激活！");
            request.getRequestDispatcher("/msg.jsp").forward(request, response);


        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
