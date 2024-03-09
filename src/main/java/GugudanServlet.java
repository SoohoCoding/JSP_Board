import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Rq rq = new Rq(req, resp); // Rq 객체를 생성한다.

        int dan = rq.getIntParam("dan",0); // req.getParameter()는 String을 리턴하기 때문에 Integer.parseInt()로 변환해준다. (요청한다)
        int limit = rq.getIntParam("limit",0);  // req.getParameter()는 String을 리턴하기 때문에 Integer.parseInt()로 변환해준다. (요청한다)

        resp.getWriter().append("<h1>%d단</h1>".formatted(dan)); // %d에 dan을 넣어준다. (응답해준다)
        for (int i = 1; i < limit; i++) {
            resp.getWriter().append("<div>%d * %d = %d</div>".formatted(dan, i, dan * i)); // %d에 dan, i, dan * i를 넣어준다. (응답해준다)
        }

    }
}
