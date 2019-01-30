package com.nisheeth.demo.repo;

import com.nisheeth.demo.entity.AEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ARepository extends JpaRepository<AEntity, Long> {
}
