package com.example.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sample.entity.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails, Long> {

}
