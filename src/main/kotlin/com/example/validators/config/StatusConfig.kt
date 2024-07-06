package com.example.validators.config

import com.example.validators.domain.enum.Status
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "configs.validation.statuses")
class StatusConfig {
    val activated: List<Status> = mutableListOf()
    val inactivated: List<Status> = mutableListOf()
}
