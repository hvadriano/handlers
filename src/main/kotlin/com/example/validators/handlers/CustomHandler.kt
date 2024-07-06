package com.example.validators.handlers

import com.example.validators.config.CustomConfig
import com.example.validators.domain.enum.Product
import com.example.validators.domain.exceptions.CustomException
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class CustomHandler(
        private val customConfig: CustomConfig
) : ValidateInterface {
    override fun validate(
            product: Product,
            params: Map<String, String>?,
            consumer: Consumer<Exception>
    ) {
        val msg = "c=${this.javaClass.simpleName}, product=${product}, params=${params}"
        consumer.accept(CustomException(msg))
    }

    override fun to(product: Product): Boolean = customConfig.products.contains(product)
}