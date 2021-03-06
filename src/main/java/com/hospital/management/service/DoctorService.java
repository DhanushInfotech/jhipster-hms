package com.hospital.management.service;

import com.hospital.management.domain.Doctor;

import java.util.List;

/**
 * Service Interface for managing Doctor.
 */
public interface DoctorService {

    /**
     * Save a doctor.
     *
     * @param doctor the entity to save
     * @return the persisted entity
     */
    Doctor save(Doctor doctor);

    /**
     *  Get all the doctors.
     *  
     *  @return the list of entities
     */
    List<Doctor> findAll();

    /**
     *  Get the "id" doctor.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    Doctor findOne(Long id);

    /**
     *  Delete the "id" doctor.
     *
     *  @param id the id of the entity
     */
    void delete(Long id);
}
