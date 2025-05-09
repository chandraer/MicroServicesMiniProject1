package in.sathyaIT.gateway.filter;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import jakarta.validation.constraints.AssertFalse.List;
import jakarta.ws.rs.core.HttpHeaders;
import reactor.core.publisher.Mono;
@Component
public class MyFilter implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
	
		System.out.println("filter()- executed.......");
		// Validate request
		ServerHttpRequest request=exchange.getRequest();
		org.springframework.http.HttpHeaders headers=request.getHeaders();
		Set<String>  keyset=headers.keySet();
		if (!(keyset.contains("Secret"))) {
			throw new RuntimeException("Invalid Request");
		}
//Validate with list also
		
		return chain.filter(exchange);
	}
	

}
