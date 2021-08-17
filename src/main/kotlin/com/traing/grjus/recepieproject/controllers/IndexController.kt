package com.traing.grjus.recepieproject.controllers

import com.traing.grjus.recepieproject.repositories.CategoryRepository
import com.traing.grjus.recepieproject.repositories.UnitOfMeasureRepository
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController (
    val categoryRepository: CategoryRepository,
    val unitOfMeasureRepository: UnitOfMeasureRepository
) {

    @RequestMapping("","/","/index","index.html")
    fun getIndexPage():String{
        val categoryOptional = categoryRepository.findByDescription("American")
        val unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon")
        println("Category id is: ${categoryOptional?.id}")
        println("Unit of measure ids is: ${unitOfMeasureOptional?.id}")

        return "index"
    }
}