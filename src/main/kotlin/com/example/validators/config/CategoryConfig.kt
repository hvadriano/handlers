package com.example.validators.config

import com.example.validators.domain.enum.Category
import com.example.validators.domain.enum.Product
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "configs.validation.category-handler")
class CategoryConfig {
    val products: Map<Product, List<Category>> = hashMapOf()
}
