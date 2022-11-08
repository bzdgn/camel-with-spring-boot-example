package io.github.bzdgn.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MainRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:main-route")
			.routeId("main-route")
			.removeHeaders("*")
			.toD("{{person-endpoint}}")
			.log("${body}");
	}

}
