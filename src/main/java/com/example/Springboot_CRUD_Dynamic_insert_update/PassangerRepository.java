package com.example.Springboot_CRUD_Dynamic_insert_update;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger,Integer>{

}
