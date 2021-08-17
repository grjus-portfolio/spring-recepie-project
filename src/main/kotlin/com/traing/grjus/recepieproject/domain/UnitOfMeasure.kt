package com.traing.grjus.recepieproject.domain

import javax.persistence.*

@Entity
data class UnitOfMeasure(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,

    @OneToOne
    val ingredient: Ingredient,

    val description:String
    ) {
}