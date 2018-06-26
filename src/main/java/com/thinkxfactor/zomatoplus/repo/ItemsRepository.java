package com.thinkxfactor.zomatoplus.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.AddItems;


public interface ItemsRepository extends JpaRepository<AddItems,Long> {

}
