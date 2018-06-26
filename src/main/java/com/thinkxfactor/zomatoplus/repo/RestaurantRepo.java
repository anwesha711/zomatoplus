package com.thinkxfactor.zomatoplus.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.CreateRestaurant;

public interface RestaurantRepo extends JpaRepository<CreateRestaurant, Long>{

}
