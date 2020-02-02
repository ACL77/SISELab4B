package cs.calc.server;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator web service is starting.");
        // initalize the instance of the remote object
        Calculator calc = new Calculator();

        // publish the object
        Endpoint.publish("http://localhost:8090/calcservice", calc);

    }
}
