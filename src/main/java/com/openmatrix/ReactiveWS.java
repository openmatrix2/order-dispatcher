package com.openmatrix;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class ReactiveWS {

	@Value("${inventory.url}")
	private String inventoryUrl;
	
	private WebClient client;

	public Mono<String> getInventory() {
		client = WebClient.create(inventoryUrl);
		return client.get().uri("/inventory").exchange().flatMap(res -> res.bodyToMono(String.class));
	}

	public Mono<String> getItem(String itemName) {
		client = WebClient.create(inventoryUrl);
		return client.get().uri("/checkinventory/{itemName}", itemName).exchange()
				.flatMap(res -> res.bodyToMono(String.class));
	}
}
