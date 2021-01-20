package com.hlk.hibernatedemo.repository

import com.hlk.hibernatedemo.model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository : JpaRepository<Person, Long> {
    fun getByAddressStreet(street: String): Person?
}
