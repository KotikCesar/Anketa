package com.controller;

//import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;


@WebServlet(name = "LoginServlet", value = "/test")
public class LoginServlet extends HttpServlet {

    private AtomicInteger a1Yes = new AtomicInteger(0);
    private AtomicInteger a1No = new AtomicInteger(0);
    private AtomicInteger a2Yes = new AtomicInteger(0);
    private AtomicInteger a2No = new AtomicInteger(0);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("jsp/index.jsp");

        resp.setContentType("text/html");

        String a1 = req.getParameter("a1");
        String a2 = req.getParameter("a2");

        if (a1.equals("yes")) {
            a1Yes.getAndIncrement();
        }
        if (a1.equals("no")) {
            a1No.getAndIncrement();
        }
        if (a2.equals("yes")) {
            a2Yes.getAndIncrement();
        }
        if (a2.equals("no")) {
            a2No.getAndIncrement();
        }

        PrintWriter pw = resp.getWriter();
        pw.println("<html><table> <tr><td>table</td> <td>yes</td> <td>no</td> </tr> <tr>" +
                "<th>Вы пыгали с парашюта</th> <td>" + a1Yes + "</td> <td>" + a1No + "</td></tr>" +
                "<tr> <th>Вы играете в шахматы</th> <td>" + a2Yes + "</td><td>" + a2No + "</td> </tr> </table></html>");
        pw.println("<html><br>Click <a href=/>here</a> to vote again. </br></html>");

    }

}
