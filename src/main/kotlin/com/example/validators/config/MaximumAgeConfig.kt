package com.example.validators.config

import com.example.validators.domain.enum.Product
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.util.*

@Component
@ConfigurationProperties(prefix = "configs.validation.maximum-age-handler")
class MaximumAgeConfig {
    val products: Map<Product, Int> = EnumMap(Product::class.java)
}
