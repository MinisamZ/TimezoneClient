package client.demo;


import kz.iitu.City;
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
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.List;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void generateView(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html; charset=UTF-8");

        URL url = new URL("http://alex-strix-notebook:8080/TestWBservice-1.0-SNAPSHOT/WebServiceTestService");
        QName qname = new QName("http://iitu.kz/", "WebServiceTestService");
        Service service = Service.create(url, qname);
        WebServiceTestService webServiceTestService = new WebServiceTestService(url, qname);
        WebServiceTest webServiceTest = webServiceTestService.getWebServiceTestPort();
        LocalTime localTime = LocalTime.now();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("HH:mm:ss");
        LocalTime localTime1;

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Time Conversion</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Time Conversion by Country Java Project</h1>");
        out.println("<table cellpadding=\"4\">");
        out.println("<tr>\n" +
                "        <th>Поиск</th>\n" +
                "        <th>Страна</th>\n" +
                "        <th>Часть света</th>\n" +
                "        <th>Город</th>\n" +
                "        <th>UTC</th>\n" +
                "        <th>Время сейчас</th>\n" +
                "        <th>Если в городе А то в городе Б</th>\n" +
                "    </tr>");
        out.println("<tr>");
        out.println("<form><td>");
        List<City> cities = webServiceTest.getListCity();
        out.println("<select name=\"select1\">\n");
        out.println("<option>Выберите операцию</option>\n");
        for (City city1 : cities) {
            out.println("<option value='" + city1.getCityName() + "'>" + city1.getCityName() + "</option>\n");
        }
        out.println("</select></td>");
        try {
            City city = webServiceTest.getCityByCityName(request.getParameter("select1"));
            out.println("<td>" + city.getCountryCode() + "</td>"
                            + "<td>" + city.getZoneName() + "</td>"
                            + "<td>" + city.getCityName() + "</td>"
                            + "<td>" + city.getGmtOffset() + "</td>"
                            + "<td>" + localTime.plusHours((long) Double.parseDouble(city.getGmtOffset()) - 6) + "</td>"
                            + "<td><input placeholder=\"23:05:30\" name=\"timecon\"></td>"
//                    + "<td>" + localTime.plusHours(Long.parseLong(city.getGmtOffset())) + "</td>"
            );
        } catch (Exception e) {
            out.println("<td>2</td>"
                    + "<td>3</td>"
                    + "<td>4</td>"
                    + "<td>5</td>"
                    + "<td>6</td>");
            e.printStackTrace();
        }
        out.println("</tr>");
        out.println("<tr>");
        out.println("<form><td>");
        out.println("<select name=\"select2\">\n");
        out.println("<option>Выберите операцию</option>\n");
        for (City city1 : cities) {
            out.println("<option value='" + city1.getCityName() + "'>" + city1.getCityName() + "</option>\n");
        }
        out.println("</select></td>");
        try {
            City city = webServiceTest.getCityByCityName(request.getParameter("select2"));
            City city2 = webServiceTest.getCityByCityName(request.getParameter("select1"));
            localTime1 = LocalTime.parse(request.getParameter("timecon"));
            out.println("<td>" + city.getCountryCode() + "</td>"
                    + "<td>" + city.getZoneName() + "</td>"
                    + "<td>" + city.getCityName() + "</td>"
                    + "<td>" + city.getGmtOffset() + "</td>"
                    + "<td>" + localTime.plusHours((long) Double.parseDouble(city.getGmtOffset()) - 6) + "</td>"
                    + "<td>" +
                    localTime1.plusHours((long) (Double.parseDouble(city.getGmtOffset())+ Double.parseDouble(city2.getGmtOffset())))
                    + "</td>");
        } catch (Exception e) {
            out.println("<td>2</td>"
                    + "<td>3</td>"
                    + "<td>4</td>"
                    + "<td>5</td>"
                    + "<td>6</td>");
            e.printStackTrace();
        }
        out.println("</tr>");
        out.println(" <td><input type=\"submit\" value=\"Отправить\" formmethod=\"post\"> " + "</td></form>");

        out.println("</table>");


//        Time Conversion by Country Java Project
//        try {
//            out.println("<p>" +
//                    webServiceTest.getString("2") +
//                    "<p>");
//            try {
//                out.println("<p>" +
//                        webServiceTest.getCityByCityName("Londo") +
//                        "<p>");
//            } catch (Exception e) {
//                out.println(e.getLocalizedMessage());
//            }
//        } catch (Exception_Exception e) {
//            e.printStackTrace();
//        }
        out.println("</body></html>");
    }

    public void destroy() {
    }
}