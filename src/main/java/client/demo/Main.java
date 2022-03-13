package client.demo;

import kz.iitu.Exception_Exception;
import kz.iitu.WebServiceTest;
import kz.iitu.WebServiceTestService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        //        // создаем ссылку на wsdl описание
        URL url = new URL("http://alex-strix-notebook:8080/TestWBservice-1.0-SNAPSHOT/WebServiceTestService");
//
//        // Параметры следующего конструктора смотрим в самом первом теге WSDL описания - definitions
//        // 1-ый аргумент смотрим в атрибуте targetNamespace
//        // 2-ой аргумент смотрим в атрибуте name
        QName qname = new QName("http://iitu.kz/", "WebServiceTestService");
//
//        // Теперь мы можем дотянуться до тега service в wsdl описании,
        Service service = Service.create(url, qname);
        WebServiceTestService webServiceTestService = new WebServiceTestService(url, qname);
        WebServiceTest webServiceTest = webServiceTestService.getWebServiceTestPort();
        try {
            System.out.println(webServiceTest.getCityByCityName("Londo").getGmtOffset());
        } catch (Exception_Exception e) {
            e.printStackTrace();
        }

    }
}
