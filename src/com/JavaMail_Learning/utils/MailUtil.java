package com.JavaMail_Learning.utils;


import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/*
 * 发送邮件方法
 * to 给谁发送
 * code 激活码
 */
public class MailUtil {
    public static void sendMail(String to, String code) throws Exception {
        // 收件人电子邮箱
        // 发件人电子邮箱
        String from = "taitogether@163.com";

        // 指定发送邮件的主机为 localhost
        String host = "smtp.163.com";

        // 获取系统属性
        Properties properties = System.getProperties();

        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.timeout", "80000");
        properties.setProperty("mail.user", "taitogether@163.com");
        properties.setProperty("mail.password", "taitogether221");

        try{
            // 获取默认session对象
            Session session = Session.getDefaultInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("taitogether@163.com", "taitogether221");
                }
            });
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);

            // Set From: 设置发件人
            message.setFrom(new InternetAddress(from));

            // Set To: 设置收件人
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));

            // Set Subject: 头部头字段
            message.setSubject("帐号激活！");

            // 设置消息体
            String content = "<html><head></head><body><h1>这是一封激活邮件,激活请点击以下链接</h1><h3><a href='http://localhost:8080/test2-1/ActiveServlet?code="
                    + code + "'>http://localhost:8080/test2-1/ActiveServlet?code=" + code
                    + "</a></h3></body></html>";
            message.setContent(content, "text/html;charset=UTF-8");

            /*
             * 作者：SnDragon
             *   链接：http://www.jianshu.com/p/8f8d7a46888f
             * 來源：简书
             * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
             */
            // 发送消息
            Transport.send(message);
            System.out.println("邮件发送成功！");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
