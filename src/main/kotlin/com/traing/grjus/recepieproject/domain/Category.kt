package com.traing.grjus.recepieproject.domain

import javax.persistence.*

@Entity
data class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,
    var description:String,

    @ManyToMany(mappedBy = "categories")
    var recipes:Set<Recipe>,


)
