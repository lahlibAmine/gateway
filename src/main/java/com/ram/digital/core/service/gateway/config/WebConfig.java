package com.ram.digital.core.service.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;


@Configuration
public class WebConfig implements WebFluxConfigurer {

	
	@Bean
	RouterFunction<ServerResponse> routerFunction(GatewayHandler gatewayHandler) {
		return route(GET("/api/rbac/user"), gatewayHandler::getCurrentUser)
				.andRoute(GET("/private"), gatewayHandler::getPrivate);
	}
	
	
	
}

