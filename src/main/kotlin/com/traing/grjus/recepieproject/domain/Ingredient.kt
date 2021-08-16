package com.traing.grjus.recepieproject.domain

import java.math.BigDecimal
import javax.persistence.*

data class Ingredient(
    @Id
    @GeneratedValue
    var id: Long,
    var description: String,
    var amount: BigDecimal,
    @ManyToOne
    var recipe: Recipe,
    @OneToOne(fetch = FetchType.EAGER)
    var unitOfMeasure: UnitOfMeasure,
) {
}