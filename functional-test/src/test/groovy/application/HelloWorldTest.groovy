package com.stephenturley.application

class HelloWorldTest extends ContextInitializer{
    def "should render the BetaRequest page"(){
        setup:
            to HelloWorldPage
    }
}
