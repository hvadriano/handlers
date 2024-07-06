package com.example.validators.handlers

import com.example.validators.config.CategoryConfig
import com.example.validators.config.CustomConfig
import com.example.validators.domain.enum.Product
import com.example.validators.domain.exceptions.CategoryException
import org.springframework.stereotype.Component
import java.util.function.Consumer

@Component
class CategoryHandler(
        private val categoryConfig: CategoryConfig
) : ValidateInterface {
    override fun validate(
            product: Product,
            params: Map<String, String>?,
            consumer: Consumer<Exception>
    ) {
        val msg = "c=${this.javaClass.simpleName}, product=${product}, params=${params}"
        consumer.accept(CategoryException(msg))
    }

    override fun to(product: Product): Boolean = categoryConfig.products.containsKey(product)
}