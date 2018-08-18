package com.openmatrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ItemController {

	@Autowired
	private ReactiveWS ws;

	@GetMapping("/inventory")
	public Mono<String> all() {
		return ws.getInventory();
	}

	@GetMapping("/order/{itemName}")
	public Mono<String> getItem(@PathVariable("itemName") String itemName) {
		return ws.getItem(itemName);
	}
}
