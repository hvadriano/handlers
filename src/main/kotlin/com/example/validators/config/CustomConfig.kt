package com.example.validators.config

import com.example.validators.domain.enum.Product
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "configs.validation.custom-handler")
class CustomConfig {
    val products: List<Product> = mutableListOf()
}
