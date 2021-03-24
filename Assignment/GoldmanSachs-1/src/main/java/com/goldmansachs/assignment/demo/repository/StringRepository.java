package com.goldmansachs.assignment.demo.repository;

import com.goldmansachs.assignment.demo.domain.StringObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StringRepository extends JpaRepository<StringObj, String> {
}
