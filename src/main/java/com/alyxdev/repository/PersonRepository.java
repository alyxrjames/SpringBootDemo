/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alyxdev.repository;

import com.alyxdev.entity.Person;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Robert
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
