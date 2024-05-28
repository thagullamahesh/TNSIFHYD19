package com.si.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Placement;
import com.si.demo.repository.PlacementRepository;



	
	
	@Service
	public class PlacementServiceImpl implements PlacementService {
		
		
		@Autowired
	    private PlacementRepository placementRepository;

		@Override
		public Placement savePlacement(Placement placement) {
			return placementRepository.save(placement);
		}

		@Override
		public List<Placement> fetchPlacementList() {
			return placementRepository.findAll();
		}

		@Override
		public Placement fetchPlacementById(Long id) {
			return placementRepository.findById(id).get();
		}

		@Override
		public void deletePlacementById(Long id) {
		
			
			 placementRepository.deleteById(id);
			
		}
		

}
