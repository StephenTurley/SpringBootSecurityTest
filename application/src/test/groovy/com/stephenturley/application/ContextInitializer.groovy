package com.stephenturley.application

import com.stephenturley.application.ExampleConfiguration
import geb.spock.GebReportingSpec
import org.springframework.boot.test.IntegrationTest
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration

@ContextConfiguration(loader = SpringApplicationContextLoader.class, classes = ExampleConfiguration.class)
@WebAppConfiguration
@IntegrationTest
class ContextInitializer extends GebReportingSpec {
}