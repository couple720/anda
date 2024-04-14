package com.example.demo1.repo;

import com.example.demo1.entity.AdminMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMenuRepo extends JpaRepository<AdminMenuEntity, Integer>, JpaSpecificationExecutor<AdminMenuEntity> {
}
