package client.demo;


import kz.iitu.Exception_Exception;
import kz.iitu.WebServiceTest;
import kz.iitu.WebServiceTestService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        URL url = new URL("http://alex-strix-notebook:8080/TestWBservice-1.0-SNAPSHOT/WebServiceTestService");
        QName qname = new QName("http://iitu.kz/", "WebServiceTestService");
//        Service service = Service.create(url, qname);
        Service service = Service.create(url, qname);
        WebServiceTestService webServiceTestService = new WebServiceTestService(url, qname);
        WebServiceTest webServiceTest = webServiceTestService.getWebServiceTestPort();
        try {
            out.println("<p>" +
                    webServiceTest.getString("2") +
                    "<p>");
            try {
                out.println("<p>" +
                        webServiceTest.getCityByCityName("Londo") +
                        "<p>");
            } catch (Exception e) {
                out.println(e.getLocalizedMessage());
            }
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}