package tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class ServerThread extends HttpServlet {
    public static final String JSON_RESPONSE_STARTING = "{\n" ;
    public static final String SLACK_USERNAME = "\"slackUsername\": " + "Reagan, ";
    public static final boolean BACKEND = true;
    public static final int AGE = 28;
    public static final String BIO = ", \"bio\": I am Reagan, a passionate junior backend engineer with java language" +
                                        " who has an eye for details \n";
    public static final String JSON_RESPONSE_ENDING = "}";
    public static final String RESPONSE =  JSON_RESPONSE_STARTING + SLACK_USERNAME + "\"backend\": " + BACKEND +
                                            ", \"age\": " + AGE + BIO + JSON_RESPONSE_ENDING;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        resp.addHeader("Access-Control-Allow-Origin", "*");
        resp.addHeader("Access-Control-Allow-Methods", " GET, OPTIONS");
        resp.addHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers," +
                " Authorization, X-Requested-With");
        resp.setStatus(200);
            PrintWriter out = new PrintWriter(resp.getOutputStream(), true);
            out.println("<p>" + RESPONSE + "</p>");

    }
}
