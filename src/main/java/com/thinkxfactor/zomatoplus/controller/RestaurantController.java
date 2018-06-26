	package com.thinkxfactor.zomatoplus.controller;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.AddItems;
import com.thinkxfactor.zomatoplus.models.CreateRestaurant;
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
		
		@PostMapping("/create")
		public CreateRestaurant createRestuarant(@RequestBody CreateRestaurant res) {
			restRepo.saveAndFlush(res);
			return res;
		}
		
		@PostMapping("/addItem")
		public AddItems addItems(@RequestBody AddItems item) {
			itemRepo.saveAndFlush(item);
			return item;
		}
		
		@GetMapping("/getAll")
		public List<CreateRestaurant> getAll() {
			
			return restRepo.findAll();
		}
		
		@GetMapping("/all")
		public List<AddItems> all() {
			
			return itemRepo.findAll();
		}
	
}