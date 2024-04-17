package com.anda.admin.repo;

import com.anda.admin.entity.AdminMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMenuRepo extends JpaRepository<AdminMenuEntity, Integer>, JpaSpecificationExecutor<AdminMenuEntity> {
}
