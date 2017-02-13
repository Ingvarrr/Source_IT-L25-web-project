import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by vig on 1/27/17.
 */
public class PetyaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter()
                .append("<html>")
                .append("<head>")
                .append("<title>myServlet</title>")
                .append("</head>")
                .append("<body>")
                .append("<p>This is my first servlet!!!)</p>")
                .append("<p><b>text</b></p>")
                .append("</body>")
                .append("</html>");
        resp.sendRedirect("index.jsp");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println(config.getServletName());
        System.out.println(config.getInitParameterNames());
        System.out.println(config.getInitParameter("myParam"));
    }
}
