package com.traing.grjus.recepieproject.repositories

import com.traing.grjus.recepieproject.domain.Recipe
import org.springframework.data.repository.CrudRepository

interface RecipeRepository:CrudRepository<Recipe, Long> {
}