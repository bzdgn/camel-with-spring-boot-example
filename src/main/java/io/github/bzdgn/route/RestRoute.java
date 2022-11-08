package io.github.bzdgn.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		rest("/consumed")
			.get("/persons")
			.to("direct:main-route");
		
		restConfiguration()
			.component("jetty")
			.port(8090);
	}

}
