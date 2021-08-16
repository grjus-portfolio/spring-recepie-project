package com.traing.grjus.recepieproject.domain

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToOne

data class UnitOfMeasure(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long,

    @OneToOne
    var uom:String) {
}