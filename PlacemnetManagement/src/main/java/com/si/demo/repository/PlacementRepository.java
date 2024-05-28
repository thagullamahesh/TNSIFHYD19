package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long> {

}
