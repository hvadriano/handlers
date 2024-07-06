package com.example.validators.api

import com.example.validators.domain.enum.Product
import com.example.validators.service.ValidateService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/validate")
class ValidateController(
        private val validateService: ValidateService
) {

    @GetMapping
    fun validate() : ResponseEntity<String> {
        validateService.execute(Product.PRODUCT_A)
        return ResponseEntity.ok("foi")
    }
}