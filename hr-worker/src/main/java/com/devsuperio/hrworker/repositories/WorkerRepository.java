package com.devsuperio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
