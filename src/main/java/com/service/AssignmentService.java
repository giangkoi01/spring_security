package com.service;


import com.DTO.AssignmentDTO;
import com.entity.Assignment;
import com.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssignmentService {

    @Autowired
    AssignmentRepository assignmentRepository;

    @Autowired
    DriverService driverService;

    @Autowired
    RouterService routerService;

    public List<Assignment> getAll(){
        return assignmentRepository.findAll();
    }

    public Assignment insert(AssignmentDTO assignmentDTO) {
        Assignment assignment = new Assignment();
        assignment.setDriver(driverService.findById(assignmentDTO.getDriver_id()));
        assignment.setRouter(routerService.findRouterId(assignmentDTO.getRouter_id()));
        assignment.setTurnNumber(assignmentDTO.getTurnNumber());
        assignmentRepository.save(assignment);
        return assignment;
    }

    public AssignmentDTO update(AssignmentDTO assignmentDTO){
        Optional<Assignment> optionalCategory = assignmentRepository.findById(assignmentDTO.getId());
        if (optionalCategory.isPresent()) {
            Assignment assignment = optionalCategory.get();
            assignment.setDriver(driverService.findById(assignmentDTO.getDriver_id()));
            assignment.setRouter(routerService.findRouterId(assignmentDTO.getRouter_id()));
            assignment.setTurnNumber(assignmentDTO.getTurnNumber());
            assignmentRepository.save(assignment);
        }
        return assignmentDTO;

    }

    public Assignment findById(int id){
        Optional<Assignment> optional = assignmentRepository.findById(id);
        if(optional.isPresent()) {
            Assignment assignment = optional.get();
            return assignment;
        }
        return null;
    }

    public Assignment deleteById(int id){
        Optional<Assignment> optional = assignmentRepository.findById(id);
        if (optional.isPresent()) {
            Assignment entity = optional.get();
            assignmentRepository.delete(entity);
            return entity;
        } else {
            return null;
        }
    }

    public Assignment deleteByDriverId(int id){
        Optional<Assignment> optional = assignmentRepository.findAssignmentByDriverId(id);
        if (optional.isPresent()) {
            Assignment entity = optional.get();
            assignmentRepository.delete(entity);
            return entity;
        } else {
            return null;
        }
    }

    public Assignment deleteByRouterId(int id){
        Optional<Assignment> optional = assignmentRepository.findAssignmentByRouterId(id);
        if (optional.isPresent()) {
            Assignment entity = optional.get();
            assignmentRepository.delete(entity);
            return entity;
        } else {
            return null;
        }
    }
}

