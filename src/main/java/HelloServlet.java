import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //doGet is called when a GET request is made to the /hello path
        req.setCharacterEncoding("UTF-8"); //들어오는 데이터를 UTF-8로 해석하겠다.
        resp.setCharacterEncoding("UTF-8"); // 완성되는 HTML의 인코딩을 UTF-8로 하겠다.
        resp.setContentType("text/html; charset=UTF-8"); // 브라우저에게 우리가 만든 결과물이 UTF-8임을 알려준다.

        resp.getWriter().append("마반ddㅇddㅇ갑다");
    }
}
