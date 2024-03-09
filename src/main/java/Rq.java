import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest req; // final을 붙이면 생성자에서 초기화를 해줘야 한다.
    private final HttpServletResponse resp;
    public Rq(HttpServletRequest req, HttpServletResponse resp) { // 생성자
        this.req = req; // this.req는 필드, req는 파라미터
        this.resp = resp;

        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=UTF-8");
    }


    //   dan=5&limit=8 / dan, limit 파람 name 이고 5,8 파람 value
    public int getIntParam(String paramName, int defaultValue) {
        String value = req.getParameter(paramName); // 요청한다

        if (value == null) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) { // 숫자로 변환할 수 없는 경우
            return defaultValue; // 기본값을 리턴한다.
        }
    }


    public void appendBody(String str) { // 응답한다
        try {
            resp.getWriter().append(str);
        } catch (IOException e) {
            throw new RuntimeException(e); // 예외를 던진다.
        }
    }
}
