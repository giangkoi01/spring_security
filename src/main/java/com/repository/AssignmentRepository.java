package com.repository;


import com.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment,Integer> {
    @Query("select a from Assignment a where a.router.id = ?1")
    Optional<Assignment> findAssignmentByRouterId(int id);

    @Query("select a from Assignment a where a.driver.id = ?1")
    Optional<Assignment> findAssignmentByDriverId(int id);

}

