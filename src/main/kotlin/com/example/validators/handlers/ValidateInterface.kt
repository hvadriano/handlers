package com.example.validators.handlers

import com.example.validators.domain.enum.Product
import java.util.function.Consumer

interface ValidateInterface {
    fun validate(
            product: Product,
            params: Map<String, String>?,
            consumer: Consumer<Exception>
    )

    fun to(product: Product): Boolean

    fun apply(apply: Boolean): Boolean = true
}