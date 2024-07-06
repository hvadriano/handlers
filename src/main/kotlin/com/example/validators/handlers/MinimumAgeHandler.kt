package com.example.validators.handlers

import com.example.validators.config.CustomConfig
import com.example.validators.config.MinimumAgeConfig
import com.example.validators.domain.enum.Product
import com.example.validators.domain.exceptions.MinimunAgeException
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class MinimumAgeHandler(
        private val minimumAgeConfig: MinimumAgeConfig
) : ValidateInterface {
    override fun validate(
            product: Product,
            params: Map<String, String>?,
            consumer: Consumer<Exception>
    ) {
        val msg = "c=${this.javaClass.simpleName}, product=${product}, params=${params}"
        consumer.accept(MinimunAgeException(msg))
    }

    override fun to(product: Product): Boolean = minimumAgeConfig.products.contains(product)
}