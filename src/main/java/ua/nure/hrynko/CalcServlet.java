package ua.nure.hrynko;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {

    private static final Log LOG = LogFactory.getLog(CalcServlet.class);

    @Override
    public void init() {

        //new JULConfig();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        LOG.debug("CalcServlet#doGet");

        String xAsString = request.getParameter("x");
        LOG.trace("x => " + xAsString);

        String yAsString = request.getParameter("y");
        LOG.trace("y => " + yAsString);

        double x, y;
        try {
            x = Double.valueOf(xAsString);
            y = Double.valueOf(yAsString);
        } catch (NumberFormatException ex) {
            LOG.error(ex.getMessage());
            getServletContext().getRequestDispatcher("/WEB-INF/error.jsp").forward(request, response);
            return;
        }

        double res = 0;

        String op = request.getParameter("op");
        LOG.trace("op => " + op);

//        switch (op) {
//            case "+":
//                res = Calc.Add(x, y);
//                break;
//            case "-":
//                res = Calc.Sub(x, y);
//                break;
//            case "*":
//                res = Calc.Mul(x, y);
//                break;
//            case "/":
//                res = Calc.Div(x, y);
//                break;
//       }

        LOG.trace("res => " + res);
        request.setAttribute("res", res);

        getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}