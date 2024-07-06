package com.example.validators.handlers

import com.example.validators.config.MaximumAgeConfig
import com.example.validators.domain.enum.Product
import com.example.validators.domain.exceptions.MinimunAgeException
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class MaximumAgeHandler(
        private val maximumAgeConfig: MaximumAgeConfig
) : ValidateInterface {
    override fun validate(
            product: Product,
            params: Map<String, String>?,
            consumer: Consumer<Exception>
    ) {
        val msg = "c=${this.javaClass.simpleName}, product=${product}, params=${params}"
        consumer.accept(MinimunAgeException(msg))
    }

    override fun to(product: Product): Boolean = maximumAgeConfig.products.contains(product)
}