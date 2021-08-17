package com.traing.grjus.recepieproject.repositories

import com.traing.grjus.recepieproject.domain.UnitOfMeasure
import org.springframework.data.repository.CrudRepository


interface UnitOfMeasureRepository :CrudRepository<UnitOfMeasure, Long>{
    fun findByDescription(description:String): UnitOfMeasure?

}