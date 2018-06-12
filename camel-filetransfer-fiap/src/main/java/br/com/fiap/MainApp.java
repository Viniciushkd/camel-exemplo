package br.com.fiap;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {

	public static void main(String[] args) {
		SimpleRouteBuilder simpleRouteBuilder = new SimpleRouteBuilder();
		CamelContext context = new DefaultCamelContext();
		try {
			context.addRoutes(simpleRouteBuilder);
			context.start();
			Thread.sleep(5 * 60 * 1000);
			context.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
