package com.traing.grjus.recepieproject.repositories

import com.traing.grjus.recepieproject.domain.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository:CrudRepository<Category, Long> {
}