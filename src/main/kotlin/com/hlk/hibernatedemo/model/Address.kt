package com.hlk.hibernatedemo.model

import javax.persistence.Entity

@Entity
class Address(
    val street: String,
    val zipCode: String,
    val city: String
) : AbstractJpaPersistable<Long>()
