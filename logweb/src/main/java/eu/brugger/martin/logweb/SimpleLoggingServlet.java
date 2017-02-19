package eu.brugger.martin.logweb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleLoggingServlet extends HttpServlet {

    private static final Logger JUL_LOGGER = Logger.getLogger(SimpleLoggingServlet.class.getName());

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        JUL_LOGGER.log(Level.WARNING, "warning message");
        JUL_LOGGER.log(Level.INFO, "info message");
        JUL_LOGGER.log(Level.FINE, "fine message");
        PrintWriter writer = response.getWriter();
        writer.println("<html>Hello, I am a Java servlet!</html>");
        writer.flush();
    }
}
