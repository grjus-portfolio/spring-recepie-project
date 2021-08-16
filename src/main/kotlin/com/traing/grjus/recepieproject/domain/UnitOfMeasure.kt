package com.traing.grjus.recepieproject.domain

import javax.persistence.*

@Entity
data class UnitOfMeasure(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,

    @OneToOne
    var ingredient: Ingredient

    ) {
}