	package com.thinkxfactor.zomatoplus.controller;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.AddItems;
import com.thinkxfactor.zomatoplus.models.Restaurant;
import com.thinkxfactor.zomatoplus.repo.ItemsRepository;
import com.thinkxfactor.zomatoplus.repo.RestaurantRepo;

import java.util.*;
	import org.springframework.web.bind.annotation.RequestParam;

	@RestController
	@RequestMapping("/restaurant")
	public class RestaurantController {
		
		@Autowired
		private RestaurantRepo restRepo;
		
		@Autowired
		private ItemsRepository itemRepo;
		
		@PostMapping("/add")
		public Restaurant createRestuarant(@RequestBody Restaurant res) {
			Restaurant persistedRestaurant = restRepo.save(res);
			return persistedRestaurant;
		}
		
		@PostMapping("/add_items")
		public AddItems addItems(@RequestBody AddItems item) {
			AddItems persistedItem = itemRepo.save(item);
			return persistedItem;
		}
		
		@GetMapping("/getAll")
		public List<Restaurant> getAll() {
			List<Restaurant> res = restRepo.findAll();
			return res;
		}
	
}