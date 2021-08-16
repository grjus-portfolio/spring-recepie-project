package com.traing.grjus.recepieproject.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,
    var description:String,
    @ManyToMany
    var recipes:Set<Recipe>,


)
