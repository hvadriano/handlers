package com.example.validators.service

import com.example.validators.config.CategoryConfig
import com.example.validators.domain.enum.Product
import com.example.validators.handlers.ValidateInterface
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ValidateService(
        private val handlers: Set<ValidateInterface>
) {
    private val logger = LoggerFactory.getLogger(this.javaClass)

    fun execute(product: Product, params: Map<String, String>? = null) {
        handlers.stream().filter {
            it.to(product)
        }.filter {
            it.apply(true)
        }.forEach { handler ->
            handler.validate(
                    product,
                    params
            ) {
                logger.info(it.message)
            }
        }
    }
}